package org.example.tasks11_20.task12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Kata {
    private Kata() {}

    public static int[] arrayDiff(int[] a, int[] b) {
        if(a.length == 0 || b.length == 0) {
            return a;
        }

        Set<Integer> set = new HashSet<>();
        for(var el : b) {
            set.add(el);
        }

        return Arrays.stream(a)
                .filter(el -> !set.contains(el))
                .toArray();
    }
}
