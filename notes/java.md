# Java Notes
1. Java is Pass by Value and Not Pass by Reference
1. Java Abstract versus Interface Classes
## Java Collections
### ArrayList
Initializes a new array list.
```
ArrayList<E> arrayList = new ArrayList<>();
```
Appends the specified element to the end of this list.
```
boolean add(E e)
```
Inserts the specified element at the specified position in this list. Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).
```
void add(int index, E element)
```
Removes all of the elements from this list.
```
void clear()
```
Returns true if this list contains the specified element.
```
boolean contains(Object o)
```
Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
```
void forEach(Consumer<? super E> action)
```
Returns the element at the specified position in this list.
```
E get(int index)
```
Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
```
int indexOf(Object o)
```
Returns true if this list contains no elements.
```
boolean isEmpty()
```
Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
```
int lastIndexOf(Object o)
```
Removes the element at the specified position in this list.
```
E remove(int index)
```
Removes the first occurrence of the specified element from this list, if it is present.
```
boolean remove(Object o)
```
Replaces the element at the specified position in this list with the specified element.
```
E set(int index, E element)
```
Returns the number of elements in this list.
```
int size()
```
Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
```
List<E> subList(int fromIndex, int toIndex)
```
### HashMap
Initializes a new hash map.
```
HashMap<K,V> hashMap = new HashMap<>();
```
Returns true if this map contains a mapping for the specified key.
```
boolean containsKey(Object key)
```
Returns true if this map maps one or more keys to the specified value.
```
boolean containsValue(Object value)
```
Performs the given action for each entry in this map until all entries have been processed or the action throws an exception.
```
void forEach(BiConsumer<? super K,? super V> action)
```
Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
```
V get(Object key)
```
Returns true if this map contains no key-value mappings.
```
boolean isEmpty()
```
Associates the specified value with the specified key in this map.
```
V put(K key, V value)
```
Copies all of the mappings from the specified map to this map.
```
void putAll(Map<? extends K,? extends V> m)
```
Removes the mapping for the specified key from this map if present.
```
V remove(Object key)
```
Removes the entry for the specified key only if it is currently mapped to the specified value.
```
boolean remove(Object key, Object value)
```
Replaces the entry for the specified key only if it is currently mapped to some value.
```
V replace(K key, V value)
```
Replaces the entry for the specified key only if currently mapped to the specified value.
```
boolean replace(K key, V oldValue, V newValue)
```
Replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.
```
void replaceAll(BiFunction<? super K,? super V,? extends V> function)
```
Returns the number of key-value mappings in this map.
```
int size()
```
Returns a Collection view of the values contained in this map.
```
Collection<V> values()
```
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
