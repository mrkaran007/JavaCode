import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class LinearSearchWithExceptionHandel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size;
        while (true) {
            try {
                size = sc.nextInt();
                if (size < 0) {
                    System.out.println("Size cannot be negative. Please enter a non-negative integer.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next();
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    arr.add(sc.nextInt());
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    sc.next();
                }
            }
        }

        System.out.println("Enter the element to search in the array: ");
        int element;
        while (true) {
            try {
                element = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next();
            }
        }

        int ans = linearSearch(arr, element);
        if (ans == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + ans);
        }

        sc.close();
    }

    static int linearSearch(ArrayList<Integer> arr, int element) {
        if (arr == null || arr.size() < 1) {
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

// NOTE:--
// --> It is a advance form of linear search form normal one. It handel all exception.. 
/**
 * The code provided is a simple implementation of a linear search algorithm in Java. It takes an array of integers as input from the user and searches for a specific element in the array. If the element is found, it prints the index of the element; otherwise, it prints "Element not found."

There are no syntax errors in the code. However, there are a few potential logical errors or areas for improvement:

The code does not handle the case where the user enters a non-integer value when prompted to enter the size of the array or the elements of the array. This could lead to an InputMismatchException.

The code does not handle the case where the user enters a negative size for the array. This could lead to an IllegalArgumentException when trying to create an array of negative size.

The code does not handle the case where the user enters a size of 0 for the array. While this is not an error per se, it might be unexpected behavior to search an empty array.

The linearSearch method does not check if the array is null before trying to access its elements. This could lead to a NullPointerException if the array is null.
 */