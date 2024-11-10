// Q.> Find the number of digits in base 'b' of number 'n'.
//     Formula: [ int (log base'b' number'n') + 1 ]
//     Example: n = 10, b = 2, output = 4


public class NumberOfDigits {
    public static void main(String[] args) {
        int n = 10;
        // int b = 10; // (decimal)
        int b = 2; // (binary)
        
        int ans = (int)(Math.log(n) / Math.log(b)) + 1; // for base have to divide with log base
        System.out.println(ans);
    }
}
// NOTE: 
// 1. We use Math.log() function to find the logarithm of 'n' with base 'b'. 
//    This will give us the power to which 'b' must be raised to get 'n'.
//    We use Math.log() function because it can handle any base.
// 2. Time comlexity : O(log n)
