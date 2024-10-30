//  https://leetcode.com/problems/find-the-duplicate-number/description/

// Q.> 287. Find the Duplicate Number
/**
 * Given an array of integers nums containing n + 1 integers where each integer
 * is in the range [1, n] inclusive.
 * 
 * There is only one repeated number in nums, return this repeated number.
 * 
 * You must solve the problem using only constant extra space.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,3,4,2,2]
 * Output: 2
 * Example 2:
 * 
 * Input: nums = [3,1,3,4,2]
 * Output: 3
 * Example 3:
 * 
 * Input: nums = [3,3,3,3,3]
 * Output: 3
 * 
 * 
 * Constraints:
 * 
 * 1 <= n <= 105
 * nums.length == n + 1
 * 1 <= nums[i] <= n
 * All the integers in nums appear only once except for precisely one integer
 * which appears two or more times.
 * 
 * 
 * Follow up:
 * 
 * How can we prove that at least one duplicate number must exist in nums?
 * Can you solve the problem in linear runtime complexity?
 */

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2 };
        System.out.println("Duplicate number is: " + findDuplicate(nums));
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;

        // Modify the original array
        // Cyclic sort with in-place detection of duplicate
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                // If there's already the correct number at this position, move to the next index
                if (i != correctIndex) {
                    return nums[i];  // Duplicate found
                }
                i++;
            }
        }

        return -1;
    }
}
