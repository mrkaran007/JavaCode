public class XORInRange {
    public static void main(String[] args) {
        // range Xor for a, b = xor(b) ^ xor(a-1)
        int a = 5;
        int b = 7;
        int ans = xor(b) ^ xor(a - 1);
        System.out.println(ans);

        // It only for check, it gives TLE for large number
        int check = 0;
        for (int i = a; i <= b; i++) {
            check ^= i;
        }
        System.out.println(check);
    }

    // This will give Xor from 0 to a
    public static int xor(int a) {
        if (a % 4 == 0) {
            return a;
        }
        if (a % 4 == 1) {
            return 1;
        }
        if (a % 4 == 2) {
            return a + 1;
        }

        return 0;
    }
}
