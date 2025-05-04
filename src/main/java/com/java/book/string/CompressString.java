package com.java.book.string;

import java.util.Objects;

public class CompressString {
    public static void main(String[] args) {
        String compressedStr = compress("aba43zswruiwerwerweeeeeeeeeeeeeeey");
        System.out.printf("compress string: %s%n", compressedStr);
    }

    private static String compress(String a) {
        if (Objects.isNull(a)) {
            return a;
        }
        int charCount = 1;
        char[] charArr = a.toCharArray();
        char chartToCompress = charArr[0];
        StringBuilder compressedSb = new StringBuilder(a.length());
        compressedSb.append(charArr[0]);
        for (int i = 1; i < charArr.length; i++) {
            if (charArr[i] == chartToCompress) {
                charCount++;
            } else {
                compressedSb.append(charCount);
                chartToCompress = charArr[i];
                charCount = 1;
                compressedSb.append(chartToCompress);
            }
        }
        compressedSb.append(charCount);
        String compressedStr = compressedSb.toString();
        return compressedStr.length() < a.length() ? compressedStr : a;
    }
}
