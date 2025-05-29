package com.java.book.list;

public class SinglyListOperations {

    public static void main(String[] args) {
        //kthNodeFromLast();
        //partitionListAroundValue();
        //sumOf2NumsUsingLinkedList();
        findLoopNode();
    }

    private static void findLoopNode() {
        CircularLinkedList<Integer> circularLinkedList1 = CircularLinkedList.createList(new Integer[]{1, 2, 3, 7, 8, 9, 5}, 7);
        circularLinkedList1.findLoopStartNode();
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

    private static void partitionListAroundValue() {
        MySinglyList<Integer> mySinglyList = MySinglyList.createList(new Integer[]{3, 5, 8, 5, 10, 2, 1});
        mySinglyList.interate();
        mySinglyList.partitionAroundValue(10);
        System.out.println();
        mySinglyList.interate();
    }


    private static void sumOf2NumsUsingLinkedList() {
        MySinglyList<Integer> num1 = MySinglyList.createList(new Integer[]{6, 1, 7});
        MySinglyList<Integer> num2 = MySinglyList.createList(new Integer[]{2, 9, 5});
        String num1Str = num1.getNumOfList();
        String num2Str = num2.getNumOfList();
        int num1Int = num1Str.isEmpty() ? 0 : Integer.parseInt(num1Str);
        int num2Int = num2Str.isEmpty() ? 0 : Integer.parseInt(num2Str);
        System.out.printf("addition of %s and %s is %s%n", num1Int, num2Int, Math.addExact(num1Int, num2Int));
    }


}
