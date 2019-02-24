# Java Collections
![java-collection-hierarchy](https://github.com/jguamie/practice-problems/blob/master/images/java-collection-hierarchy.jpeg)
## HashMap
* `HashMap<K,V> hashMap = new HashMap<>();` Initializes a new hash map.
* `void clear()` Removes all of the mappings from this map.
* `boolean containsKey(Object key)` Returns true if this map contains a mapping for the specified key.
* `boolean containsValue(Object value)` Returns true if this map maps one or more keys to the specified value.
* `Set<Map.Entry<K,V>> entrySet()` Returns a Set view of the mappings contained in this map.
* `V get(Object key)` Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
* `boolean isEmpty()` Returns true if this map contains no key-value mappings.
* `V put(K key, V value)` Associates the specified value with the specified key in this map.
* `V putIfAbsent(K key, V value)` If the specified key is mapped to null, associates it with the given value and returns null. Otherwise, returns the existing value.
* `V remove(Object key)` Removes the mapping for the specified key from this map if present.
* `int size()` Returns the number of key-value mappings in this map.
* `Collection<V> values()` Returns a Collection view of the values contained in this map.
### Map.Entry
A map entry (key-value pair) within the HashMap.
* `K getKey()` Returns the key corresponding to this entry.
* `V getValue()` Returns the value corresponding to this entry.
* `V setValue(V value)` Replaces the value corresponding to this entry with the specified value.
### For Loop Example
```
for (Map.Entry<String, String> entry : map.entrySet()) {
  System.out.println(entry.getKey() + " : " + entry.getValue());
}
```
### Lamba Example
```
map.forEach((key,value) -> System.out.println(key + " = " + value));
```
### Iterator Example
```
Iterator<Entry<String, String>> iter = map.entrySet().iterator();
while (iter.hasNext()) {
  Map.Entry<String, String> pair = (Map.Entry<String, String>) iter.next();
  System.out.println(pair.getKey() + " = " + pair.getValue());
}
```
## Lists
### ArrayList
* `ArrayList<E> arrayList = new ArrayList<>();` Initializes a new array list.
* `boolean add(E e)` Appends the specified element to the end of this list.
* `void add(int index, E element)` Inserts the specified element at the specified position in this list. Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).
* `void clear()` Removes all of the elements from this list.
* `boolean contains(Object o)` Returns true if this list contains the specified element.
* `E get(int index)` Returns the element at the specified position in this list.
* `int indexOf(Object o)` Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
* `boolean isEmpty()` Returns true if this list contains no elements.
* `int lastIndexOf(Object o)` Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
* `E remove(int index)` Removes the element at the specified position in this list.
* `boolean remove(Object o)` Removes the first occurrence of the specified element from this list, if it is present.
* `E set(int index, E element)` Replaces the element at the specified position in this list with the specified element.
* `int size()` Returns the number of elements in this list.
* `Collections.sort(arrayList)` Sorts this list.
* `List<E> subList(int fromIndex, int toIndex)` Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
### Convert Array to ArrayList
```
Integer[] values = { 1, 3, 7 };
List<Integer> arrayList = new ArrayList<Integer>( Arrays.asList(values) );
```
### Convert Array to List
This is only for reading the values. Any updates will not work.
```
Integer[] values = { 1, 3, 7 };
List<Integer> list = Arrays.asList(values);
```
## Sets
### HashSet
HashSet is implemented using a hash table. The elements are not ordered. The add, remove, and contains methods have constant time complexity O(1).
* `Set<E> hashSet = new HashSet<>();` Initializes a new hash set.
* `boolean add(E e)` Adds the specified element to this set if it is not already present.
* `boolean contains(Object o)` Returns true if this set contains the specified element.
* `boolean isEmpty()` Returns true if this set contains no elements.
* `boolean remove(Object o)` Removes the specified element from this set if it is present.
* `int size()` Returns the number of elements in this set (its cardinality).
#### Convert Array to HashSet
```
String[] values = { "a", "b", "c" };
HashSet<String> hashSet = new HashSet<>( Arrays.asList(values) );
```
### LinkedHashSet
LinkedHashSet is implemented as a hash table with a linked list running through it. The elements are sorted by order of insertion. The basic methods have constant time complexity O(1).
* `LinkedHashSet<E> linkedHashSet = new LinkedHashSet<>();` Initializes a new linked hash set.
* Same methods as HashSet.
#### Iterator Example
```
Iterator<E> iter = linkedHashSet.iterator();
while( iter.hasNext() ) {
  System.out.println( iter.next() );
}
```
### TreeSet
TreeSet is implemented using a red-black tree. The elements are sorted. The add, remove, and contains methods have a time complexity of O(log (n)).
* `Set<E> treeSet = new TreeSet<>();` Initializes a new tree set.
* `boolean add(E e)` Adds the specified element to this set if it is not already present.
* `boolean contains(Object o)` Returns true if this set contains the specified element.
* `E first()` Returns the first (lowest) element currently in this set.
* `boolean isEmpty()` Returns true if this set contains no elements.
* `E last()` Returns the last (highest) element currently in this set.
* `E pollFirst()` Retrieves and removes the first (lowest) element, or returns null if this set is empty.
* `E pollLast()` Retrieves and removes the last (highest) element, or returns null if this set is empty.
* `boolean remove(Object o)` Removes the specified element from this set if it is present.
* `int size()` Returns the number of elements in this set.
## LinkedList
* `Queue<E> linkedList = new LinkedList<>();` Initializes a new linked list.
* `void add(int index, E element)` Inserts the specified element at the specified position in this list.
* `void addFirst(E e)` Inserts the specified element at the beginning of this list.
* `void addLast(E e)` Appends the specified element to the end of this list.
* `E get(int index)` Returns the element at the specified position in this list.
* `E peekFirst()` Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
* `E peekLast()` Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
* `E pollFirst()` Retrieves and removes the first element of this list, or returns null if this list is empty.
* `E pollLast()` Retrieves and removes the last element of this list, or returns null if this list is empty.
* `E remove(int index)` Removes the element at the specified position in this list.
* `E set(int index, E element)` Replaces the element at the specified position in this list with the specified element.
* `int size()` Returns the number of elements in this list.
* `Object[] toArray()` Returns an array containing all of the elements in this list in proper sequence (from first to last element).
### Stack Methods
A linked list can be used as a stack.
* `E peek()` Retrieves, but does not remove, the head (first element) of this list.
* `E pop()` Pops an element from the stack represented by this list.
* `void push(E e)` Pushes an element onto the stack represented by this list.
### Queue Methods
A linked list can be used as a queue.
* `boolean add(E e)` Appends the specified element to the end of this list.
* `E peek()` Retrieves, but does not remove, the head (first element) of this list.
* `E poll()` Retrieves and removes the head (first element) of this list.
## PriorityQueue
A priority queue is essentially a min heap. The head of this queue is the least element with respect to the specified ordering.
* `Queue<E> priorityQueue = new PriorityQueue<>();` Initializes a new priority queue.
* `Queue<Integer> priorityQueue = new PriorityQueue<>(5, Collections.reverseOrder());` Initialize as a max heap. An initial capacity must be provided if changing the order. In this example, 5 is the initial capacity. Capacity is not the same as size. The size at initialization will still be 0.
* `Queue<Integer> priorityQueue = new PriorityQueue<>(5, (a, b) -> b - a);` Instead, use a lambda expression to reverse ordering.
* `boolean add(E e)` Inserts the specified element into this priority queue.
* `boolean contains(Object o)` Returns true if this queue contains the specified element.
* `E peek()` Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
* `E poll()` Retrieves and removes the head of this queue, or returns null if this queue is empty.
* `boolean remove(Object o)` Removes a single instance of the specified element from this queue, if it is present.
* `int size()` Returns the number of elements in this collection.
* `Object[] toArray()` Returns an array containing all of the elements in this queue.
