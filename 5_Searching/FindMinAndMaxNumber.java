public class FindMinAndMaxNumber {
    public static void main(String[] args) {
        int arr[] = { 102, 223, 64, 64, 322, 645 };
        int min = findMin(arr);  
        System.out.println("Minimum number in the array is : "+ min); 
        int max = findMax(arr);
        System.out.println("Maximum number in the array is : "+ max); 
    }
    static int findMin(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    static int findMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
