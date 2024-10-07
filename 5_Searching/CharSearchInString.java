public class CharSearchInString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char target = 'W';
        
        int index = search(str, target);
        if (index != -1) {
            System.out.println("Target character '" + target + "' found at index " + index);
        } else {
            System.out.println("Target character '" + target + "' not found in the string");
        }
        
        // another method: using indexof method
        searchUsingIndexOf(str, target);
        
        // another method: using for each loop and converting string to char array
        searchUsingForEach(str, target);
    }

    static boolean searchUsingForEach(String str, char target){
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    static void searchUsingIndexOf(String str, char target){
        int index = str.indexOf(target); // indexof method returns the first occurrence of the specified character or -1 if it is not found
        if (index != -1) {
            System.out.println("Target character '" + target + "' found at index " + index);
        } else {
            System.out.println("Target character '" + target + "' not found in the string");
        }
    }

    static int search(String str, char target){
        if (str.length() == 0) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }

    
}
