package com.java.book.list;

import java.util.Objects;

public class MySinglyList<T extends Comparable> {
    private Node<T> head;

    public MySinglyList() {
    }

    public static <T extends Comparable> MySinglyList<T> createList(T[] elements) {
        MySinglyList<T> mySinglyList = new MySinglyList<>();
        for (T ele : elements) {
            mySinglyList.add(ele);
        }
        return mySinglyList;
    }

    public String getNumOfList() {
        Node<T> pointer = head;
        String numStr = "";
        while (pointer != null) {
            numStr = numStr + pointer.value;
            pointer = pointer.next;
        }
        return numStr;
    }

    public void interate() {
        Node<T> currentNode = head;
        System.out.println();
        while (currentNode != null) {
            System.out.printf("%s ", currentNode.value);
            currentNode = currentNode.next;
        }
    }

    public void add(T t) {
        if (head == null) {
            head = new Node<>(t);
            return;
        }
        // traverse to las node
        Node<T> currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        //add a new node.
        currentNode.next = new Node<>(t);
    }

    public void remove(T t) {
        if (head == null) {
            System.out.println("data does not exist");
            return;
        }
        if (head.value.equals(t)) {
            if (head.next != null) {
                head = head.next;
            } else {
                head = null;
            }
            return;
        }
        Node<T> currentNode = head.next;
        Node<T> prevNode = head;
        currentNode = head;
        while (currentNode != null && !currentNode.value.equals(t)) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode != null && currentNode.value.equals(t)) {
            prevNode.next = currentNode.next;
        }
    }

    public T findKthNodeFromLast(int kthPos) {

        Node<T> fastPointer = head;
        Node<T> slowPointer = head;
        int startSlow = -kthPos;
        while (fastPointer != null) {
            fastPointer = fastPointer.next;
            if (startSlow >= 0) {
                slowPointer = slowPointer.next;
            }
            startSlow = startSlow + 1;
        }
        return Objects.nonNull(slowPointer) ? slowPointer.value : null;
    }

    public void partitionAroundValue(T t) {
        if (head == null || head.next == null) {
            System.out.println("data does not exist");
            return;
        }

        Node<T> lTListHead = null;
        Node<T> ltPointer = null;
        Node<T> gteListHead = null;
        Node<T> gtePointer = null;
        Node<T> pointer = head;
        while (pointer != null) {
            if (pointer.value.compareTo(t) < 0) {
                if (lTListHead == null) {
                    lTListHead = new Node<>(pointer.value);
                    lTListHead.next = null;
                    ltPointer = lTListHead;
                } else {
                    ltPointer.next = new Node<>(pointer.value);
                    ltPointer = ltPointer.next;
                    ltPointer.next = null;
                }
            } else {
                if (gteListHead == null) {
                    gteListHead = new Node<>(pointer.value);
                    gteListHead.next = null;
                    gtePointer = gteListHead;
                } else {
                    gtePointer.next = new Node<>(pointer.value);
                    gtePointer = gtePointer.next;
                    gtePointer.next = null;
                }
            }
            pointer = pointer.next;
        }
        if (lTListHead != null) {
            head = lTListHead;
            ltPointer.next = gteListHead;
        } else {
            head = gteListHead;
        }

    }

    public void removeDuplicates() {
        if (head == null || head.next == null) {
            System.out.println("data does not exist");
            return;
        }
        Node<T> currentNode = head;
        while (currentNode != null) {
            Node<T> innerCurrentNode = currentNode.next;
            Node<T> preNode = currentNode;
            while (innerCurrentNode != null) {
                if (currentNode.value.equals(innerCurrentNode.value)) {
                    preNode.next = innerCurrentNode.next;
                    innerCurrentNode.next = null;
                    innerCurrentNode = preNode.next;
                } else {
                    preNode = innerCurrentNode;
                    innerCurrentNode = innerCurrentNode.next;
                }
            }
            currentNode = currentNode.next;
        }

    }

    public T find(T t) {
        if (head == null) {
            throw new RuntimeException("list does not exist");
        }
        // traverse to last node
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.value.equals(t)) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    private static class Node<T> {
        private final T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }
}
