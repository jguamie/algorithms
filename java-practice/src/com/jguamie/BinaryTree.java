package com.jguamie;

import java.util.ArrayList;

// Problems from:
// http://cslibrary.stanford.edu/110/BinaryTrees.html
public class BinaryTree {
  // Root node pointer. Will be null for an empty tree.
  private Node root;

  public void BinaryTree() {
    root = null;
  }

  // Stanford Problem #2
  public int size() {
    return size(root);
  }

  private int size(Node node) {
    if (node == null) {
      return 0;
    } else {
      return 1 + size(node.left) + size(node.right);
    }
  }

  // Stanford Problem #3
  public int maxDepth() {
    return maxDepth(root);
  }

  int maxDepth(Node node) {
    if (node == null) {
      return 0;
    } else {
      return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
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
    return hasPathSumJohnLee(root, sum);
  }

  // TODO: This is incorrect? What if the sum is zero halfway down a path?
  private boolean hasPathSumStanford(Node node, int sum) {
    if (node == null) {
      return sum == 0;
    } else {
      int subSum = sum - node.data;
      return hasPathSumStanford(node.left, subSum) || hasPathSumStanford(node.right, subSum);
    }
  }

  private boolean hasPathSumJohnLee(Node node, int sum) {
    if (node == null) {
      return false;
    }
    int subSum = sum - node.data;
    if (node.left == null && node.right == null) {
      return node.data == subSum;
    } else {
      return hasPathSumJohnLee(node.left, subSum) || hasPathSumJohnLee(node.right, subSum);
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

  // Stanford Problem #11
  public boolean sameTree(BinaryTree other) {
    return sameTree(root, other.root);
  }

  private boolean sameTree(Node a, Node b) {
    if (a == null && b == null) {
      return true;
    }
    if (a != null && b != null) {
      return a.data == b.data && sameTree(a.left, b.left) && sameTree(a.right, b.right);
    } else {
      return false;
    }
  }

  // Stanford Problem #13
  // This approach doesn't require minValue() or maxValue().
  // Also, minValue() and maxValue() would not work in a non-BST.
  public boolean isBST() {
    ArrayList<Integer> integerArray = new ArrayList<>();
    return addDataToArray(root, integerArray);
  }

  private boolean addDataToArray(Node node, ArrayList<Integer> integerArray) {
    if (node == null) {
      return true;
    }
    boolean isBST = true;
    // In-order traversal
    isBST = isBST && addDataToArray(node, integerArray);
    integerArray.add(node.data);
    // Ensure each new data is greater than the last inserted data
    if (integerArray.size() > 1 && integerArray.get(size()-1) > integerArray.get(size()-2)) {
      isBST = false;
    }
    isBST = isBST && addDataToArray(node.right, integerArray);
    return isBST;
  }

  // Stanford Problem #14
  public boolean isBST2() {
    return isBST2(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  private boolean isBST2(Node node, int min, int max) {
    if (node == null) {
      return true;
    } else {
      if (node.data <= min || node.data > max) {
        return false;
      }
      return isBST2(node.left, min, node.data) && isBST2(node.right, node.data, max);
    }
  }
}
