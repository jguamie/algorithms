package com.jguamie;

public class Node {
  // Linked List
  Node next;
  // Binary Tree
  Node left;
  Node right;
  int data;

  Node(int newData) {
    next = null;
    left = null;
    right = null;
    data = newData;
  }
}
