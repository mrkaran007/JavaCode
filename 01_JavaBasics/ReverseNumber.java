import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = input.nextInt();
        System.out.print("Reverse of the number " + n + " is : ");
        int rev = 0;
        while (n != 0) {
            int temp = n % 10;
            rev = rev * 10 + temp;
            n /= 10;
        }
        System.out.println(rev);
    }
}
