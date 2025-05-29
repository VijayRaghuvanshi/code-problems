package com.java.book.list;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CircularLinkedList<T extends Comparable> {

    private CircularLinkedList.Node<T> head;

    public CircularLinkedList() {
    }

    public static <T extends Comparable> CircularLinkedList<T> createList(T[] elements, Integer loopNodeVal) {
        CircularLinkedList<T> circularSinglyList = new CircularLinkedList<>();

        Node<T> loopNode = null;
        Node<T> lastNode = null;
        for (T ele : elements) {
            lastNode = circularSinglyList.add(ele);
            if (Objects.nonNull(loopNodeVal) && ele.equals(loopNodeVal)) {
                loopNode = lastNode;
            }
        }
        if (loopNode != null) {
            lastNode.next = loopNode;
        }
        return circularSinglyList;
    }

    public void findLoopStartNode() {
        Set<Node<T>> nodeSet = new HashSet<>();
        Node<T> temp = head;
        Node<T> startLoopNode = null;
        while (temp != null) {
            if (!nodeSet.add(temp)) {
                startLoopNode = temp;
                break;
            }
            temp = temp.next;
        }

        if (startLoopNode != null) {
            System.out.printf("list loop start node is %s%n", startLoopNode.getValue());
        }
    }

    public Node<T> add(T t) {
        if (head == null) {
            head = new Node<>(t);
            return head;
        }
        // traverse to las node
        Node<T> currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        //add a new node.
        currentNode.next = new Node<>(t);
        return currentNode.next;
    }

    private static class Node<T> {
        private final T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }

        public T getValue() {
            return value;
        }
    }
}
