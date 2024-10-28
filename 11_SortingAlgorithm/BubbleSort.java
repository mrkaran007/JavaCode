import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = { -64, 34, 25, -12, 22, 56 };
        System.out.println("Array before sorting: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = false;
                }
            }
            // If no elements were swapped, the array is already sorted
            if (isSorted) {
                break;
            }
        }
    }
}

// NOTE:
/**
 * Time Complexity:-
 * Best-case: O(n) when the array is already sorted
 * Average-case: O(n^2) when the array is randomly ordered
 * Worst-case: O(n^2) when the array is reverse sorted
 * Space Complexity: O(1)
 * Stability: Stable
 */
