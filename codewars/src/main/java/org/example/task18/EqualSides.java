package org.example.task18;

import java.util.Arrays;

public class EqualSides {
    private EqualSides() {}

    public static int findEvenIndex(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        int leftSum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum -= arr[i];

            if(sum == leftSum) {
                return i;
            }

            leftSum += arr[i];
        }

        return -1;
    }
}
