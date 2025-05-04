package com.java.book.string;

import java.util.Objects;

public class StringHavingUniqueChars {

    public static void main(String[] args) {
        boolean uniqueFlag = isUnique("aa");
        System.out.printf("string having unique chars: %s%n", uniqueFlag);
    }

    private static Boolean isUnique(String str) {
        if (Objects.isNull(str)) {
            return null;
        }
        int length = str.length();
        if (length < 2) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
