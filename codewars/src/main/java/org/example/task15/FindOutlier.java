package org.example.task15;

public class FindOutlier {
    private FindOutlier() {}

    public static int find(int[] integers) {
        int countEven = 0;
        int even = 0;
        int odd = 0;

        for(int integer : integers) {
            if(integer % 2 == 0) {
                countEven++;
                even = integer;
            } else {
                odd = integer;
            }
        }

        return countEven == 1 ? even : odd;
    }
}
