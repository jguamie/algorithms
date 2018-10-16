package com.jguamie;

public class BinaryTree {
  // Root node pointer. Will be null for an empty tree.
  private Node root;

  public void BinaryTree() {
    root = null;
  }

  // Stanford Problem #2
  public int size() {
    return(size(root));
  }

  private int size(Node node) {
    if (node == null) {
      return(0);
    } else {
      return(1 + size(node.left) + size(node.right));
    }
  }

  // Stanford Problem #3
  public int maxDepth() {
    return(maxDepth(root));
  }

  int maxDepth(Node node) {
    if (node == null) {
      return 0;
    } else {
      return(1 + Math.max(maxDepth(node.left), maxDepth(node.right)));
    }
  }

  // Stanford Problem #6
  public void printPostorder() {
    printPostorder(root);
  }

  private void printPostorder(Node node) {
    if (node == null) {
      return;
    }
    printPostorder(node.left);
    printPostorder(node.right);
    System.out.print(node.data + " ");
  }

  // Stanford Problem #7
  public boolean hasPath(int sum) {
    return(hasPathSumJohnLee(root, sum));
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

  private boolean hasPathSumJohnLee(Node node, int sum) {
    if (node == null) {
      return(false);
    }
    int subSum = sum - node.data;
    if (node.left == null && node.right == null) {
      return(node.data == subSum);
    } else {
      return(hasPathSumJohnLee(node.left, subSum) || hasPathSumJohnLee(node.right, subSum));
    }
  }

  // Stanford Problem #8
  public void printPaths() {
    String currentPath = "";
    printPaths(root, currentPath);
  }

  private void printPaths(Node node, String currentPath) {
    if (node == null) {
      return;
    }
    String updatedPath = currentPath + " " + node.data;
    if (node.left == null && node.right == null) {
      System.out.println(updatedPath);
    } else {
      printPaths(node.left, updatedPath);
      printPaths(node.right, updatedPath);
    }
  }

  // Stanford Problem #9
  public void mirror() {
    mirror(root);
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
