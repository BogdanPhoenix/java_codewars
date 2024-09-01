package org.example.tasks21_30.task26;

import java.util.*;

public class BraceChecker {

    private static final Map<Character, Character> BRACKETS;

    static {
        BRACKETS = new HashMap<>();

        BRACKETS.put('(', ')');
        BRACKETS.put('{', '}');
        BRACKETS.put('[', ']');
    }

    public boolean isValid(String braces) {
        Deque<Character> stack = new ArrayDeque<>();

        for(char c : braces.toCharArray()) {
            if(BRACKETS.containsKey(c)) {
                stack.push(c);
                continue;
            }

            if(stack.isEmpty()) {
                return false;
            }

            if(BRACKETS.get(stack.pop()) != c) {
                return false;
            }
        }

        return stack.isEmpty();
    }

}
