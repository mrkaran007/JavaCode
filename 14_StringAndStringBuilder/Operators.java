import java.util.*;
public class Operators {
    public static void main(String[] args) {
        // Adding two characters 'a' and 'b' results in their ASCII values summed up
        System.out.println('a' + 'b'); // Outputs: 195
        
        // Concatenating two strings "a" and "b"
        System.out.println("a" + "b"); // Outputs: ab
        
        // Adding a character 'a' and an integer 3 results in the ASCII value of 'a' plus 3
        System.out.println('a' + 3); // Outputs: 100 (ASCII value of 'a' is 97 + 3)
        
        // Casting the result back to a character, which gives 'd'
        System.out.println((char)('a' + 3)); // Outputs: d
        
        // Concatenating a string "a" with an integer 1, where 1 is converted to a String
        System.out.println("a" + 1); // Outputs: a1
        // here 1 (i.e, int) is converted as Interger (i.e. wrapper class) that will call toString()
        
        // Concatenating a string "a" with a character 'b'
        System.out.println("a" + 'b'); // Outputs: ab

        // Concatenating a string "Karan" with an empty ArrayList results in the string "Karan[]"
        System.out.println("Karan" + new ArrayList<>()); // Outputs: Karan[]
        
        // Concatenating a string "Karan" with an Integer object results in "Karan21", but it mark as remove
        // System.out.println("Karan" + new Integer(21)); // Outputs: Karan21
        
        // The following line is commented out because it would cause a compilation error
        // System.out.println(new ArrayList<>() + new Integer(22)); // gives error
        
        // Concatenating an empty ArrayList with a space and an Integer results in "[ ] 22"
        // System.out.println(new ArrayList<>() + " " + new Integer(22)); // Outputs: [] 22
    
    }
}