package de.qcademy.junitassertionspractice;

import java.util.Arrays;

public class StringUtils {

    public String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public String capitalize(String str) {
        if (str == null) {
            return null;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public String concatenate(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return null;
        }
        return str1 + str2;
    }

    public String[] splitIntoWords(String str) {
        if (str == null) {
            return new String[0];
        }

        String[] words = str.split("\\s+");

        return Arrays.stream(words)
                .filter(word -> !word.isEmpty())
                .toArray(String[]::new);
    }
}
