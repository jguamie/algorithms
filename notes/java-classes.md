# Java Classes
## Arrays
* `static <T> List<T> asList(T... a)` Returns a fixed-size list backed by the specified array.
* `static int binarySearch(int[] a, int key)` Searches the specified array of ints for the specified value using the binary search algorithm.
* `static int binarySearch(int[] a, int fromIndex, int toIndex, int key)` Searches a range of the specified array of ints for the specified value using the binary search algorithm.
  * `binarySearch` also applies to byte, char, double, float, long, short.
* `static void fill(int[] a, int val)` Assigns the specified int value to each element of the specified array of ints.
  * `fill` also applies to boolean, byte, char, double, float, long, short.
* `static void sort(char[] a)` Sorts the specified array into ascending numerical order.
  * `sort` also applies to boolean, byte, double, float, int, long, short.
* `static <T> void sort(T[] a, Comparator<? super T> c)` Sorts the specified array of objects according to the order induced by the specified comparator.
## Collections
* `static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key)` Searches the specified list for the specified object using the binary search algorithm.
* `static <T> void fill(List<? super T> list, T obj)` Replaces all of the elements of the specified list with the specified element.
* `static void reverse(List<?> list)` Reverses the order of the elements in the specified list.
* `static <T> Comparator<T> reverseOrder()` Returns a comparator that imposes the reverse of the natural ordering on a collection of objects that implement the Comparable interface.
* `static void shuffle(List<?> list)` Randomly permutes the specified list using a default source of randomness.
* `static <T extends Comparable<? super T>> void	sort(List<T> list)` Sorts the specified list into ascending order, according to the natural ordering of its elements.
* `static <T> void sort(List<T> list, Comparator<? super T> c)` Sorts the specified list according to the order induced by the specified comparator.
## Character
* `static char forDigit(int digit, int radix)` Determines the character representation for a specific digit in the specified radix.
* `static int getNumericValue(char ch)` Returns the int value that the specified Unicode character represents.
* `static boolean isDigit(char ch)` Determines if the specified character is a digit.
* `static boolean isLetter(char ch)` Determines if the specified character is a letter.
* `static boolean isLetterOrDigit(char ch)` Determines if the specified character is a letter or digit.
* `static boolean isLowerCase(char ch)` Determines if the specified character is a lowercase character.
* `static boolean isUpperCase(char ch)` Determines if the specified character is an uppercase character.
* `static boolean isWhitespace(char ch)` Determines if the specified character is white space according to Java.
* `static char toLowerCase(char ch)` Converts the character argument to lowercase using case mapping information from the UnicodeData file.
* `static char toUpperCase(char ch)` Converts the character argument to uppercase using case mapping information from the UnicodeData file.
## Integer
* `String toString()` Returns a String object representing this Integer's value.
* `static Integer valueOf(String s)` Returns an Integer object holding the value of the specified String.
## String
* `String(char[] value)` Allocates a new String so that it represents the sequence of characters currently contained in the character array argument.
* `char charAt(int index)` Returns the char value at the specified index.
* `boolean contains(CharSequence s)` Returns true if and only if this string contains the specified sequence of char values.
* `boolean endsWith(String suffix)` Tests if this string ends with the specified suffix.
* `boolean equals(Object anObject)` Compares this string to the specified object.
* `int length()` Returns the length of this string.
* `String replace(char oldChar, char newChar)` Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
* `String replace(CharSequence target, CharSequence replacement)` Replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence.
* `boolean startsWith(String prefix)` Tests if this string starts with the specified prefix.
* `String substring(int beginIndex)` Returns a new string that is a substring of this string.
* `String substring(int beginIndex, int endIndex)` Returns a new string that is a substring of this string. The substring begins at the specified beginIndex and extends to the character at index endIndex - 1. 
* `char[] toCharArray()` Converts this string to a new character array.
* `String toLowerCase()` Converts all of the characters in this String to lower case using the rules of the default locale.
* `String toUpperCase()` Converts all of the characters in this String to upper case using the rules of the default locale.
* `static String valueOf(char[] data)` Returns the string representation of the char array argument.
* `static String valueOf(int i)` Returns the string representation of the int argument.
  * `valueOf` also applies to boolean, char, double, float, long, short.
## Pair
* `Pair(K key, V value)` Creates a new pair.
* `K getKey()` Gets the key for this pair.
* `V getValue()` Gets the value for this pair.
## Point
* `Point(int x, int y)` Constructs and initializes a point at the specified (x,y) location in the coordinate space.
* `double getX()` Returns the X coordinate of this Point2D in double precision.
* `double getY()` Returns the Y coordinate of this Point2D in double precision.
