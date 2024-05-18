package org.example.task6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigInteger;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @ParameterizedTest
    @MethodSource("values")
    void Tests(int expected, String num, String degree) {
        assertEquals(expected, Kata.lastDigit(new BigInteger(num), new BigInteger(degree)));
    }

    private static Stream<Arguments> values() {
        return Stream.of(
                Arguments.of(8, "2", "7"),
                Arguments.of(4, "4", "1"),
                Arguments.of(6, "4", "2"),
                Arguments.of(9, "9", "7")
        );
    }
}
