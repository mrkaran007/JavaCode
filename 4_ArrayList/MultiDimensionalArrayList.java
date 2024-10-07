import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // declaration of 2d ArrayList
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    // initialization
    for (int i = 0; i < 3; i++) {
        list.add(new ArrayList<>());
    }

    System.out.println("Enter the element in the ArrayList: ");
    // add element
    // list.get(0).add(10); // basic syntax
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            list.get(i).add(sc.nextInt());
        }
    }
    sc.close();
    // print element
    System.out.println(list);
}
    
}
