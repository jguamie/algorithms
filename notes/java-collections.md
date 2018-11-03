# Java Collections
![java-collection-hierarchy](https://github.com/jguamie/practice-problems/blob/master/notes/java-collection-hierarchy.jpeg)
## HashMap
 * `HashMap<K,V> hashMap = new HashMap<>();` Initializes a new hash map.
 * `boolean containsKey(Object key)` Returns true if this map contains a mapping for the specified key.
 * `boolean containsValue(Object value)` Returns true if this map maps one or more keys to the specified value.
 * `void forEach(BiConsumer<? super K,? super V> action)` Performs the given action for each entry in this map until all entries have been processed or the action throws an exception.
 * `V get(Object key)` Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
 * `boolean isEmpty()` Returns true if this map contains no key-value mappings.
 * `V put(K key, V value)` Associates the specified value with the specified key in this map.
 * `void putAll(Map<? extends K,? extends V> m)` Copies all of the mappings from the specified map to this map.
 * `V remove(Object key)` Removes the mapping for the specified key from this map if present.
 * `boolean remove(Object key, Object value)` Removes the entry for the specified key only if it is currently mapped to the specified value.
 * `V replace(K key, V value)` Replaces the entry for the specified key only if it is currently mapped to some value.
 * `boolean replace(K key, V oldValue, V newValue)` Replaces the entry for the specified key only if currently mapped to the specified value.
 * `void replaceAll(BiFunction<? super K,? super V,? extends V> function)` Replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.
 * `int size()` Returns the number of key-value mappings in this map.
 * `Collection<V> values()` Returns a Collection view of the values contained in this map.
## Lists
### ArrayList
 * `ArrayList<E> arrayList = new ArrayList<>();` Initializes a new array list.
 * `boolean add(E e)` Appends the specified element to the end of this list.
 * `void add(int index, E element)` Inserts the specified element at the specified position in this list. Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).
 * `void clear()` Removes all of the elements from this list.
 * `boolean contains(Object o)` Returns true if this list contains the specified element.
 * `void forEach(Consumer<? super E> action)` Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
 * `E get(int index)` Returns the element at the specified position in this list.
 * `int indexOf(Object o)` Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
 * `boolean isEmpty()` Returns true if this list contains no elements.
 * `int lastIndexOf(Object o)` Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
 * `E remove(int index)` Removes the element at the specified position in this list.
 * `boolean remove(Object o)` Removes the first occurrence of the specified element from this list, if it is present.
 * `E set(int index, E element)` Replaces the element at the specified position in this list with the specified element.
 * `int size()` Returns the number of elements in this list.
 * `List<E> subList(int fromIndex, int toIndex)` Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
### LinkedList
 * `Queue<E> queue = new LinkedList<>();` Initializes a new linked list.

Action | Method
------------ | ------------
Insert | `offer(e)` or `add(e)`
Remove | `poll()`
Examine | `peek()`
## Sets
### HashSet
HashSet is implemented using a hash table. The elements are not ordered. The add, remove, and contains methods have constant time complexity O(1).
 * `Set<E> hashSet = new HashSet<>();` Initializes a new hash set.
 * `boolean add(E e)` Adds the specified element to this set if it is not already present.
 * `boolean contains(Object o)` Returns true if this set contains the specified element.
 * `boolean isEmpty()` Returns true if this set contains no elements.
 * `boolean remove(Object o)` Removes the specified element from this set if it is present.
 * `int size()` Returns the number of elements in this set (its cardinality).
### LinkedHashSet
LinkedHashSet is implemented as a hash table with a linked list running through it. The elements are sorted by order of insertion. The basic methods have constant time complexity O(1).
 * `LinkedHashSet<E> linkedHashSet = new LinkedHashSet<>();` Initializes a new linked hash set.
 * Same methods as HashSet.
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
 * `SortedSet<E> subSet(E fromElement, E toElement)` Returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive.
## Stack
 * `Stack<E> stack = new Stack<>();` Initializes a new stack.

Action | Method
------------ | ------------
Insert | `push(e)`
Remove | `pop()`
Examine | `peek()`

 * `boolean empty()` Tests if this stack is empty.
 * `int search(Object o)` Returns the 1-based position where an object is on this stack.
