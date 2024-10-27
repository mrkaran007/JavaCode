//  https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

//Q.> 34.Find First and Last Position of Element in Sorted Array 
/**
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,8,8,8,8,10], target = 8
Output: [1,4]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
 */

public class SearchRange {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 8 };
        int target = 8;
        int[] ans = searchRange(nums, target);
        System.out.println("[" + ans[0] + "," + ans[1] + "]");
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 }; // Default result when target is not found

        // Edge case: if nums is empty, return the default answer.
        if (nums.length == 0) {
            return ans;
        }

        // Find the leftmost index of the target
        ans[0] = findLeftmost(nums, target);

        // Find the rightmost index of the target, only if the leftmost was found
        if (ans[0] != -1) {
            ans[1] = findRightmost(nums, target);
        }

        return ans;
    }

    // Helper method to find the leftmost occurrence of the target
    public static int findLeftmost(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int leftmost = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                leftmost = mid; // Found a potential leftmost index
                end = mid - 1; // Continue searching in the left half
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return leftmost;
    }

    // Helper method to find the rightmost occurrence of the target
    public static int findRightmost(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int rightmost = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                rightmost = mid; // Found a potential rightmost index
                start = mid + 1; // Continue searching in the right half
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return rightmost;
    }

}
