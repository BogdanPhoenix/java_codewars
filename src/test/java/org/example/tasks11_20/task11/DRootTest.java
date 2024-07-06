package org.example.tasks11_20.task11;

import org.example.tasks11_20.task11.DRoot;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DRootTest {
    @ParameterizedTest
    @MethodSource("values")
    void test(int input, int expected) {
        assertEquals(expected, DRoot.digitalRoot(input));
    }

    private static Stream<Arguments> values() {
        return Stream.of(
                Arguments.of(16, 7),
                Arguments.of(456, 6),
                Arguments.of(942, 6),
                Arguments.of(132189, 6),
                Arguments.of(493193, 2)
        );
    }
}
