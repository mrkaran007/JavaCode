import java.util.Arrays;
// --> When ever given number from range 1 to N, use cyclic sort
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 5};  // Range should be continous from 1 to N
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*  My way */
    // private static void cyclicSort(int[] arr){
    //     int i = 0;
    //     while (i < arr.length) {
    //         int correctIndex = arr[i] - 1;
    //         if (correctIndex != i) {
    //             swap(arr, correctIndex, i);
    //         }else{
    //             i++;
    //         }
    //     }
    // }
    
    /* Another way */
    private static void cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[correct] != arr[i]) {
                swap(arr, correct, i);
            }else{
                i++;
            }
        }
    }


    private static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
