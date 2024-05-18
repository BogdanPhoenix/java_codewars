package org.example.task2;

public class RgbToHex {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 255;

    private RgbToHex() {}

    public static String rgb(int r, int g, int b) {
        return convertIntToHex(r) + convertIntToHex(g) + convertIntToHex(b);
    }

    private static String convertIntToHex(int value) {
        if(value <= MIN_VALUE) {
            return "00";
        } else if(value >= MAX_VALUE) {
            return "FF";
        }

        return String.format("%02X", value);
    }
}
