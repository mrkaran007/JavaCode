public class CountSetBits {
    public static void main(String[] args) {
        int n = 1111; 
        System.out.println(n+" is written in binary : " + Integer.toBinaryString(n));
        System.out.println("Count the set bits using internal method : " + Integer.bitCount(n));
        int count = countSetBits(n);
        System.out.println("Count the set bits by own method : " +count);
    }

    private static int countSetBits(int n){
        int count = 0;

        // while(n != 0) {
        //     count += n & 1;
        //     n >>= 1;
        // }

        /*  or */

        while (n > 0) {
            count++;
            n = n & (n - 1);
        }

        /*  or */

        // while (n > 0) {
        //     count++;
        //     n -= n & (-n);
        // }
        return count;
    }
}
