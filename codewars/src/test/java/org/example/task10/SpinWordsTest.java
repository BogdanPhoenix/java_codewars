package org.example.task10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpinWordsTest {
    @ParameterizedTest
    @MethodSource("values")
    void spinTest(String input, String expected) {
        assertEquals(expected, new SpinWords().spinWords(input));
    }

    private static Stream<Arguments> values() {
        return Stream.of(
                Arguments.of("Hey fellow warriors", "Hey wollef sroirraw"),
                Arguments.of("This is a test", "This is a test"),
                Arguments.of("This is another test", "This is rehtona test"),
                Arguments.of("Welcome", "emocleW"),
                Arguments.of("Hey fellow warriors", "Hey wollef sroirraw")
        );
    }
}
