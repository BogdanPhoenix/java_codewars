package org.example.tasks1_10.task3;

import org.example.tasks1_10.task3.HumanReadableTime;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HumanReadableTimeTest {
    @ParameterizedTest
    @MethodSource("values")
    void Tests(String expected, int seconds) {
        assertEquals(expected, HumanReadableTime.makeReadable(seconds));
    }

    private static Stream<Arguments> values() {
        return Stream.of(
                Arguments.of("00:00:00", 0),
                Arguments.of("00:00:05", 5),
                Arguments.of("00:01:00", 60),
                Arguments.of("23:59:59", 86399),
                Arguments.of("99:59:59", 359999)
        );
    }
}
