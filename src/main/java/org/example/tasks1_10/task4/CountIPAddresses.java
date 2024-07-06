package org.example.tasks1_10.task4;

public class CountIPAddresses {
    private static final int MAX_IP_OCTET = 256;

    private CountIPAddresses() {}

    public static long ipsBetween(String start, String end) {
        String[] startIp = start.split("\\.");
        String[] endIp = end.split("\\.");
        long result = 0;
        int length = startIp.length - 1;

        for (int i = 0; i <= length; i++) {
            long value = Long.parseLong(endIp[i]) - Long.parseLong(startIp[i]);
            result += (long) (value * Math.pow(MAX_IP_OCTET, length - i));
        }

        return result;
    }
}
