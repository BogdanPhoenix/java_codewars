package org.example.tasks21_30.task23;

import java.util.ArrayList;
import java.util.List;

public class Snail {

    private Snail() {}

    public static int[] snail(int[][] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }

        List<Integer> result = new ArrayList<>();
        MatrixInfo matrixInfo = new MatrixInfo(array);

        while (matrixInfo.top <= matrixInfo.bottom && matrixInfo.left <= matrixInfo.right) {
            traverseRight(array, result, matrixInfo);
            matrixInfo.nextTop();

            traverseDown(array, result, matrixInfo);
            matrixInfo.prevRight();

            if (matrixInfo.isTraverseLeft()) {
                traverseLeft(array, result, matrixInfo);
                matrixInfo.prevBottom();
            }

            if (matrixInfo.isTraverseTop()) {
                traverseTop(array, result, matrixInfo);
                matrixInfo.nextLeft();
            }
        }

        return result.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    private static void traverseRight(int[][] array, List<Integer> result, MatrixInfo matrixInfo) {
        for(int i = matrixInfo.left; i <= matrixInfo.right; i++) {
            result.add(array[matrixInfo.top][i]);
        }
    }

    private static void traverseDown(int[][] array, List<Integer> result, MatrixInfo matrixInfo) {
        for (int i = matrixInfo.top; i <= matrixInfo.bottom; i++) {
            result.add(array[i][matrixInfo.right]);
        }
    }

    private static void traverseLeft(int[][] array, List<Integer> result, MatrixInfo matrixInfo) {
        for (int i = matrixInfo.right; i >= matrixInfo.left; i--) {
            result.add(array[matrixInfo.bottom][i]);
        }
    }

    private static void traverseTop(int[][] array, List<Integer> result, MatrixInfo matrixInfo) {
        for (int i = matrixInfo.bottom; i >= matrixInfo.top; i--) {
            result.add(array[i][matrixInfo.left]);
        }
    }

    private static class MatrixInfo {

        int top;
        int left;
        int bottom;
        int right;

        MatrixInfo(int[][] array) {
            this.top = 0;
            this.left = 0;
            this.bottom = array.length - 1;
            this.right = array[0].length - 1;
        }

        void nextTop() {
            this.top++;
        }

        void prevBottom() {
            this.bottom--;
        }

        void nextLeft() {
            this.left++;
        }

        void prevRight() {
            this.right--;
        }

        boolean isTraverseLeft() {
            return this.top <= this.bottom;
        }

        boolean isTraverseTop() {
            return this.left <= this.right;
        }

    }

}
