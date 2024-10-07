// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

// Q.> 1295.Find numbers with even number of digits
/**
 * Given an array nums of integers, return how many of them contain an even
 * number of digits.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore only 12 and 7896 contain an even number of digits.
 * Example 2:
 * 
 * Input: nums = [555,901,482,1771]
 * Output: 1
 * Explanation:
 * Only 1771 contains an even number of digits.
 */


public class ContainsEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        int ans = findNumbers(nums);
        System.out.println("Number of elements contain an even number of digits are: " + ans);
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (checkEven(element)) {
                count++;
            }
        }
        return count;
    }

    // method to check wether a number contains even number of digits or not
    /*
     * public static boolean checkEven(int element){
     * String str = Integer.toString(element);
     * int length = str.length();
     * if (length % 2 == 0) {
     * return true;
     * }
     * return false;
     * }
     */

    // another method
    public static boolean checkEven(int element) {
        if (element < 0) {
            element = element * -1;
        }
        int numberOfDigits = (int) Math.log10(element) + 1; // This formula gives total number of digits present in a
                                                            // number
        return numberOfDigits % 2 == 0;
    }
}
