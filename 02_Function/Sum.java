import java.util.Scanner;

public class Sum {
    public static void main(String [] args){
        // sum();
        // System.out.println("Sum by return method: "+sum2());
        int ans = sum3(5, 20);
        System.out.println("Sum by parameterised return method: "+ans);
    }
    
    // parameterised return method
    public static int sum3(int a, int b){
        int ans = a + b;
        return ans;
    }


    // return the value
    static int sum2(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int sum = a + b;
        return sum;
    }

    // void not return anything
    static void sum(){   // non static method cannot be referenced from static a context
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum : "+ sum);
    }
}
