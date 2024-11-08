//  https://leetcode.com/problems/flipping-an-image/description/

// Q.> 832. Flipping an Image
/**
 * Given an n x n binary matrix image, flip the image horizontally, then invert
 * it, and return the resulting image.
 * 
 * To flip an image horizontally means that each row of the image is reversed.
 * 
 * For example, flipping [1,1,0] horizontally results in [0,1,1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced
 * by 0.
 * 
 * For example, inverting [0,1,1] results in [1,0,0].
 * 
 * 
 * Example 1:
 * 
 * Input: image = [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 * Example 2:
 * 
 * Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Explanation: First reverse each row:
 * [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * 
 * 
 * Constraints:
 * 
 * n == image.length
 * n == image[i].length
 * 1 <= n <= 20
 * images[i][j] is either 0 or 1.
 */

import java.util.Arrays;

public class FlippingAnImage {

    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int[][] result = flipAndInvertImage(image);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            // Reverse the array
            int i = 0;
            int j = image[0].length - 1;
            while (i <= j) {
                // Flip and invert elements at positions i and j
                int temp = row[i] ^ 1;
                row[i] = row[j] ^ 1;
                row[j] = temp;

                i++;
                j--;
            }
        }
        return image;
    }
}