package org.example.task19;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSplit {
    private static final Pattern PATTERN = Pattern.compile("..");

    private StringSplit() {}

    public static String[] solution(String s) {
        Matcher matcher = PATTERN.matcher(s);
        List<String> matches = new ArrayList<>();

        while (matcher.find()) {
            matches.add(matcher.group());
        }

        if (s.length() % 2 != 0) {
            matches.add(s.substring(s.length() - 1) + "_");
        }

        return matches.toArray(String[]::new);
    }
}
