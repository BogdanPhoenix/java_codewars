package org.example.tasks1_10.task5;

import java.util.LinkedHashMap;
import java.util.Map;

public class Kata {
    private Kata() {}

    public static String firstNonRepeatingLetter(String s){
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            char lower = Character.toLowerCase(c);
            map.put(lower, map.getOrDefault(lower, 0) + 1);
        }

        for(char c : s.toCharArray()){
            char lower = Character.toLowerCase(c);
            if(map.get(lower) == 1){
                return String.valueOf(c);
            }
        }

        return "";
    }
}