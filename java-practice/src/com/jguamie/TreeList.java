package com.jguamie;

// Problem from:
// http://cslibrary.stanford.edu/109/TreeListRecursion.html

// Stanford Problem #15
// TODO: I haven't checked to see this works yet.
public class TreeList {
  private Node root;
  private Node head;
  private Node iterator;

  public void TreeList() {
    root = null;
    head = null;
    iterator = null;
  }

  public void treeToList() {
    treeToList(root);
  }

  private void treeToList(Node node) {
    if (node == null) {
      return;
    }
    treeToList(node.left);
    Node previousRightNode = node.right;
    if (head == null) {
      head = node;
      head.left = node;
      head.right = node;
      iterator = head;
    } else {
      iterator.right = node;
      node.left = iterator;
      node.right = head;
      iterator = node;
    }
    treeToList(previousRightNode);
  }
}
