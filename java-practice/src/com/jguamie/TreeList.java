package com.jguamie;

// Problem from:
// http://cslibrary.stanford.edu/109/TreeListRecursion.html

// Stanford Problem #15
// TODO: I haven't checked to see this works yet.
public class TreeList {
  private Node root;
  private Node head;

  public void TreeList() {
    root = null;
    head = null;
  }

  public void treeToList() {
    treeToList(root);
  }

  private void treeToList(Node node) {
    if (node == null) {
      return;
    }
    treeToList(node.left);
    Node previousRight = node.right;
    if (head == null) {
      head = node;
      head.left = node;
      head.right = node;
    } else {
      Node previousLast = head.left;
      head.left = node;
      previousLast.right = node;
      node.left = previousLast;
      node.right = head;
    }
    treeToList(previousRight);
  }
}
