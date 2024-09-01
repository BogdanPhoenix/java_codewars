package org.example.tasks21_30.task26;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BraceCheckerTest {

    private final BraceChecker braceChecker = new BraceChecker();

    @ParameterizedTest
    @MethodSource("testSource")
    void testValidBrace(String input, boolean expected) {
        assertEquals(expected, braceChecker.isValid(input));
    }

    private static Stream<Arguments> testSource() {
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("(){}[]", true),
                Arguments.of("([{}])", true),
                Arguments.of(")[{}])", false),
                Arguments.of("(((({{", false),
                Arguments.of("(}", false),
                Arguments.of("[(])", false),
                Arguments.of("[({})](]", false)
        );
    }

}
