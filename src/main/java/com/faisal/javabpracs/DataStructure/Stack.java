package com.faisal.javabpracs.DataStructure;

public class Stack {
  Node head;

  public Stack() {}

  public void push(Object data) {
    // create new node for stack
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
    } else {
      // traverse into latest pushed stack
      while (head.getNext() != null) {
        head = head.getNext();
      }

      // insert new node in last index
      head.setNext(newNode);
    }

  }

  public Object pop() {
    if (head == null) {
      return null;
    }

    // get latest pushed data in stack
    Object dataToPop = head.getData();

    // traverse to the previous stack

    return dataToPop;
  }

  public static void main(String[] args) {
    Stack stack = new Stack();

    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);

    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }
}
