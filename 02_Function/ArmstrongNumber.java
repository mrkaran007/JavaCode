import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it is Armstrong or not : ");
        int n = sc.nextInt();
        sc.close();
        boolean ans = isArmstrong(n);
        System.out.println(n + " is a Armstrong number: "+ ans);

        System.out.println("All three digit Armstrong numbers are: ");
        // printing all three digit Armstrong number
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print( i + " ");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int count = 0;
        int temp2 = n;
        while (temp2 != 0) {
            temp2 /= 10;
            count++;  // number of digits present in the given number
        }
        int temp = n;
        int sum = 0;
        int digit = 0;
        while (temp != 0) {
            digit = temp % 10;
            sum = sum + (int) Math.pow(digit, count);
            temp = temp / 10;
        }
        return (sum == n);
    }
}
