public class FindMinAndMaxNumber {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 53, 452 },
                { 234, 56, 657, 34 },
                { 34, 75 },
                { 233, 450, 67, 89, 90, 34 }
        };
        int min = findMin(arr);
        System.out.println("Minimum number in the array is : " + min);
        int max = findMax(arr);
        System.out.println("Maximum number in the array is : " + max);
    }

    static int findMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] > max) {
                    max = arr[row][column];
                }
            }
        }
        return max;
    }

    static int findMin(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] < min) {
                    min = arr[row][column];
                }
            }
        }
        return min;
    }
}
