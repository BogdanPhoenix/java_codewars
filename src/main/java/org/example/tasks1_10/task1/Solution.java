package org.example.tasks1_10.task1;

import java.util.stream.IntStream;

public class Solution {
    private static final int START_NUM = 3;

    public int solution(int number) {
        return IntStream.range(START_NUM, number)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .sum();
    }
}