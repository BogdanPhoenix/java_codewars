package org.example.tasks21_30.task30;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private Solution() {}

    public static String rangeExtraction(int[] arr) {
        List<String> list = new ArrayList<>();
        int index = 0;

        while (index < arr.length) {
            int endIndex = getEndRangeIndex(arr, index);

            if(index == endIndex) {
                list.add(String.valueOf(arr[index]));
            }
            else if(arr[endIndex] - arr[index] >= 2) {
                list.add(arr[index] + "-" + arr[endIndex]);
            }
            else {
                list.add(String.valueOf(arr[index]));
                list.add(String.valueOf(arr[endIndex]));
            }
            index = endIndex + 1;
        }

        return String.join(",", list);
    }

    private static int getEndRangeIndex(int[] arr, int start) {
        while (start < arr.length - 1 && arr[start] + 1 == arr[start + 1]) {
            ++start;
        }

        return start;
    }

}
