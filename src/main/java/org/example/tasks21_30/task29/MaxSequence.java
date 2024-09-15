package org.example.tasks21_30.task29;

public class MaxSequence {

    private MaxSequence() {}

    public static int improvedVersionSequence(int[] arr) {
        if(arr.length == 0) {
            return 0;
        }

        int currentSum = 0;
        int maxSum = 0;

        for (int num : arr) {
            currentSum = Math.max(0, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

//##################################################################################//

    public static int simpleVersionSequence(int[] arr) {
        if(arr.length == 0) {
            return 0;
        }

        int max = 0;

        for(int i = 0; i < arr.length; i++) {
            int subArrayMax = getSubArrayMax(arr, i, arr.length);
            max = Math.max(max, subArrayMax);
        }

        return max;
    }

    private static int getSubArrayMax(final int[] arr, int start, int end) {
        int sum = 0;
        int subMax = 0;

        for(int i = start; i < end; i++) {
            sum += arr[i];
            subMax = Math.max(subMax, sum);
        }

        return subMax;
    }

}
