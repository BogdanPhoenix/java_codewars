package org.example.task15;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindOutlierTest {
    @ParameterizedTest
    @MethodSource("values")
    void sampleTests(int expected, int[] input) {
        assertEquals(expected, FindOutlier.find(input));
    }

    private static Stream<Arguments> values() {
        return Stream.of(
                Arguments.of(3, new int[] {2, 6, 8, -10, 3}),
                Arguments.of(206847684, new int[] {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}),
                Arguments.of(0, new int[] {Integer.MAX_VALUE, 0, 1}),
                Arguments.of(11, new int[] {2, 4, 0, 100, 4, 11, 2602, 36}),
                Arguments.of(160, new int[] {160, 3, 1719, 19, 11, 13, -21})
        );
    }
}
