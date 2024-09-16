package org.example.tasks31_40.task31;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("testSource")
    void testSolution(long input, long expected) {
        assertEquals(expected, Solution.nextBiggerNumber(input));
    }

    private static Stream<Arguments> testSource() {
        return Stream.of(
                Arguments.of(12, 21),
                Arguments.of(513, 531),
                Arguments.of(2017, 2071),
                Arguments.of(414, 441),
                Arguments.of(144, 414),
                Arguments.of(10990, 19009),
                Arguments.of(9, -1),
                Arguments.of(111, -1),
                Arguments.of(531, -1)
        );
    }

}
