import java.util.Scanner;
import java.util.ArrayList;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        // int[] arr = new int[size];
        ArrayList<Integer> arr  = new ArrayList<>();
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Enter the element to search in the array: ");
        int element = sc.nextInt();

        int index = linearSearch(arr, element);
        if (index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index : "+ index);
        }



        // linear search by using for each loop:
        boolean ans = linearSearchUsingForEach(arr, element);
        if (ans) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found. ");
        }

        sc.close();
    }

    static boolean linearSearchUsingForEach(ArrayList<Integer> arr, int element){
        if (arr.size() < 1) {
            return false;
        }

        for (int i : arr) {
            if (i == element) {
                return true;
            }
        }

        return false;
    }

    static int linearSearch(ArrayList<Integer> arr, int element){
        if (arr.size() < 1) {
            return -1;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == element) {
                return i;    
            }
        }
        return -1;
    }
}
