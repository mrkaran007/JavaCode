//  https://leetcode.com/problems/first-missing-positive/description/

// Q.> 41. First Missing Positive

/**
 * Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
 */

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }

    // Method to swap elements at indices start and end in the array
    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;

        // Cyclic sort: place each positive integer x between 1 and n at index x - 1
        while (i < n) {
            int correctIndex = nums[i] - 1;
            // Check if nums[i] is within the range [1, n] and not in its correct position
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correctIndex]) {
                // Swap nums[i] with the element at its correct position
                swap(nums, i, correctIndex);
            } else {
                // Move to the next index if element is already in the correct place or out of range
                i++;
            }
        }

        // After sorting, find the first index where nums[i] != i + 1
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                // Return the smallest missing positive integer, i + 1
                return i + 1;
            }
        }

        // If all elements are in their correct positions, the missing integer is n + 1
        return n + 1;
    }
}
