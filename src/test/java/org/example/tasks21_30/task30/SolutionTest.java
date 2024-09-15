package org.example.tasks21_30.task30;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("testSource")
    void testRangeExtraction(int[] input, String expected) {
        assertEquals(expected, Solution.rangeExtraction(input));
    }

    private static Stream<Arguments> testSource() {
        return Stream.of(
                Arguments.of(new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}, "-6,-3-1,3-5,7-11,14,15,17-20"),
                Arguments.of(new int[] {-6,-3,-1,3,17,18,20}, "-6,-3,-1,3,17,18,20"),
                Arguments.of(new int[] {-3,-2,-1,0,1}, "-3-1"),
                Arguments.of(new int[] {-3,-2,-1,2,10,15,16,18,19,20}, "-3--1,2,10,15,16,18-20")
        );
    }

}
