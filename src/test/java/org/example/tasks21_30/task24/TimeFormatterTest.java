package org.example.tasks21_30.task24;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TimeFormatterTest {

    @ParameterizedTest
    @MethodSource("testSource")
    void testFormatDuration(int input, String expected) {
        assertEquals(expected, TimeFormatter.formatDuration(input));
    }

    private static Stream<Arguments> testSource() {
        return Stream.of(
                Arguments.of(0, "now"),
                Arguments.of(1, "1 second"),
                Arguments.of(62, "1 minute and 2 seconds"),
                Arguments.of(120, "2 minutes"),
                Arguments.of(3600, "1 hour"),
                Arguments.of(7200, "2 hours"),
                Arguments.of(3602, "1 hour and 2 seconds"),
                Arguments.of(3662, "1 hour, 1 minute and 2 seconds"),
                Arguments.of(31536000, "1 year"),
                Arguments.of(31708800, "1 year and 2 days"),
                Arguments.of(31726800, "1 year, 2 days and 5 hours"),
                Arguments.of(31536020, "1 year and 20 seconds")
        );
    }

    @Test
    void testNegativeValueSeconds() {
        assertThrows(IllegalArgumentException.class, () -> TimeFormatter.formatDuration(-10));
    }

}
