package org.example.task7;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {
    private static final Map<String, Integer> ROMAN_TO_INTEGER = new LinkedHashMap<>();
    private static final Map<Integer, String> INTEGER_TO_ROMAN = new LinkedHashMap<>();

    static {
        ROMAN_TO_INTEGER.put("CM", 900);
        ROMAN_TO_INTEGER.put("CD", 400);
        ROMAN_TO_INTEGER.put("XC", 90);
        ROMAN_TO_INTEGER.put("XL", 40);
        ROMAN_TO_INTEGER.put("IX", 9);
        ROMAN_TO_INTEGER.put("IV", 4);
        ROMAN_TO_INTEGER.put("M", 1000);
        ROMAN_TO_INTEGER.put("D", 500);
        ROMAN_TO_INTEGER.put("C", 100);
        ROMAN_TO_INTEGER.put("L", 50);
        ROMAN_TO_INTEGER.put("X", 10);
        ROMAN_TO_INTEGER.put("V", 5);
        ROMAN_TO_INTEGER.put("I", 1);

        INTEGER_TO_ROMAN.put(1000, "M");
        INTEGER_TO_ROMAN.put(900, "CM");
        INTEGER_TO_ROMAN.put(500, "D");
        INTEGER_TO_ROMAN.put(400, "CD");
        INTEGER_TO_ROMAN.put(100, "C");
        INTEGER_TO_ROMAN.put(90, "XC");
        INTEGER_TO_ROMAN.put(50, "L");
        INTEGER_TO_ROMAN.put(40, "XL");
        INTEGER_TO_ROMAN.put(10, "X");
        INTEGER_TO_ROMAN.put(9, "IX");
        INTEGER_TO_ROMAN.put(5, "V");
        INTEGER_TO_ROMAN.put(4, "IV");
        INTEGER_TO_ROMAN.put(1, "I");
    }

    private RomanNumerals() {}

    public static String toRoman(int n) {
        StringBuilder builder = new StringBuilder();

        for (var entry : INTEGER_TO_ROMAN.entrySet()) {
            while (n >= entry.getKey()) {
                builder.append(entry.getValue());
                n -= entry.getKey();
            }
        }

        return builder.toString();
    }

    public static int fromRoman(String romanNumeral) {
        int result = 0;

        for (var entry : ROMAN_TO_INTEGER.entrySet()) {
            while (romanNumeral.contains(entry.getKey())) {
                result += entry.getValue();
                romanNumeral = romanNumeral.replaceFirst(entry.getKey(), "");
            }
        }

        return result;
    }
}