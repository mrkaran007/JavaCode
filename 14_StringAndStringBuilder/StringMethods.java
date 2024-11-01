import java.util.Arrays; // Importing the Arrays class from the java.util package

public class StringMethods{ // Defining a new public class named StringMethods
    public static void main(String[] args){ // Defining the main method where the program starts
        String str = " Karan  Johar "; // Creating a new String object and initializing it with the value " Karan  Johar "
        System.out.println("Original String: " + str); // Printing the original string to the console
        System.out.println(Arrays.toString(str.toCharArray())); // Converting the string to a character array and printing it to the console
        System.out.println(str.strip()); // Removing the spaces at the beginning and end of the string
        System.out.println(str.trim()); // Also removing the spaces at the beginning and end of the string (same as strip())
        System.out.println(str.toUpperCase()); // Converting all the characters in the string to uppercase
        System.out.println(str); // Printing the original string to the console again
        System.out.println(str.charAt(2)); // Printing the character at index 2 of the string
        System.out.println(str.indexOf('J')); // Finding the index of the first occurrence of the character 'J' in the string
        System.out.println(Arrays.toString(str.split(" "))); // Splitting the string into an array of substrings based on the delimiter " " (space)
        System.out.println(Arrays.toString(str.split("a"))); // Splitting the string into an array of substrings based on the delimiter "a"
    }
    // All these function create new objects, not changing the original one.
    // And as you know String is immutable.
}