//  https://leetcode.com/problems/find-in-mountain-array/description/

// Q.> 1095. Find in Mountain Array

/**
 * (This problem is an interactive problem.)
 * 
 * You may recall that an array arr is a mountain array if and only if:
 * 
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * Given a mountain array mountainArr, return the minimum index such that
 * mountainArr.get(index) == target. If such an index does not exist, return -1.
 * 
 * You cannot access the mountain array directly. You may only access the array
 * using a MountainArray interface:
 * 
 * MountainArray.get(k) returns the element of the array at index k (0-indexed).
 * MountainArray.length() returns the length of the array.
 * Submissions making more than 100 calls to MountainArray.get will be judged
 * Wrong Answer. Also, any solutions that attempt to circumvent the judge will
 * result in disqualification.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: array = [1,2,3,4,5,3,1], target = 3
 * Output: 2
 * Explanation: 3 exists in the array, at index=2 and index=5. Return the
 * minimum index, which is 2.
 * Example 2:
 * 
 * Input: array = [0,1,2,4,2,1], target = 3
 * Output: -1
 * Explanation: 3 does not exist in the array, so we return -1.
 * 
 * 
 * Constraints:
 * 
 * 3 <= mountain_arr.length() <= 104
 * 0 <= target <= 109
 * 0 <= mountain_arr.get(index) <= 109
 */

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,3,1};
        int target = 3;
        int ans = findInMountainArray(target, arr);
        System.out.println(ans);
    }

    // --> better way.. {less Line of code}
    public static int findInMountainArray(int target, int[] arr) {
        int peakIndex = findPeakElement(arr);
        int ans = binarySearch(arr, 0, peakIndex, target, true);
        if (ans != -1) {
            return ans;
        }
        return binarySearch(arr, peakIndex, arr.length - 1, target, false);
    }
    
    public static int binarySearch(int[] arr, int left, int right, int target, boolean asc) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if ((asc && arr[mid] < target) || (!asc && arr[mid] > target)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
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

    // --> mine way..
    /* 
    public static int findInMountainArray(int target, int[] arr){
        int peakIndex = findPeakElement(arr);
        int ans = leftSearch(target, arr, peakIndex);

        if (ans != -1) {
            return ans;
        }

        return rightSearch(target, arr, peakIndex + 1);
    }

    public static int leftSearch(int target, int[] arr, int peakIndex){
        int left = 0;
        int right = peakIndex;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            }else if (arr[mid] < target) {
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }

    public static int rightSearch(int target, int[] arr, int peakIndex){
        int left = peakIndex;
        int right = arr.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            }else if (arr[mid] < target) {
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
    */ 
    //--> end of mine way..

}
