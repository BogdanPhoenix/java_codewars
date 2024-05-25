package org.example.task14;

public class BitCounting {
    private BitCounting() {}

    public static int countBits(int n){
        int count = 0;

        while (n > 0) {
            count += n & 1;
            n >>>= 1;
        }

        return count;
    }
}
