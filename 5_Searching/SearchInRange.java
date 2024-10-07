public class SearchInRange {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 64, 64, 322, 645 };
        int s = 2;
        int e = 4;
        int target = 64;
        int index = searchInRange(arr, s, e, target);
        if (index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index : " + index);
        }
    }

    static int searchInRange(int[] arr, int starIndex, int endIndex, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = starIndex; i <= endIndex; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}