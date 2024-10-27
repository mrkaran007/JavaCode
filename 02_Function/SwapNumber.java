import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number a = ");
        int a = sc.nextInt();
        System.out.print("Enter second number b = ");
        int b = sc.nextInt();
        swap(a,b);
        // original value a & b not changes(swapped) 
    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
   
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // this change will be valid in this function scope only
    }
}
