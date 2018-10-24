# Java Notes
1. Java is Pass by Value and Not Pass by Reference
1. Java Abstract versus Interface Classes
## Java Collections
### Stack
Initializes a new stack.
```
Stack<E> stack = new Stack<>();
```
Action | Method
------------ | ------------
Insert | `push(e)`
Remove | `pop()`
Examine | `peek()`

Tests if this stack is empty.
```
boolean empty()
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
Action | Method
------------ | ------------
Insert | `add(e)`
Remove | `remove()`
Examine | `element()`
