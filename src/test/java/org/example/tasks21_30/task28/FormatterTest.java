package org.example.tasks21_30.task28;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormatterTest {

    @ParameterizedTest
    @MethodSource("testSource")
    void testExpandedForm(int input, String expected) {
        assertEquals(expected, Formatter.expandedForm(input));
    }

    private static Stream<Arguments> testSource() {
        return Stream.of(
                Arguments.of(12, "10 + 2"),
                Arguments.of(42, "40 + 2"),
                Arguments.of(70304, "70000 + 300 + 4"),
                Arguments.of(60520, "60000 + 500 + 20")
        );
    }

}
