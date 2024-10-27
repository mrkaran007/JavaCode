import java.util.Arrays;

public class PassingArrayInFunction {
    public static void main(String[] args) {
        int[] array2 = new int[5];
        array2[0] = 5;
        array2[1] = 10;
        array2[2] = 15;
        array2[3] = 20;
        array2[4] = 25;
        System.out.println("Array elements before passing to function: ");
        System.out.println(Arrays.toString(array2));
        passArray(array2);
        System.out.println("Array elements after passing to function: ");
        System.out.println(Arrays.toString(array2));
        /**
         * NOTE:
         * String are immutable in java, but arrays are mutable
         */
    }

    public static void passArray(int[] arr) {
        arr[0] = 100;
        arr[1] = 200;
    }
}
