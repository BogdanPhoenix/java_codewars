package org.example.tasks21_30.task25;

public class Builder {

    private Builder() {}

    public static long findNb(long m) {
        long n = 0;
        long sum = 0;

        while (sum < m) {
            n++;
            sum += (long) Math.pow(n, 3);
        }

        return sum == m ? n : -1;
    }

}
