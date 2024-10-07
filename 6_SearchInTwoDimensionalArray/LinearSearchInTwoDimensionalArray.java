import java.util.Arrays;
public class LinearSearchInTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 53, 452 },
                { 234, 56, 657, 34 },
                { 34, 75 },
                { 233, 450, 67, 89, 90, 34 }
        };
        int target = 450;
        int[] index = search(arr, target);
        if (index != null) {
            // System.out.println("Element " + target + " found at index [" + index[0] + ", " + index[1] + "].");
            System.out.println("Element " + target + " found at index " +Arrays.toString(index));
        } else {
            System.out.println("Element" + target + " not found.");
        }

        
    }

    static int[] search(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[] {};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target) {
                    return new int[] { row, column }; // we not return simply {row, column} b/c not initialize the array directly without declaration
                }
            }
        }
        return new int[] {};
    }
}
