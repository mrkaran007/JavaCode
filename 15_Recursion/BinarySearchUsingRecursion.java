public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 5;
        int result = binarySearch(arr, target, 0, arr.length - 1);  // Call binary search with start and end indices

        if (result != -1) {
            System.out.println("Element is present at index " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

    // Recursive binary search function
    private static int binarySearch(int[] arr, int target, int start, int end) {
        // Calculate mid-point of current range
        int mid = start + (end - start) / 2;

        // Base case: if start index exceeds end index, target is not found
        if (start > end) {
            return -1;
        }

        // If target is found at mid index, return mid
        if (arr[mid] == target) {
            return mid;
        }

        // If target is greater than mid element, search in the right half
        if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, end);
        }

        // If target is less than mid element, search in the left half
        return binarySearch(arr, target, start, mid - 1);
    }
}
