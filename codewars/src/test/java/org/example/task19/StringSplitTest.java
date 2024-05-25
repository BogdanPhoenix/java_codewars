package org.example.task19;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringSplitTest {
    @ParameterizedTest
    @MethodSource("values")
    void testSplit(String expected, String input) {
        assertEquals(expected, Arrays.toString(StringSplit.solution(input)));
    }

    private static Stream<Arguments> values() {
        return Stream.of(
                Arguments.of("[ab, cd, ef]", "abcdef"),
                Arguments.of("[He, ll, oW, or, ld]", "HelloWorld"),
                Arguments.of("[ab, cd, e_]", "abcde"),
                Arguments.of("[Lo, ve, Pi, zz, a_]", "LovePizza")
        );
    }
}
