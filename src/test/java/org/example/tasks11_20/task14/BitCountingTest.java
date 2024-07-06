package org.example.tasks11_20.task14;

import org.example.tasks11_20.task14.BitCounting;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BitCountingTest {
    @ParameterizedTest
    @MethodSource("values")
    void test(int input, int expected) {
        assertEquals(expected, BitCounting.countBits(input));
    }

    private static Stream<Arguments> values() {
        return Stream.of(
                Arguments.of(1234, 5),
                Arguments.of(4, 1),
                Arguments.of(7, 3),
                Arguments.of(9, 2),
                Arguments.of(10, 2)
        );
    }
}
