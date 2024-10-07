import java.util.Scanner;
import java.util.Arrays;

public class InputAndPrintArray {
    public static void main(String[] args) {
        /* Array of primitives */
        // arrayOfPrimitives();

        /* Array of objects */
        arrayOfObjects();
    }

    public static void arrayOfObjects() {
        /* Array of objects */
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the string element at index " + i);
            str[i] = sc.nextLine();
        }
        sc.close();

        /* print Array of objects */
        System.out.println(Arrays.toString(str));

        // updating the value at index 1
        str[1] = "Captian America";
        System.out.println(Arrays.toString(str));
    }

    public static void arrayOfPrimitives() {
        /* Array of primitives */
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        // taking user input using for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the element at index " + i);
            arr[i] = sc.nextInt();
        }

        /* cannot take input at each index using for each loop */
        // for (int i : arr) {
        // System.out.println("Enter the element at index "+i);
        // arr[i] = sc.nextInt();
        // }
        sc.close();

        /* print array */

        // print using for loop
        // for(int i=0;i<5;i++){
        // System.out.println("Element at index "+i+" is "+arr[i]);
        // }

        // print using for loop but for array size using stl "arr.length"
        // for(int i=0;i<arr.length;i++){
        // System.out.println("Element at index "+i+" is "+arr[i]);
        // }

        // print using for each loop
        // System.out.println("Elements of array are:");
        // for (int i : arr) {
        // System.out.print(i+" ");
        // }

        // best way to print
        System.out.println(Arrays.toString(arr));
    }

}
