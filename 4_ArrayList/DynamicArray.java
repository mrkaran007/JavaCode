import java.util.*;
public class DynamicArray {
    public static void main(String[] args) {
        /**
         * Syntax:
         *  ArrayList<datatype> array_name = new ArrayList<datatype>(initial capacity);
         * or
         *  ArrayList<datatype> array_name = new ArrayList<>(initial capacity);
         * or
         *  ArrayList array_name = new ArrayList();  --> not a good practice, always define datatype
         * or
         *  ArrayList<datatype> array_name = new ArrayList<>();  --> best way
         */
        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>(5);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);
        // list.add(60);
        // list.add(30);
        // list.add(40);
        // list.add(50);
        // list.add(60);
        // System.out.println("ArrayList: " + list);
        // System.out.println("Size of ArrayList: "+list.size());
        // list.set(0, 99); // update the ArrayList
        // System.out.println("Updated ArrayList: "+ list);
        // System.out.println("Check ArrayList contain 50: "+ list.contains(50));
        // list.remove(1);
        // System.out.println("Updated ArrayList after removing element at index 1: "+ list);

        // adding element in ArrayList by taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add to the ArrayList: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // print
        System.out.println("ArrayList: " + list);

        // get item at any index
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i));   // pass index here; list[index] syntax will not work here
        }
        sc.close();
    }
}
