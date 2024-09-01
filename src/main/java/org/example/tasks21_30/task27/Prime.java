package org.example.tasks21_30.task27;

public class Prime {

    private static final int STEP = 2;

    private Prime() {}

    public static boolean isPrime(int num) {
        if(num == 2) {
            return true;
        } else if(num < 2 || num % 2 == 0) {
            return false;
        }

        int start = 3;
        int end = (int) Math.sqrt(num);

        while (start <= end) {
            if(num % start == 0 || num % end == 0) {
                return false;
            }

            start += STEP;
            end -= STEP;
        }

        return true;
    }

}
