# Java Notes
1. Java is Pass by Value and Not Pass by Reference
1. Java Abstract versus Interface Classes
## Java Collections
### Stack
Initializes a new stack.
```
Stack<E> stack = new Stack<>();
```
Tests if this stack is empty.
```
boolean empty()
```
Looks at the object at the top of this stack without removing it from the stack.
```
E peek()
```
Removes the object at the top of this stack and returns that object as the value of this function.
```
E pop()
```
Pushes an item onto the top of this stack.
```
E push(E item)
```
Returns the 1-based position where an object is on this stack.
```
int search(Object o)
```
### Queue
Initializes a new queue.
```
Queue<E> queue = new LinkedList<>();
```
Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
```
boolean add(E e)
```
Retrieves, but does not remove, the head of this queue.
```
E element()
```
Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
```
E peek()
```
Retrieves and removes the head of this queue, or returns null if this queue is empty.
```
E poll()
```
Retrieves and removes the head of this queue.
```
E remove()
```
