public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "Madam";
        System.out.println(str + " is palindrome? : " + isPalindrome(str));
    }

    // Method to check if a given string is a palindrome
    private static boolean isPalindrome(String str) {
        // Convert the string to lowercase to make the check case-insensitive
        if (str == null || str.length() == 0) {
            return true;
        }
        
        str = str.toLowerCase();
        int i = 0;                      // Initialize a pointer at the start of the string
        int j = str.length() - 1;       // Initialize a pointer at the end of the string

        // Compare characters from the start and end moving towards the center
        while (i < j) {
            // If characters at i and j don't match, it's not a palindrome
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;  // Move start pointer forward
            j--;  // Move end pointer backward
        }

        // If all characters matched, the string is a palindrome
        return true;
    }
}
