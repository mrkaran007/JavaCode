import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        // Array is sorted in row or column pattern
        int[][] matrix = new int[][] {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };
        int target = 29;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    public static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[] { row, col };
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[] { -1, -1 };
    }
    // NOTE: 
    // This solution is based on the fact that the array is sorted in row or column pattern.
    // Time Complexity: O(n)
}
