package com.java.leetcode;

public class ReverseWords {
    public static void main(String[] args) {
        ReverseWords reverseWords =  new ReverseWords();
        System.out.println( reverseWords.reverseWords("example   good "));
    }
    public String reverseWords(String s) {

        if(s==null || "".equalsIgnoreCase(s.trim())){
            return s;
        }
        String[] wordArry = s.split(" ");
        StringBuilder reverseWords = new StringBuilder();
        for(int i=wordArry.length-1; i >=0; i-- ){
            if(!"".equals(wordArry[i].trim())){
                reverseWords.append(wordArry[i].trim()).append(" ");
            }
        }
        return reverseWords.toString().trim();
    }
}
