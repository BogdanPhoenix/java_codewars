package org.example.tasks21_30.task23;

public class Snail {

    private Snail() {}

    public static int[] snail(int[][] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }

        int[] result = new int[array.length * array[0].length];
        int index = 0;
        int top = 0;
        int left = 0;
        int bottom = array.length - 1;
        int right = array[0].length - 1;

        while (index < result.length) {
            for(int i = left; i <= right; i++) {
                result[index++] = array[top][i];
            }
            ++top;
            for(int i = top; i <= bottom; i++) {
                result[index++] = array[i][right];
            }
            --right;
            for(int i = right; i >= left; i--) {
                result[index++] = array[bottom][i];
            }
            --bottom;
            for(int i = bottom; i >= top; i--) {
                result[index++] = array[i][left];
            }
            ++left;
        }

        return result;
    }

}
