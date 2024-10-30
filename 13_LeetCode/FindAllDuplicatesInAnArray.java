//  https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

// Q.> 442. Find All Duplicates in an Array
/**
 * Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]
Example 3:

Input: nums = [1]
Output: []
 

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
Each element in nums appears once or twice.
 */

import java.util.*;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println("All duplicates are: " + findDuplicates(nums));
    }

    // Swap method
    private static void swap(int[] arr, int start, int end) {
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;

        // Cyclic sort to place numbers in their correct positions
        while (i < n) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // Collect all duplicates
        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1 && !result.contains(nums[j])) {
                result.add(nums[j]);
            }
        }

        return result;
    }
}
