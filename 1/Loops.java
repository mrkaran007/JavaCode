import java.util.Scanner;

public class Loops {
    public static void main(String [ ] args){
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        for(int i = 1; i<= n; i++){
            System.out.print(i+ " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }

        System.out.print("Enter something in string: ");
        char str = in.next().trim().charAt(1);
        // System.out.println(str.trim());   // trim() use to remove spaces
        System.out.println(str);
    }
}
