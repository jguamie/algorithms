package com.jguamie;

// Problems from:
// http://cslibrary.stanford.edu/110/BinaryTrees.html
public class BinarySearchTree {
  // Root node pointer. Will be null for an empty tree.
  private Node root;

  public void BinarySearchTree() {
    root = null;
  }

  public boolean lookup(int data) {
    return (lookup(root, data));
  }

  public void insert(int data) {
    root = insert(root, data);
  }

  // Given a non-empty binary search tree
  public int minValue() {
    return (minValueRecursive(root));
  }

  public void printTree() {
    printTree(root);
  }

  public void doubleTree() {
    doubleTree(root);
  }

  private Node insert(Node node, int data) {
    if (node == null) {
      node = new Node(data);
    } else {
      if (data <= node.data) {
        node.left = insert(node.left, data);
      } else {
        node.right = insert(node.right, data);
      }
    }
    return (node);
  }

  private boolean lookup(Node node, int data) {
    if (node == null) {
      return false;
    }
    if (data == node.data) {
      return true;
    } else if (data < node.data) {
      return (lookup(node.left, data));
    } else {
      return (lookup(node.right, data));
    }
  }

  // Given a non-empty binary search tree
  private int minValueRecursive(Node node) {
    if (node.left == null) {
      return (node.data);
    } else {
      return (minValueRecursive(node.left));
    }
  }

  // Given a non-empty binary search tree
  private int minValueWhileLoop(Node node) {
    Node current = node;
    while (current.left != null) {
      current = current.left;
    }
    return (current.data);
  }

  private void printTree(Node node) {
    if (node == null) {
      return;
    }
    printTree(node.left);
    System.out.print(node.data + " ");
    printTree(node.right);
  }

  private void doubleTree(Node node) {
    if (node == null) {
      return;
    }
    doubleTree(node.left);
    doubleTree(node.right);

    Node duplicate = new Node(node.data);
    duplicate.left = node.left;
    node.left = duplicate;
  }
}