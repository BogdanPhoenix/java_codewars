package org.example.task8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

class TopWordsTest {
    @Test
    void containsExactlyTest() {
        assertThat(TopWords.top3("'a 'A 'a' a'A' a'a'!")).isIn(List.of("'a", "a'a'", "'a'"), List.of("a'a'", "'a", "'a'"));
    }

    @ParameterizedTest
    @MethodSource("valuesContains")
    void containsExactlyTest(String[] expected, String input) {
        assertThat(TopWords.top3(input)).containsExactly(expected);
    }

    private static Stream<Arguments> valuesContains() {
        return Stream.of(
                Arguments.of(new String[] {"e", "d", "a"}, "a a a  b  c c  d d d d  e e e e e"),
                Arguments.of(new String[] {"e", "ddd", "aa"}, "e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"),
                Arguments.of(new String[] {"won't", "wont"}, "  //wont won't won't "),
                Arguments.of(new String[] {"e"}, "  , e   .. "),
                Arguments.of(new String[] {"a", "of", "on"}, """
                             In a village of La Mancha, the name of which I have no desire to call to
                             mind, there lived not long since one of those gentlemen that keep a lance
                             in the lance-rack, an old buckler, a lean hack, and a greyhound for
                             coursing. An olla of rather more beef than mutton, a salad on most
                             nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra
                             on Sundays, made away with three-quarters of his income.""")
        );
    }

    @ParameterizedTest
    @MethodSource("valuesEmpty")
    void emptyTest(String input) {
        assertThat(TopWords.top3(input)).isEmpty();
    }

    private static Stream<Arguments> valuesEmpty() {
        return Stream.of(
                Arguments.of("  ...  "),
                Arguments.of("  '  "),
                Arguments.of("  '''  ")
        );
    }
}
