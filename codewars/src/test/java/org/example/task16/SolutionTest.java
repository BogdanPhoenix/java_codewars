package org.example.task16;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("values")
    void test(String expected, String input) {
        assertEquals(expected, Solution.toCamelCase(input));
    }

    private static Stream<Arguments> values() {
        return Stream.of(
                Arguments.of("theStealthWarrior", "the_Stealth_Warrior"),
                Arguments.of("theStealthWarrior", "the-Stealth-Warrior"),
                Arguments.of("TheStealthWarrior", "The_Stealth-Warrior")
        );
    }
}
