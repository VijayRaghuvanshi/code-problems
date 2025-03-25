package com.java.leetcode;

public class PalindromeString {

    public static void main(String[] args) {
        PalindromeString obj = new PalindromeString();
        System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String s) {

        if (s == null) {
            return false;
        }
        String alphaNumericStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (alphaNumericStr.length() <= 1) {
            return true;
        }
        char[] arr = alphaNumericStr.toCharArray();
        for (int i = 0, j = arr.length - 1; i < j && j > i; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }

        }
        return true;
    }
}
