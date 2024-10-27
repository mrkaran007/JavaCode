import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int target = 11;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    private static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int cMid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][cMid] == target) {
                return new int[] { row, cMid };
            }
            if (matrix[row][cMid] > target) {
                cEnd = cMid - 1;
            } else {
                cStart = cMid + 1;
            }
        }
        return new int[] { -1, -1 };
    }

    private static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        if (row == 1) {
            binarySearch(matrix, row, 0, col - 1, target);
        }

        int rStart = 0;
        int cStart = 0;
        int rEnd = row - 1;
        int cEnd = col - 1;
        int cMid = cStart + (cEnd - cStart) / 2;

        // Narrow down to two rows
        while (rStart < rEnd - 1) { // While more than two rows remain
            int rMid = rStart + (rEnd - rStart) / 2;
            if (matrix[rMid][cMid] == target) {
                return new int[] { rMid, cMid };
            }
            if (matrix[rMid][cMid] > target) {
                rEnd = rMid;
            } else {
                rStart = rMid;
            }
        }

        // Now only two row remaining
        // Check the middle column of the two remaining rows
        if (matrix[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        }
        if (matrix[rEnd][cMid] == target) {
            return new int[] { rEnd, cMid };
        }
        
        // Check the four quarters of the two rows
        // 1st quarter
        if (target < matrix[rStart][cMid]){
            return binarySearch(matrix, rStart, cStart, cMid - 1, target);
        }
        // In 2nd quarter
        if (target > matrix[rStart][cMid]  && target <= matrix[rStart][cEnd]){
            return binarySearch(matrix, rStart, cMid+1, cEnd, target);
        }  
        // In 3rd quarter
        if (target < matrix[rEnd][cMid]){
            return binarySearch(matrix, rEnd, cStart, cMid - 1, target);
        }
        // 4th quarter
        return binarySearch(matrix, rEnd, cMid+1, cEnd, target);

    }
}
