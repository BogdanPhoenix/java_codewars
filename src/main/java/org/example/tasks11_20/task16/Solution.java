package org.example.tasks11_20.task16;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    private Solution() {}

    public static String toCamelCase(String s){
        var words = s.split("[_\\W]+");

        return IntStream.range(0, words.length)
                .mapToObj(i -> i == 0 ? words[i] : toUpperCase(words[i]))
                .collect(Collectors.joining());
    }

    private static String toUpperCase(String s){
        if(s == null || s.isBlank()) {
            return s;
        }

        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}
