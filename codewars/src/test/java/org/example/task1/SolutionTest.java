package org.example.task1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("usernameValues")
    void test(int expected, int number) {
        assertEquals(expected, new Solution().solution(number));
    }

    private static Stream<Arguments> usernameValues() {
        return Stream.of(
                Arguments.of(23, 10),
                Arguments.of(143, 25),
                Arguments.of(168, 26),
                Arguments.of(0, 3)
        );
    }
}
