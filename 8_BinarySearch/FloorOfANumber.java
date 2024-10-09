// Floor ->> greatest element in array smaller or equal to target number
/** Q.> Find the floor of a number. */


public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 19, 33, 44 };
        int target = 15;
        int result = findFloor(arr, target);
        System.out.println("Floor of " + target + " is " + result);
    }

    public static int findFloor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            }else if (arr[mid] < target) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
