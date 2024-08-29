package org.example.tasks21_30.task22;

public class FindMissingLetter {

    private FindMissingLetter() {}

    public static char findMissingLetter(char[] array) throws IllegalArgumentException {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array length must be at least 2");
        }

        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] + 1 != array[i + 1]) {
                return (char) (array[i] + 1);
            }
        }

        throw new IllegalArgumentException("No missing letter found");
    }

}
