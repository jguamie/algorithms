package com.jguamie;

// Problems from:
// http://cslibrary.stanford.edu/105/LinkedListProblems.pdf
public class LinkedList {
  // Head node pointer. Will be null for an empty linked list.
  private Node head;

  public void LinkedList() {
    head = null;
  }

  // Stanford Problem #1
  public int count(int searchFor) {
    if (head == null) {
      return 0;
    }
    Node iterator = head;
    int counter = 0;
    while (iterator != null) {
      if (iterator.data == searchFor) {
        counter++;
      }
      iterator = iterator.next;
    }
    return counter;
  }

  // Stanford Problem #2
  public int getNth(int index) {
    if (head == null) {
      return 0;
    }
    Node iterator = head;
    for (int i = 0; i < index; i++) {
      if (iterator.next == null) {
        return 0;
      }
      iterator = iterator.next;
    }
    return iterator.data;
  }

  // Stanford Problem #3
  public void deleteList() {
    // Garbage collection will handle the rest
    head = null;
  }

  // Stanford Problem #4
  public void pop() {
    if (head == null) {
      return;
    }
    Node toDelete = head;
    head = head.next;
    toDelete = null;
  }

  // Stanford Problem #5
  public void insertNth(int index, int data) {
    Node iterator = head;
    for (int i = 0; i < index-1; i++) {
      if (iterator.next == null) {
        return;
      }
      iterator = iterator.next;
    }
    Node toInsert = new Node(data);
    Node nextToInsert = iterator.next;
    iterator = toInsert;
    toInsert.next = nextToInsert;
  }

  // Stanford Problem #6
  public void sortedInsert(Node head, Node newNode) {
    if (head == null || newNode.data <= head.data) {
      newNode.next = head;
      head = newNode;
      return;
    }
    Node iterator = head;
    while (iterator.next != null) {
      if (newNode.data <= iterator.next.data) {
        newNode.next = iterator.next;
        iterator.next = newNode;
        return;
      }
    }
    iterator.next = newNode;
    // newNode.next is already initialized to null
    //newNode.next = null;
  }

  // Stanford Problem #7
  public void insertSort() {
    Node iterator = head;
    Node newHead = null;
    while(iterator != null) {
      Node toSort = iterator;
      iterator = iterator.next;
      sortedInsert(newHead, toSort);
    }
    head = newHead;
  }

  // Stanford Problem #8
  public void Append(Node aRef, Node bRef) {
    Node aIterator = aRef;
    while (aIterator.next != null) {
      aIterator = aIterator.next;
    }
    aIterator.next = bRef;
  }

  // Stanford Problem #9
  // Return head node to back linked list only.
  public Node frontBackSplit() {
    if (head == null || head.next == null) {
      return null;
    }
    Node slowIter = head;
    Node fastIter = head;
    while (fastIter.next != null) {
      fastIter = fastIter.next;
      if (fastIter.next != null) {
        fastIter = fastIter.next;
        slowIter = slowIter.next;
      }
    }
    Node backHead = slowIter.next;
    slowIter.next = null;
    return backHead;
  }

  // Stanford Problem #10
  public void removeDuplicates() {
    if (head == null) {
      return;
    }
    Node iter = head;
    while (iter.next != null) {
      if (iter.next.data == iter.data) {
        iter.next = iter.next.next;
      } else {
        iter = iter.next;
      }
    }
  }

  // Stanford Problem #11
  public Node moveNode(Node sourceRef) {
    if (head == null || sourceRef == null) {
      return;
    }
    Node previousDestHead = head;
    Node newSourceHead = sourceRef.next;
    head = sourceRef;
    head.next = previousDestHead;
    return newSourceHead;
  }

  // Stanford Problem #13
  public void shuffleMerge(Node a, Node b) {
    if (a == null) {
      head = b;
      return;
    }
    head = a;
    Node sourceIter = head;
    Node aIter = a.next;
    Node bIter = b;
    while (true) {
      if (bIter != null) {
        sourceIter.next = bIter;
        bIter = bIter.next;
        sourceIter = sourceIter.next;
      } else {
        return;
      }
      if (aIter != null) {
        sourceIter.next = aIter;
        aIter = aIter.next;
        sourceIter = sourceIter.next;
      } else {
        return;
      }
    }
  }

  // Stanford Problem #14
  public void sortedMerge(Node a, Node b) {
    if (a == null) {
      head = b;
      return;
    }
    if (b == null) {
      head = a;
      return;
    }
    Node aIter = a;
    Node bIter = b;
    if (a.data <= b.data) {
      head = a;
      aIter = aIter.next;
    } else {
      head = b;
      bIter = bIter.next;
    }
    Node sourceIter = head;

    while(true) {
      if (aIter == null) {
        sourceIter.next = bIter;
        return;
      }
      if (bIter == null) {
        sourceIter.next = aIter;
        return;
      }
      if (aIter.data <= bIter.data) {
        sourceIter.next = aIter;
        aIter = aIter.next;
      } else {
        sourceIter.next = bIter;
        bIter = bIter.next;
      }
      sourceIter = sourceIter.next;
    }
  }

  // Stanford Problem #17
  public void reverse() {
    if (head == null || head.next == null) {
      return;
    }
    Node iter = head;
    Node iterNext = head.next;
    while (iterNext != null) {
      Node iterNextNext = iterNext.next;
      iterNext.next = iter;
      iter = iterNext;
      iterNext = iterNextNext;
    }
    head = iter;
  }
}
