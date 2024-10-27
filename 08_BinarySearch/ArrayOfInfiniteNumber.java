//  https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

// Q.> Find position of an element in a sorted array of infinite numbers
/**
 * Suppose you have a sorted array of infinite numbers, how would you search an
 * element in the array?
 * Source: Amazon Interview Experience.
 */

public class ArrayOfInfiniteNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 }; // Imagine infinite number sorted array
        int target = 5;
        int result = ans(arr, target);
        if (result != -1) {
            System.out.println("Position of " + target + " is " + result);
        }else{
            System.out.println("Element not found in the array");
        }
    }

    public static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
            int newEnd = (end + 1) * 2;
            if (newEnd > arr.length) {
                newEnd = arr.length;
            }
            start = newStart;
            end = newEnd;
        }
        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        int left = start;
        int right = end;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
