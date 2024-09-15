package org.example.tasks21_30.task29;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxSequenceTest {

    @ParameterizedTest
    @MethodSource("testSource")
    void testImprovedVersionSequence(int[] input, int expected) {
        assertEquals(expected, MaxSequence.improvedVersionSequence(input));
    }

    @ParameterizedTest
    @MethodSource("testSource")
    void testSimpleVersionSequence(int[] input, int expected) {
        assertEquals(expected, MaxSequence.simpleVersionSequence(input));
    }

    private static Stream<Arguments> testSource() {
        return Stream.of(
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{2, 3, -8, 7, -1, 2, 3}, 11),
                Arguments.of(new int[]{-2, -4}, 0),
                Arguments.of(new int[]{5, 4, 1, 7, 8}, 25),
                Arguments.of(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6)
        );
    }

}
