package com.faisal.javabpracs.datastructure;

public class Stack {
  Node head;

  public Stack() {}

  // time: O(n)
  public void push(Object data) {

    if (head == null) {
      head = new Node(data);
    } else {
      Node currentNode = head;

      while (currentNode.getNext() != null) {
        currentNode = currentNode.getNext();
      }

      currentNode.setNext(new Node(data));
    }
  }

  // time: O(n)
  public Object pop() {

    Node currentNode = head;
    Node previousNode = null;
    Object dataToPop = null;

    if (currentNode.getNext() == null) {
      dataToPop = currentNode.getData();
      currentNode.setData(null);
    } else {
      while (currentNode.getNext() != null) {
        previousNode = currentNode;
        currentNode = currentNode.getNext();
      }

      dataToPop = currentNode.getData();
      previousNode.setNext(null);
    }

    return dataToPop;
  }

  public static void main(String[] args) {
    Stack stack = new Stack();

    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);

    System.out.println(stack.pop()); // pop 40
    System.out.println(stack.pop()); // pop 30
    System.out.println(stack.pop()); // pop 20
    System.out.println(stack.pop()); // pop 10
    System.out.println(stack.pop()); // null
    System.out.println(stack.pop()); // null
  }
}
