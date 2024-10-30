//  https://leetcode.com/problems/set-mismatch/description/

//  Q.> 645. Set Mismatch

/**
 * You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

 

Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]
 

Constraints:

2 <= nums.length <= 104
1 <= nums[i] <= 104
 */

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] set = { 1, 2, 2, 4 };
        int[] result = findErrorNums(set);
        System.out.println("Duplicate Number: " + result[0]);
        System.out.println("Missing Number: " + result[1]);
        System.out.println("Output: " + Arrays.toString(result));
    }

    // Swap method
    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static int[] findErrorNums(int[] nums) {
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

        // collect number that occurs twice and the number that is missing
        int duplicate = -1;
        int missing = -1;
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                duplicate = nums[i];
                missing = i + 1;
            }
        }

        return new int[] { duplicate, missing };
    }
}
