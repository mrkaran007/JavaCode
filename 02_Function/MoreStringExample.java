import java.util.Arrays;

public class MoreStringExample {
    public static void main(String[] args) {
        String name = "Iron man";
        change(name);
        System.out.println("Printing name after assign new string by returing the string value by naam : "+ name);  // print Iron man


        String ans = change(name);
        System.out.println("Printing naam after assign new string by returing the string value : "+ ans);  // print Captian America

        int array[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(array)); 
        changeInArray(array);
        System.out.println(Arrays.toString(array)); 
    }

    // java does not support pass by reference, only support pass by value b/c java not support pointers
    // pass by value -> changes made inside the function are not reflected in the original value
    // pass by refernce -> changes made inside the function are reflected in the original value
    public static String change(String naam){
        System.out.println("Printing naam from inside the function before assign new string : "+ naam);
        naam = "Captian America";    // not changing, creating new object
        return naam;
    }

    public static void changeInArray(int[] arr){
        // if you make a change to the object via this ref variable, same object will be changed
        arr[0] = 99;  // changing the original one, not creating new object
    }
}
