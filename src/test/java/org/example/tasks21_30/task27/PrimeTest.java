package org.example.tasks21_30.task27;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeTest {

    @ParameterizedTest
    @MethodSource("testSource")
    void testIsPrime(int input, boolean expected) {
        assertEquals(expected, Prime.isPrime(input));
    }

    private static Stream<Arguments> testSource() {
        return Stream.of(
                Arguments.of(-41, false),
                Arguments.of(-8, false),
                Arguments.of(-5, false),
                Arguments.of(-1, false),
                Arguments.of(0, false),
                Arguments.of(1, false),
                Arguments.of(2, true),
                Arguments.of(3, true),
                Arguments.of(4, false),
                Arguments.of(5, true),
                Arguments.of(6, false),
                Arguments.of(7, true),
                Arguments.of(8, false),
                Arguments.of(9, false),
                Arguments.of(41, true),
                Arguments.of(45, false),
                Arguments.of(73, true),
                Arguments.of(75, false),
                Arguments.of(121, false),
                Arguments.of(5099, true),
                Arguments.of(Integer.MAX_VALUE - 1, false),
                Arguments.of(Integer.MAX_VALUE, true)
        );
    }

}
