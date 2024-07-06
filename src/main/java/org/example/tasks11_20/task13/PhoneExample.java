package org.example.tasks11_20.task13;

public class PhoneExample {
    private PhoneExample() {}

    public static String createPhoneNumber(int[] numbers) {
        if (numbers == null || numbers.length != 10) {
            throw new IllegalArgumentException("Input array must contain exactly 10 integers.");
        }

        StringBuilder builder = new StringBuilder("(");

        for(int i = 0; i < numbers.length; i++) {
            builder.append(numbers[i]);

            if(i == 2) {
                builder.append(") ");
            } else if (i == 5) {
                builder.append("-");
            }
        }

        return builder.toString();
    }
}
