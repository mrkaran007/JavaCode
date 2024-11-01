public class Performance {
    public static void main(String[] args) {
        // Initialize an empty string
        String str = "";

        // Loop 26 times to generate all lowercase alphabets
        for (int i = 0; i < 26; i++) {
            // Convert the ASCII value of 'a' plus the loop counter to a character
            char ch = (char) ('a' + i);

            // Print the character followed by a space
            System.out.print(ch + " ");

            // Append the character to the string
            str += ch;
        }

        // Print a newline
        System.out.println();

        // Print the generated string
        System.out.println(str);
    }
}
// NOTE
/**
 * Limitations/Disadvantages:
 * 
 * Inefficient String Concatenation: The code uses the += operator to
 * concatenate strings in a loop, which can be inefficient because strings in
 * Java are immutable. Each time you concatenate a string, a new string object
 * is created, and the old one is discarded. This can lead to a lot of temporary
 * objects being created and garbage collected, which can negatively impact
 * performance.
 * 
 * --> to overcome it use StringBuilder because it is mutable
 */