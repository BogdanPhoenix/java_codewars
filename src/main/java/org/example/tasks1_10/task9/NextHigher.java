package org.example.tasks1_10.task9;

public class NextHigher {
    private NextHigher() {}

    public static int nextHigher(int number) {
        int higher = number;
        int countTrailingZeros = 0;
        int countOnes = 0;

        while (((higher & 1) == 0) && (higher != 0)) {
            countTrailingZeros++;
            higher >>= 1;
        }

        while ((higher & 1) == 1) {
            countOnes++;
            higher >>= 1;
        }

        int positionNonTrailingZero = countTrailingZeros + countOnes;
        number = (number | (1 << positionNonTrailingZero)) & -(1 << positionNonTrailingZero);
        number |= (1 << (countOnes - 1)) - 1;

        return number;
    }
}
