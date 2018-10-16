package com.jguamie;

public class BinaryTree {
  // Root node pointer. Will be null for an empty tree.
  private Node root;

  public void BinaryTree() {
    root = null;
  }

  public int size() {
    return(size(root));
  }

  public int maxDepth() {
    return(maxDepth(root));
  }

  public void printPostorder() {
    printPostorder(root);
  }

  // TODO: This is incorrect? What if the sum is zero halfway down a path?
  public boolean hasPathSumStanford(int sum) {
    return(hasPathSumStanford(root, sum));
  }

  // Given a non-empty binary search tree
  public boolean hasPathSumJohnLee(int sum) {
    return(hasPathSumJohnLee(root, sum));
  }

  // Given a non-empty binary search tree
  public void printPaths() {
    String currentPath = "";
    printPaths(root, currentPath);
  }

  public void mirror() {
    mirror(root);
  }

  private int size(Node node) {
    if (node == null) {
      return(0);
    } else {
      return(1 + size(node.left) + size(node.right));
    }
  }

  int maxDepth(Node node) {
    if (node == null) {
      return 0;
    } else {
      return(1 + Math.max(maxDepth(node.left), maxDepth(node.right)));
    }
  }

  private void printPostorder(Node node) {
    if (node == null) {
      return;
    }
    printPostorder(node.left);
    printPostorder(node.right);
    System.out.print(node.data + " ");
  }

  // TODO: This is incorrect? What if the sum is zero halfway down a path?
  private boolean hasPathSumStanford(Node node, int sum) {
    if (node == null) {
      return(sum == 0);
    } else {
      int subSum = sum - node.data;
      return(hasPathSumStanford(node.left, subSum) || hasPathSumStanford(node.right, subSum));
    }
  }

  // Given a non-empty binary search tree
  private boolean hasPathSumJohnLee(Node node, int sum) {
    int subSum = sum - node.data;
    if (node.left == null && node.right == null) {
      return(subSum == 0);
    } else if (node.left == null) {
      return(hasPathSumJohnLee(node.right, subSum));
    } else if (node.right == null) {
      return(hasPathSumJohnLee(node.left, subSum));
    } else {
      return(hasPathSumJohnLee(node.left, subSum) || hasPathSumJohnLee(node.right, subSum));
    }
  }

  // Given a non-empty binary search tree
  private void printPaths(Node node, String currentPath) {
    String newPath = currentPath + node.data + " ";
    if (node.left == null && node.right == null) {
      System.out.println(newPath);
    } else if (node.left == null) {
      printPaths(node.right, currentPath);
    } else if (node.right == null) {
      printPaths(node.left, currentPath);
    } else {
      printPaths(node.left, currentPath);
      printPaths(node.right, currentPath);
    }
  }

  private void mirror(Node node) {
    if (node == null) {
      return;
    }

    // Swap left and right
    Node temp = node.left;
    node.left = node.right;
    node.right = temp;

    mirror(node.left);
    mirror(node.right);
  }
}
