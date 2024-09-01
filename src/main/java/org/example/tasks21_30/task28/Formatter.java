package org.example.tasks21_30.task28;

import java.util.ArrayDeque;
import java.util.Deque;

public class Formatter {

    private static final int NUMBER_SYSTEM = 10;

    private Formatter() {}

    public static String expandedForm(int sum) {
        if(sum >= 0 && sum <= 9) {
            return String.valueOf(sum);
        }

        int discharge = 0;
        Deque<String> stack = new ArrayDeque<>();

        while (sum > 0) {
            int num = sum % NUMBER_SYSTEM;

            if (num != 0) {
                int expandedNum = num * (int) Math.pow(NUMBER_SYSTEM, discharge);
                stack.push(String.valueOf(expandedNum));
            }

            sum /= NUMBER_SYSTEM;
            ++discharge;
        }

        return String.join(" + ", stack);
    }

}
