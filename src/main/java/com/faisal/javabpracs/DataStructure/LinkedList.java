package com.faisal.javabpracs.DataStructure;

// http://crunchify.com/how-to-implement-a-linkedlist-class-from-scratch-in-java/
// TODO
// add unit test

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

class Node {
    Node next;
    Object data;

    public Node(Object dataValue) {
        next = null;
        data = dataValue;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
