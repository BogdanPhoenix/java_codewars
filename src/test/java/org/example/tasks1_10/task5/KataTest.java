package org.example.tasks1_10.task5;

import org.example.tasks1_10.task5.Kata;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @ParameterizedTest
    @MethodSource("values")
    void Tests(String expected, String input) {
        assertEquals(expected, Kata.firstNonRepeatingLetter(input), String.format("For input \"%s\"", input));
    }

    private static Stream<Arguments> values() {
        return Stream.of(
                Arguments.of("a", "a"),
                Arguments.of("t", "streSS"),
                Arguments.of("-", "moon-men"),
                Arguments.of("", "moonmoon"),
                Arguments.of("L", "I Like To Take Candy From A Baby"),
                Arguments.of("R", "RaaNnQqUcScjnSNmqUmQjp")
        );
    }
}
