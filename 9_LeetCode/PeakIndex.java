//  https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

// Q.> 852. Peak Index in a Mountain Array

/**
 * You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.

 

Example 1:

Input: arr = [0,1,0]

Output: 1

Example 2:

Input: arr = [0,2,1,0]

Output: 1

Example 3:

Input: arr = [0,10,5,2]

Output: 1

 

Constraints:

3 <= arr.length <= 105
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.
 */


public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    // --> better way
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;

            // Compare mid with mid + 1 to determine which half to search
            if (arr[mid] < arr[mid + 1]) {
                // Peak is in the right half
                start = mid + 1;
            } else {
                // Peak is in the left half (or could be mid)
                end = mid;
            }
        }

        // start and end will converge to the peak index
        return start;
    }

    //--> local way
    // public static int peakIndexInMountainArray(int[] arr) {
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while(start <= end){
    //         int mid = start + (end - start) / 2;
    //         if(arr[mid] < arr[mid + 1]){
    //             start = mid + 1;
    //         }else if(arr[mid] < arr[mid - 1]){
    //             end = mid - 1;
    //         }else{
    //             return mid;
    //         }
    //     }
    //     return -1;
    // }
}
