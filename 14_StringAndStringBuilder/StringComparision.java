/*  NOTE */
// String pool:-
/**
 * The string pool (also known as the string intern pool) is a special area in
 * the Java memory where string literals are stored. It is part of the Java heap
 * memory and is used to optimize memory usage and improve performance when
 * dealing with string objects. Here are some key points about the string pool:
 * 
 * String Literals: When you create a string using a string literal (e.g.,
 * String str = "Hello";), Java checks the string pool to see if an identical
 * string already exists. If it does, the reference to that existing string is
 * returned. If not, a new string object is created in the pool.
 * 
 * Memory Efficiency: By storing identical string literals in a single location,
 * the string pool reduces memory usage. Multiple references to the same string
 * literal can share the same memory location, which is particularly beneficial
 * for applications that use many identical strings.
 * 
 * Interning Strings: You can manually add strings to the pool or retrieve
 * existing strings using the intern() method. When you call str.intern(), it
 * checks the string pool for an existing string that has the same value. If
 * found, it returns the reference to that string; otherwise, it adds the new
 * string to the pool and returns its reference.
 * 
 * Difference from Heap Memory: Strings created with the new keyword (e.g., new
 * String("Hello")) are stored in the heap memory, not in the string pool. Each
 * call to new String() creates a new object, even if the string value is the
 * same as an existing string in the pool.
 * 
 * Comparison: When comparing strings, using == checks if two references point
 * to the same object (in memory), while .equals() checks if the actual string
 * values are the same.
 * 
 * Overall, the string pool is an important feature of Java that helps manage
 * memory efficiently and optimizes string handling.
 */

public class StringComparision {
    public static void main(String[] args) {
        // str1 and str2 point to the same reference in the string pool
        String str1 = "Hello"; // "Hello" is created in the string pool
        String str2 = "Hello"; // str2 references the same string literal as str1
        System.out.println(str1 == str2); // Compare references: true, as both point to the same object in the pool
        System.out.println(str1.equals(str2));  // Compare values: true, as both strings contain the same characters

        // str3 is created as a new String object in heap memory
        String str3 = new String("Hello"); // Creates a new String object, not in the string pool
        String str4 = "Hello"; // str4 references the string literal in the string pool
        System.out.println(str3 == str4); // Compare references: false, as str3 and str4 point to different objects
        System.out.println(str3.equals(str4)); // Compare values: true, as both strings contain the same characters

        String str5 = "Karan johar";
        System.out.println(str5.charAt(0));
        int n = str5.length();
        System.out.println(n);
    }
}