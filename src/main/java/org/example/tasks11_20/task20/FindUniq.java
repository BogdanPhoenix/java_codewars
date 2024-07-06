package org.example.tasks11_20.task20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindUniq {
    private FindUniq() {}

//    public static double findUniq(double[] arr) {
//        return Arrays.stream(arr)
//                .boxed()
//                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
//                .entrySet().stream()
//                .filter(e -> e.getValue() == 1)
//                .map(Map.Entry::getKey)
//                .findFirst()
//                .orElseThrow();
//    }

    public static double findUniq(double[] arr) {
        Map<Double, Integer> map = new HashMap<>();

        for(var val : arr) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        for(var entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return Integer.MIN_VALUE;
    }
}
