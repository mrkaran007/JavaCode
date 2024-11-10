// 10.> You are given a number, find out if its power of 2 or not.
// (Hint: check if the number is power of 2 or not by using bitwise AND operator, if (n & (n-1) == 0) then n is power of 2)

public class IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8)); // true
    }
    private static boolean isPowerOfTwo(int n ){
        if (n <= 0) {
            return false;
        }
        int ans = (n & (n-1));
        return ans == 0;
    }
}
