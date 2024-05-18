package org.example.task7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {
    @ParameterizedTest
    @MethodSource("valuesToRoman")
    void testToRoman(String expected, int digitNum) {
        assertEquals(expected, RomanNumerals.toRoman(digitNum));
    }

    private static Stream<Arguments> valuesToRoman() {
        return Stream.of(
                Arguments.of("I", 1),
                Arguments.of("II", 2),
                Arguments.of("MM", 2000),
                Arguments.of("MDCLXVI", 1666),
                Arguments.of("LXXXVI", 86)
        );
    }

    @ParameterizedTest
    @MethodSource("valuesToDigit")
    void testFromRoman(int expected, String romanNum) {
        assertEquals(expected, RomanNumerals.fromRoman(romanNum));
    }

    private static Stream<Arguments> valuesToDigit() {
        return Stream.of(
                Arguments.of(1, "I"),
                Arguments.of(2, "II"),
                Arguments.of(2000, "MM"),
                Arguments.of(1666, "MDCLXVI"),
                Arguments.of(86, "LXXXVI")
        );
    }
}
