# Java Classes
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
## String
* `char charAt(int index)` Returns the char value at the specified index.
* `boolean contains(CharSequence s)` Returns true if and only if this string contains the specified sequence of char values.
* `boolean endsWith(String suffix)` Tests if this string ends with the specified suffix.
* `boolean equals(Object anObject)` Compares this string to the specified object.
* `int length()` Returns the length of this string.
* `String replace(char oldChar, char newChar)` Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
* `String replace(CharSequence target, CharSequence replacement)` Replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence.
* `boolean startsWith(String prefix)` Tests if this string starts with the specified prefix.
* `String substring(int beginIndex)` Returns a new string that is a substring of this string.
* `String substring(int beginIndex, int endIndex)` Returns a new string that is a substring of this string.
* `char[] toCharArray()` Converts this string to a new character array.
* `String toLowerCase()` Converts all of the characters in this String to lower case using the rules of the default locale.
* `String toUpperCase()` Converts all of the characters in this String to upper case using the rules of the default locale.
* `static String valueOf(char[] data)` Returns the string representation of the char array argument.
* `static String valueOf(int i)` Returns the string representation of the int argument.
  * `valueOf` also applies to boolean, char, double, float, long.

