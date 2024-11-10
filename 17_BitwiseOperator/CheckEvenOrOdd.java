
public class CheckEvenOrOdd {
    public static void main(String[] args) {
        int num = 11;
        EvenOrOdd(num);
    }

    private static void EvenOrOdd(int num) {
        if ((num & 1) == 1) {
            System.out.println("Odd number");
        } else {
            System.out.println("Even number");
        }
    }
}
// NOTE
/*
 * ->> The bitwise AND operator (&) is used to check if a number is even or odd.
 * ->> The expression (num & 1) will be 1 if the number is odd and
 * 0 if the number is even. This is because the binary representation of
 * odd numbers always ends with 1 and even numbers always end with 0.
 */
