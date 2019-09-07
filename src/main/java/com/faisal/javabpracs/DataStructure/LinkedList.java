package com.faisal.javabpracs.DataStructure;

// http://crunchify.com/how-to-implement-a-linkedlist-class-from-scratch-in-java/
public class LinkedList {
    private static int counter;
    private Node head;

    public LinkedList() {}

    public void add(Object data) {
        if (head == null) {
            head = new Node(data);
        }

        Node tempNode = new Node(data);
        Node currentNode = head;

        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(tempNode);
    }

    public void addWithIndex(Object data, int index) {
        Node tempNode = new Node(data);
        Node currentNode = head;

        for (int i = 0; i < index && currentNode.getNext() != null; i++) {
            currentNode = currentNode.getNext();
        }

        tempNode.setNext(currentNode.getNext());
        currentNode.setNext(tempNode);

        incrementCounter();
    }

    private static int getCounter() {
        return counter;
    }

    private static void incrementCounter() {
        counter++;
    }

    private static void decrementCounter() {
        counter--;
    }
}