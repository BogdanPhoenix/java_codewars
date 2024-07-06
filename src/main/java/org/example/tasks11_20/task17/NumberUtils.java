package org.example.tasks11_20.task17;

public class NumberUtils {
    private NumberUtils() {}

    public static boolean isNarcissistic(int number) {
        String numStr = Integer.toString(number);
        int numDigits = numStr.length();
        int sum = 0;

        for (char digitChar : numStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            sum += (int) Math.pow(digit, numDigits);
        }

        return sum == number;
    }
}
