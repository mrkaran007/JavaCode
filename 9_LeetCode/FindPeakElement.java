//  https://leetcode.com/problems/find-peak-element/description/

// Q.> 162. Find Peak Element

/**
 * A peak element is an element that is strictly greater than its neighbors.
 * 
 * Given a 0-indexed integer array nums, find a peak element, and return its
 * index. If the array contains multiple peaks, return the index to any of the
 * peaks.
 * 
 * You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is
 * always considered to be strictly greater than a neighbor that is outside the
 * array.
 * 
 * You must write an algorithm that runs in O(log n) time.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,1]
 * Output: 2
 * Explanation: 3 is a peak element and your function should return the index
 * number 2.
 * Example 2:
 * 
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 5
 * Explanation: Your function can return either index number 1 where the peak
 * element is 2, or index number 5 where the peak element is 6.
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 1000
 * -231 <= nums[i] <= 231 - 1
 * nums[i] != nums[i + 1] for all valid i.
 */

public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 5, 6, 4 };
        System.out.println("Index: " + findPeakElement(arr));
    }

    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Check if mid is less than its next element
            if (nums[mid] < nums[mid + 1]) {
                // The peak must be in the right half
                start = mid + 1;
            } else {
                // The peak is in the left half (could include mid)
                end = mid;
            }
        }

        // start and end will converge to the peak index
        return start;
    }

}

/**
 * Explanation:
 * Binary Search:
 * If nums[mid] < nums[mid + 1], the peak must be in the right half (since we
 * are in an increasing sequence).
 * Otherwise, the peak is in the left half (or mid itself could be the peak).
 * 
 * Loop Terminates: When start == end, this index will be the peak element
 * because there will be no more elements to check.
 * 
 * Time Complexity:
 * The time complexity remains O(log n) because each iteration reduces the
 * search space by half (binary search).
 */
