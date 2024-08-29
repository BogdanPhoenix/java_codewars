package org.example.tasks21_30.task21;

public class PigLatin {

    private PigLatin() {}

    public static String pigIt(String str) {
        return str.replaceAll("(\\b\\w)(\\w*\\b)", "$2$1ay");
    }

}
