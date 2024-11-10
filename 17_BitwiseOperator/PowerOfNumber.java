// Q.> Find the power of the number

public class PowerOfNumber {
    public static void main(String[] args) {
        int base = 3;
        int power = 6;
        int result = powerOfNumber(base, power);
        System.out.println("(" + base +")" + "^" + power + " = " + result);
    }

    private static int powerOfNumber(int base, int power) {
        int ans = 1;
        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= base;
            }
            base *= base;
            power >>= 1;
        }
        return ans;
    }
}
//NOTE:
//The above code is a simple implementation of the power of a number using bitwise operations.
//The powerOfNumber function takes two parameters, base and power, and returns the result of base raised to the power of power.

