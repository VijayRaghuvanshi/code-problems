package com.java.leetcode;

import java.util.Arrays;

public class LastWordLength {

    public static void main(String[] args) {
        LastWordLength obj = new LastWordLength();
        System.out.println("last word length = " +obj.lengthOfLastWord("hello world! good  morning "));
    }

    public int lengthOfLastWord(String s) {
        if(s == null){
            return 0;
        }

        String[] words = s.trim().split(" ");
        return words[words.length-1].trim().length();
    }
}
