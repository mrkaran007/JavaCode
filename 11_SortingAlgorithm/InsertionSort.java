import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = { -64, 34, 25, -12, 22, 56 };
        System.out.println("Array before sorting: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }

    /* Modified.. */
    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) { // Start from the second element
            for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
                swap(array, j, j - 1);
            }
        }
    }

    /* My way.. */
    // private static void insertionSort(int[] array) {
    // for (int i = 0; i < array.length - 1; i++) {
    // for (int j = i + 1; j > 0; j--) {
    // if (array[j] <= array[j - 1]) {
    // swap(array, j, j-1);
    // }else{
    // break;
    // }
    // }
    // }
    // }

    /* Some Improvement.. */
    // private static void insertionSort(int[] array) {
    // for (int i = 1; i < array.length; i++) {
    // int key = array[i];
    // int j = i - 1;
    // while (j >= 0 && key < array[j]) {
    // array[j + 1] = array[j];
    // j--;
    // }
    // array[j + 1] = key;
    // }
    // }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

// NOTE:
/**
 * Time Complexity:-
 * Best Case: O(n) - when array is already sorted
 * Average Case: O(n^2) - when array is randomly sorted
 * Worst Case: O(n^2) - when array is reverse sorted
 * Space Complexity: O(1) - as it uses constant space for variables
 * Stability: Stable - as it maintains the relative order of equal elements
 */
