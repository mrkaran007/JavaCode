import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    /**
     * 2d arrays look like:
     * [
     * [1, 2, 3],
     * [4, 5, 6],
     * [7, 8, 9]
     * ]
     * ---> Imagine this as an array of arrays
     * at index 0 : [1, 2, 3]
     * at index 1 : [4, 5, 6]
     * at index 2 : [7, 8, 9]
     * > Now imagine each of these inner arrays as a single element
     * 
     * ---> It can be like this:
     * [
     * [1, 2, 3],
     * [4, 5],
     * [7, 8, 9, 10, 11]
     * ]
     * > Not always the row and column be same at each index.
     * 
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Syntax:
         * datatype[][] array_name = new datatype[row size][column size];
         * NOTE --> column size is not mandatory, but row size is mandatory.
         * e.g -> int[][] array = new int[3][3]; || int[][] array = new int[3][]; ->
         * both are correct
         */

        // int[][] array = new int[3][4];
        // System.out.println(array.length); // give length of row i.e. 3
        // System.out.println(array[0].length); // give length of column of a particula
        // index(row)

        // int[][] arr1 = {
        // { 1, 2, 3 }, // 0th index
        // { 4, 5, 6 }, // 1st index
        // { 7, 8, 9 } // 2nd index -> arr[2] = [7, 8, 9]
        // };

        // int[][] arr2 = {
        // { 1, 2 },
        // { 4, 5, 6 },
        // { 7, 8, 9, 10, 21 }
        // };

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements in the array");
        // user input in an array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the element at index [" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Elements in the array are: ");
        // print the array
        // for (int i = 0; i < arr.length; i++) { // for each row
        // for (int j = 0; j < arr[i].length; j++) { // for each column in every row
        // System.out.print(arr[i][j]+" ");
        // }
        // System.out.println();
        // }

        // for (int row = 0; row < arr.length; row++) {
        // System.out.println(Arrays.toString(arr[row]));
        // }

        // print the array using for each loop
        for (int[] row : arr) { // here datatype is array itself b/c , in 2d array every element is an array
                                // itself
            System.out.println(Arrays.toString(row));
        }


        arrayOfNotFixedSize();
    }

    static void arrayOfNotFixedSize() {
        // int[][] arr = new int[3][]; // declare array of size 3 but
        // not fixed size of inner array
        // arr[0] = new int[3];
        // arr[1] = new int[4];

        int arr2[][] = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9 },
                { 10, 11, 12, 13, 14, 15, }
        };

        System.out.println("Elements in the not fixed size array are: ");
        for (int row = 0; row < arr2.length; row++) { // for each row
            for (int col = 0; col < arr2[row].length; col++) { // for each column in every row
                System.out.print(arr2[row][col] + " ");
            }
            System.out.println();
        }
    }
}
