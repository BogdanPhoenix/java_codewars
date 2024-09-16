package org.example.tasks31_40.task31;

import java.util.Arrays;

public class Solution {

    private Solution() {}

    public static long nextBiggerNumber(long n) {
        char[] digits = String.valueOf(n).toCharArray();
        int i = digits.length - 1;

        while (i > 0 && digits[i - 1] >= digits[i]) {
            i--;
        }

        if (i == 0) {
            return -1;
        }

        int j = digits.length - 1;
        while (digits[j] <= digits[i - 1]) {
            j--;
        }

        swap(digits, i - 1, j);

        Arrays.sort(digits, i, digits.length);

        try {
            return Long.parseLong(new String(digits));
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
