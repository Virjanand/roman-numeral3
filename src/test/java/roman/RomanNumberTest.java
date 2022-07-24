package roman;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumberTest {

    @ParameterizedTest(name = "{0} -> {1}")
    @CsvSource({
            "1, I",
            "2, II",
    })
    void convertArabicToRoman(int arabicNumber, String expectedRomanString) {
        RomanNumber romanNumber = new RomanNumber(arabicNumber);
        assertThat(romanNumber.toRoman()).isEqualTo(expectedRomanString);
    }
}
