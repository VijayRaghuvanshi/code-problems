package com.java.book.string;

/**
 * check if one word is the substring of another string (or rotation of another one) using only one call.
 */
public class StringRotation {
    public static void main(String[] args) {

        System.out.println("is s2 substring of s1:" + isSubstring("erbottlewat", "waterbottle"));
    }

    private static Boolean isSubstring(String s1, String s2) {

        //if we append string s1 to itself then its contains all rotation combination of the string s1
        String temp = s1 + s1;
        return temp.contains(s2);
    }
}
