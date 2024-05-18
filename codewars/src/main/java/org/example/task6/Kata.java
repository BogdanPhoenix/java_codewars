package org.example.task6;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kata {
    private static final Map<Integer, List<Integer>> CYCLES = new HashMap<>();

    static {
        CYCLES.put(0, List.of(0));
        CYCLES.put(1, List.of(1));
        CYCLES.put(2, List.of(2, 4, 8, 6));
        CYCLES.put(3, List.of(3, 9, 7, 1));
        CYCLES.put(4, List.of(4, 6));
        CYCLES.put(5, List.of(5));
        CYCLES.put(6, List.of(6));
        CYCLES.put(7, List.of(7, 9, 3, 1));
        CYCLES.put(8, List.of(8, 4, 2, 6));
        CYCLES.put(9, List.of(9, 1));
    }

    private Kata() {}

    public static int lastDigit(BigInteger n1, BigInteger n2) {
        if(n2.equals(BigInteger.ZERO)) {
            return 1;
        }

        int lastDigit = n1.mod(BigInteger.TEN).intValue();
        List<Integer> values = CYCLES.get(lastDigit);
        int index = n2.mod(BigInteger.valueOf(values.size()))
                .subtract(BigInteger.ONE)
                .mod(BigInteger.valueOf(values.size()))
                .intValue();

        return values.get(index);
    }
}
