package org.example.tasks21_30.task22;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FindMissingLetterTest {

    @ParameterizedTest
    @MethodSource("testSource")
    void findMissingLetter(char[] input, char expected) {
        assertEquals(expected, FindMissingLetter.findMissingLetter(input));
    }

    private static Stream<Arguments> testSource() {
        return Stream.of(
                Arguments.of(new char[] { 'a','b','c','d','f' }, 'e'),
                Arguments.of(new char[] { 'O','Q','R','S' }, 'P')
        );
    }

    @Test
    void findMissingLetterThrowIllegalArgumentExceptionWhenArrayLengthIsLessThanTwo() {
        char[] array = new char[1];
        assertThrows(IllegalArgumentException.class, () -> FindMissingLetter.findMissingLetter(array));
    }

    @Test
    void findMissingLetterThrowIllegalArgumentExceptionWhenNoMissingLetterFound() {
        char[] array = new char[] { 'a','b','c','d'};
        assertThrows(IllegalArgumentException.class, () -> FindMissingLetter.findMissingLetter(array));
    }

}
