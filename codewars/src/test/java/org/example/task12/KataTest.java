package org.example.task12;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KataTest {
    @ParameterizedTest
    @MethodSource("values")
    void testKata(int[] input1, int[] input2, int[] expected) {
        assertArrayEquals(expected, Kata.arrayDiff(input1, input2));
    }

    private static Stream<Arguments> values() {
        return Stream.of(
                Arguments.of(new int [] {1,2}, new int[] {1}, new int[] {2}),
                Arguments.of(new int [] {1,2,2}, new int[] {1}, new int[] {2, 2}),
                Arguments.of(new int [] {1,2,2}, new int[] {2}, new int[] {1}),
                Arguments.of(new int [] {1,2,2}, new int[] {}, new int[] {1,2,2}),
                Arguments.of(new int [] {}, new int[] {1,2}, new int[] {})
        );
    }
}
