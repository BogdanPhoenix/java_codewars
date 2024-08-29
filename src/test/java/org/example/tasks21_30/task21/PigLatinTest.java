package org.example.tasks21_30.task21;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PigLatinTest {

    @ParameterizedTest
    @MethodSource("testSource")
    void testPigIt(String input, String expected) {
        assertEquals(expected, PigLatin.pigIt(input));
    }

    private static Stream<Arguments> testSource() {
        return Stream.of(
                Arguments.of("Pig latin is cool", "igPay atinlay siay oolcay"),
                Arguments.of("This is my string", "hisTay siay ymay tringsay")
        );
    }

}
