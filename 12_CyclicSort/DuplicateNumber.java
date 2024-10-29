//  https://leetcode.com/problems/find-the-duplicate-number/description/

// Q.> 287. Find the Duplicate Number
/**
 * Given an array of integers nums containing n + 1 integers where each integer
 * is in the range [1, n] inclusive.
 * 
 * There is only one repeated number in nums, return this repeated number.
 * 
 * You must solve the problem without modifying the array nums.
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
public class DuplicateNumber {
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
        int n = nums.length;
        int[] temp = new int[n];

        // without constant extra space
        for (int i = 0; i < n; i++) {
            temp[i] = nums[i];
        }

        // Cyclic sort
        int i = 0;
        while (i < n) {
            int correctIndex = temp[i] - 1;
            if (temp[i] != temp[correctIndex]) {
                swap(temp, i, correctIndex);
            } else {
                i++;
            }
        }

        // checking dupicate
        int result = -1;
        for (int j = 0; j < n; j++) {
            if (j + 1 != temp[j]) { 
                result = temp[j];
                break;
            }
        }
        return result;
    }
}
