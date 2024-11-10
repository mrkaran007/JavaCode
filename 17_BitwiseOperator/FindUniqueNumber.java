// Q.> Find unique number from an array where all numbers are present twice
 
public class FindUniqueNumber {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 2, 1, 5, 3, 4, 3 };
        System.out.println("Unique number in given array is : " + findUnique(nums));
    }

    private static int findUnique(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}
// NOTE
// XOR operation has the following properties: 
// a ^ 0 = a 
// a ^ a = 0 
// a ^ b ^ a = b 

