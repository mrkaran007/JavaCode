//  https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

// Q.> 81. Search in Rotated Sorted Array II

/**
 * There is an integer array nums sorted in non-decreasing order (not
 * necessarily with distinct values).
 * 
 * Before being passed to your function, nums is rotated at an unknown pivot
 * index k (0 <= k < nums.length) such that the resulting array is [nums[k],
 * nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For
 * example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become
 * [4,5,6,6,7,0,1,2,4,4].
 * 
 * Given the array nums after the rotation and an integer target, return true if
 * target is in nums, or false if it is not in nums.
 * 
 * You must decrease the overall operation steps as much as possible.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [2,5,6,0,0,1,2], target = 0
 * Output: true
 * Example 2:
 * 
 * Input: nums = [2,5,6,0,0,1,2], target = 3
 * Output: false
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 5000
 * -104 <= nums[i] <= 104
 * nums is guaranteed to be rotated at some pivot.
 * -104 <= target <= 104
 */

public class SearchInSortedRotatedArrayContainsDuplicateElement {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 4 };
        int target = 0;
        System.out.println(search(nums, target));
    }

    public static boolean search(int[] nums, int target) {
        int pivot = findPivotInDuplicateArray(nums);
        if (pivot == -1) {
            // If no pivot is found, the array is not rotated
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If target is at pivot
        if (nums[pivot] == target) {
            return true;
        }

        // If target is in the left sorted portion
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // If target is in the right sorted portion
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    // This method handles finding the pivot in a rotated sorted array with duplicates
    private static int findPivotInDuplicateArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the pivot
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // If duplicates are found at start, mid, and end, shrink the window
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (nums[mid] > nums[start] || (nums[mid] == nums[start] && nums[mid] > nums[end])) {
                // Left half is sorted, so the pivot is in the right half
                start = mid + 1;
            } else {
                // Right half is sorted, so the pivot is in the left half
                end = mid - 1;
            }
        }
        return -1;
    }

    // Standard binary search on a sorted subarray
    private static boolean binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

}
