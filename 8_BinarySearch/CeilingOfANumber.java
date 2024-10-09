// Ceiling ->> smalest element in array greater or equal to target number
/** Q.> Find the ceiling of a number. */

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 19, 33, 44 };
        int target = 15;
        int result = findCeiling(arr, target);
        System.out.println("Ceiling of " + target + " is " + result);
    }

    public static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
