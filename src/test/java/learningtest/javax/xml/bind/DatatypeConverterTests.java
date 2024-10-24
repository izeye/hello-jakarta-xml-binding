package learningtest.javax.xml.bind;

import jakarta.xml.bind.DatatypeConverter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link DatatypeConverter}.
 *
 * @author Johnny Lim
 */
class DatatypeConverterTests {

    @Test
    void parseHexBinary() {
        byte[] bytes = DatatypeConverter.parseHexBinary("00011011ff");
        assertThat(bytes).containsExactly(0, 1, 16, 17, -1);
    }

}
