package org.example.tasks21_30.task24;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {

    private TimeFormatter() {}

    public static String formatDuration(long seconds) {
        if (seconds < 0) {
            throw new IllegalArgumentException("Duration must be non-negative");
        }

        if (seconds == 0) {
            return "now";
        }

        CustomDuration duration = new CustomDuration(seconds);
        List<String> parts = new ArrayList<>();

        addUnit(parts, duration.years, "year");
        addUnit(parts, duration.days, "day");
        addUnit(parts, duration.hours, "hour");
        addUnit(parts, duration.minutes, "minute");
        addUnit(parts, duration.seconds, "second");

        return joinParts(parts);
    }

    private static void addUnit(List<String> parts, long value, String unit) {
        if (value > 0) {
            parts.add(value + " " + unit + (value > 1 ? "s" : ""));
        }
    }

    private static String joinParts(List<String> parts) {
        int size = parts.size();

        if (size == 1) {
            return parts.get(0);
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < size; i++) {
            if (i > 0) {
                result.append(i == size - 1 ? " and " : ", ");
            }
            result.append(parts.get(i));
        }
        return result.toString();
    }

    private static class CustomDuration {
        static final int YEAR_DAYS = 365;

        final long years;
        final long days;
        final long hours;
        final long minutes;
        final long seconds;

        CustomDuration(long seconds) {
            Duration duration = Duration.ofSeconds(seconds);

            this.years = duration.toDaysPart() / YEAR_DAYS;
            this.days = duration.toDaysPart() % YEAR_DAYS;
            this.hours = duration.toHoursPart();
            this.minutes = duration.toMinutesPart();
            this.seconds = duration.toSecondsPart();
        }
    }

}
