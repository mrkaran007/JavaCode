// Q.7.> Find the 'n'th magic number
//     (Hint: n'th magic number is the number which has 'n' 1's)
//     Example:
//     1 = 001 => 5 (5^1)
//     2 = 010 => 25 (5^2)
//     3 = 011 => 30 (5^2 + 5^1)
//     4 = 100 => 125 (5^3)
//     5 = 101 => 130 (5^3 + 5^1)
//     6 = 110 => 150 (5^3 + 5^2)

public class MagicNumber {
    public static void main(String[] args) {
        int n = 5;
        int magicNumber = findMagicNumber(n);
        System.out.println("The " + n + "th magic number is: " + magicNumber);
    }

    public static int findMagicNumber(int n) {
        int result = 0;
        int base = 5;
        while (n > 0) {
            int lsb = n & 1;
            n = n >> 1;
            result += lsb * base;
            base *= 5;
        }
        return result;
    }
}
