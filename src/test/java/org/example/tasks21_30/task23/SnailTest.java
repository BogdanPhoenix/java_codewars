package org.example.tasks21_30.task23;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SnailTest {

    @ParameterizedTest
    @MethodSource("testSource")
    void test(int[][] input, int[] expected) {
        int[] actual = Snail.snail(input);

        assertThat(actual)
                .hasSize(expected.length)
                .containsExactly(expected);
    }

    private static Stream<Arguments> testSource() {
        return Stream.of(
                Arguments.of(new int[][] {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}}, new int[] {1, 2, 3, 6, 9, 8, 7, 4, 5}),
                Arguments.of(new int[][] {{1, 2, 3, 1},
                        {4, 5, 6, 4},
                        {7, 8, 9, 7},
                        {7, 8, 9, 7}}, new int[] {1, 2, 3, 1, 4, 7, 7, 9, 8, 7, 7, 4, 5, 6, 9, 8})
        );
    }

}
