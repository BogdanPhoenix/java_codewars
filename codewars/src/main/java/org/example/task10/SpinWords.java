package org.example.task10;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    private static final int WORD_LENGTH = 5;

    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");

        return Arrays.stream(words)
                .map(this::reverse)
                .collect(Collectors.joining(" "));
    }

    private String reverse(String word) {
        if (word.length() >= WORD_LENGTH) {
            return new StringBuilder(word).reverse().toString();
        }
        return word;
    }
}
