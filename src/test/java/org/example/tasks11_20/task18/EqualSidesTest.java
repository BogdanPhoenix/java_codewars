package org.example.tasks11_20.task18;

import org.example.tasks11_20.task18.EqualSides;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EqualSidesTest {
    @ParameterizedTest
    @MethodSource("values")
    void testEquals(int expected, int[] input) {
        assertEquals(expected, EqualSides.findEvenIndex(input));
    }

    private static Stream<Arguments> values() {
        return Stream.of(
                Arguments.of(3, new int[] {1,2,3,4,3,2,1}),
                Arguments.of(1, new int[] {1,100,50,-51,1,1}),
                Arguments.of(-1, new int[] {1,2,3,4,5,6}),
                Arguments.of(3, new int[] {20,10,30,10,10,15,35}),
                Arguments.of(-1, new int[] {-8505, -5130, 1926, -9026}),
                Arguments.of(1, new int[] {2824, 1774, -1490, -9084, -9696, 23094}),
                Arguments.of(6, new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4})
        );
    }
}
