//  https://leetcode.com/problems/missing-number/description/

// Q.> 268. Missing Number

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return
 * the only number in the range that is missing from the array.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [3,0,1]
 * Output: 2
 * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range
 * [0,3]. 2 is the missing number in the range since it does not appear in nums.
 * Example 2:
 * 
 * Input: nums = [0,1]
 * Output: 2
 * Explanation: n = 2 since there are 2 numbers, so all numbers are in the range
 * [0,2]. 2 is the missing number in the range since it does not appear in nums.
 * Example 3:
 * 
 * Input: nums = [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Explanation: n = 9 since there are 9 numbers, so all numbers are in the range
 * [0,9]. 8 is the missing number in the range since it does not appear in nums.
 * 
 * 
 * Constraints:
 * 
 * n == nums.length
 * 1 <= n <= 104
 * 0 <= nums[i] <= n
 * All the numbers of nums are unique.
 * 
 * 
 * Follow up: Could you implement a solution using only O(1) extra space
 * complexity and O(n) runtime complexity?
 */

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println("Missing Number: " + missingNumber(nums));
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    /* Using Cyclic sort */
    public static int missingNumber(int[] arr) {
        int n = arr.length;
        int i = 0;

        // Cyclic sort
        while (i < n) {
            if (arr[i] < n && arr[arr[i]] != arr[i]) {
                // Place arr[i] at the correct index if it's within the range [0, n-1]
                swap(arr, arr[i], i);
            } else {
                i++;
            }
        }

        // After sorting, check for the missing number
        for (i = 0; i < n; i++) {
            if (arr[i] != i) {
                return i; // Return the missing number
            }
        }

        // If all indices match, then the missing number is n
        return n;
    }

    /* Using formual sum of natural number */
    // public static int missingNumber(int[] nums) {
    // int lastNum = nums.length; // last number of continous range from 0 to N
    // int totalSum = lastNum * (lastNum + 1) / 2; // use sum of N natural number
    // (because any number add with zero always be same number)
    // int arraySum = 0;
    // for (int i = 0; i < nums.length; i++) {
    // arraySum += nums[i]; // sum of number present in array
    // }
    // return totalSum - arraySum; // missing number
    // }
}
