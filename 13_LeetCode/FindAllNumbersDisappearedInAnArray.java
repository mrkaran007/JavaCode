//  https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

// Q.> 448. Find All Numbers Disappeared in an Array
/**
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
 

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
 

Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 */

import java.util.*;
class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println("Dissapeared number: " + findDisappearedNumbers(nums));
    }

    // method to swap elements in the array
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int i = 0;

        // Cyclic sort
        while (i < n) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // Collect missing numbers
        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) { // Checking missing number
                result.add(j + 1);
            }
        }
        return result;
    }
}