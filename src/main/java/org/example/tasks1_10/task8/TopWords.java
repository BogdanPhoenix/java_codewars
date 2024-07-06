package org.example.tasks1_10.task8;

import java.util.*;
import java.util.stream.Collectors;

public class TopWords {
    private TopWords() {}

    public static List<String> top3(String text) {
        String[] words = text.toLowerCase()
                .replaceAll("[^a-zA-Z']", " ")
                .split("\\s+");

        Map<String, Long> map = Arrays.stream(words)
                .filter(word -> !word.isBlank() && word.matches(".*[a-zA-Z]+.*"))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        return map.entrySet()
                .stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .limit(3)
                .map(Map.Entry::getKey)
                .toList();
    }
}
