package org.example.task3;

public class HumanReadableTime {
    private static final int ONE_HOUR = 3600;
    private static final int ONE_MINUTE = 60;

    private HumanReadableTime() {}

    public static String makeReadable(int seconds) {
        int hours = seconds / ONE_HOUR;
        seconds = seconds % ONE_HOUR;
        int minutes = seconds / ONE_MINUTE;
        seconds = seconds % ONE_MINUTE;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
