package org.example.tasks1_10.task9;

import org.example.tasks1_10.task9.NextHigher;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NextHigherTest {
    @ParameterizedTest
    @MethodSource("values")
    void basicTests(int input, int expected) {
        assertEquals(expected, NextHigher.nextHigher(input));
    }

    private static Stream<Arguments> values() {
        return Stream.of(
                Arguments.of(128, 256),
                Arguments.of(1, 2),
                Arguments.of(1022, 1279),
                Arguments.of(127, 191),
                Arguments.of(1253343, 1253359)
        );
    }
}