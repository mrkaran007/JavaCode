import java.util.Arrays;

class SelectionSort {
    public static void main(String[] args) {
        int[] array = { -64, 34, 25, -12, 22, 56 };
        System.out.println("Array before sorting: " + Arrays.toString(array));
        selectionSort(array);
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int maxIndex = 0;
            // Find the maximum element in the unsorted portion of the array
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap the found maximum element with the last element in the unsorted portion
            int lastIndex = array.length - i - 1;
            int temp = array[maxIndex];
            array[maxIndex] = array[lastIndex];
            array[lastIndex] = temp;
        }
    }
}

// NOTE:
/**
 * Time Complexity:-
 * Best Case: O(n^2)
 * Average Case: O(n^2)
 * Worst Case: O(n^2)
 * Space Complexity: O(1)
 * Stability: Not Stable
 * 
 */
 
 /** 
 * Note: This algorithm is not suitable for large data sets as its average and
 * worst case time complexity
 * is of Ο(n^2) where n is the number of items. However, it is
 * suitable for small data sets.
 */