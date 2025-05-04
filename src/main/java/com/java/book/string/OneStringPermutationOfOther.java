package com.java.book.string;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class OneStringPermutationOfOther {

    public static void main(String[] args) {
        boolean isPermutation = isPermutation("ab", "ababaa");
        System.out.printf("string b permutation of a: %s%n", isPermutation);
    }

    private static Boolean isPermutation(String a, String b) {
        if (Objects.isNull(a) || Objects.isNull(b)) {
            return null;
        }
        Set<Character> setOfSecStr = new HashSet<>();
        for (int i = 0; i < b.length(); i++) {
            setOfSecStr.add(b.charAt(i));
        }
        for (int i = 0; i < a.length(); i++) {
            if (!setOfSecStr.contains(a.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
