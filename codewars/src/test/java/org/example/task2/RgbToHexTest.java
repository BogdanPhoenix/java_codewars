package org.example.task2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RgbToHexTest {
    @ParameterizedTest
    @MethodSource("values")
    void sampleTests(String expected, int red, int green, int blue) {
        assertEquals(expected, RgbToHex.rgb(red, green, blue), String.format("For input: (%d, %d, %d)", red, green, blue));
    }

    private static Stream<Arguments> values() {
        return Stream.of(
                Arguments.of("000000", 0, 0, 0),
                Arguments.of("010203", 1, 2, 3),
                Arguments.of("FFFFFF", 255, 255, 255),
                Arguments.of("FEFDFC", 254, 253, 252),
                Arguments.of("00FF7D", -20, 275, 125)
        );
    }
}
