package org.example.tasks21_30.task25;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuilderTest {

    @ParameterizedTest
    @MethodSource("testSource")
    void testFindNb(long input, long expected) {
        assertEquals(expected, Builder.findNb(input));
    }

    private static Stream<Arguments> testSource() {
        return Stream.of(
                Arguments.of(1071225L, 45),
                Arguments.of(4183059834009L, 2022),
                Arguments.of(24723578342962L, -1),
                Arguments.of(91716553919377L, -1),
                Arguments.of(135440716410000L, 4824),
                Arguments.of(40539911473216L, 3568)
        );
    }

}
