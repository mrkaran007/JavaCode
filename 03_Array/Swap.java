import java.util.Arrays;
public class Swap {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Array before swap: "+ Arrays.toString(arr));
        swap(arr, 0, 4);
        System.out.println("Array after swap: "+ Arrays.toString(arr));

        maxItem(arr);
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void maxItem(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum item in array is: "+max);
    }
}
