/**OrderAgnosticBinarySearch --> Means Array is given in sorted order, but we don't know wheter it is in Ascending or Descending order.  */

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        // int[] arr = { 1, 1, 1, 2, 3, 4, 5, 55, 64, 66 };
        int[] arr = {66, 63, 61, 59, 58, 55, 40, 33 };
        int target = 55;
        int result = orderAgnosticBinarySearch(arr, target);
        if(result != -1) {
            System.out.println("Element is present at index " + result);
        }else{
            System.out.println("Element not found.");
        }
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] <= arr[end]) {
            return ascendingBinarySearch(arr, target);
        }

        return descendingBinarySearch(arr, target);
    }

    public static int ascendingBinarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right) {
            // int mid = (left + end)/2;  // might be possible that (left + end) exceeds the range of int in java
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) {
                return mid;
            }else if(arr[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int descendingBinarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right) {
            // int mid = (left + end)/2;  // might be possible that (left + end) exceeds the range of int in java
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) {
                return mid;
            }else if(arr[mid] < target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}