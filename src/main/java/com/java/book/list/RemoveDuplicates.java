package com.java.book.list;

public class RemoveDuplicates {

    public static void main(String[] args) {
        kthNodeFromLast();
    }

    private static void removeDuplicates() {
        MySinglyList<Integer> mySinglyList = MySinglyList.createList(new Integer[]{1, 2, 3, 7, 8, 9, 5});
        mySinglyList.interate();
        mySinglyList.removeDuplicates();
        mySinglyList.interate();
    }

    private static void kthNodeFromLast() {
        MySinglyList<Integer> mySinglyList = MySinglyList.createList(new Integer[]{1, 2, 3, 7, 8, 9, 5});
        mySinglyList.interate();
        Integer kthVal = mySinglyList.findKthNodeFromLast(2);
        System.out.println();
        System.out.println("kth node: " + kthVal);

    }


}
