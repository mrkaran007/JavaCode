// Q.> Find the i th bit of a number

public class FindiThBit {
    public static void main(String[] args) {
        int num = 4;
        int i = 3;
        System.out.println(findIthBit(num, i));
    }

    public static int findIthBit(int num, int i) {
        int bit = num & (1 << (i - 1));
        return bit == 0 ? 0 : 1;
    }
}
// NOTE:
// The above code will print 1 because the 3rd bit of the binary representation of 4 is 1.
// The binary representation of 4 is 100. The 3rd bit is the first bit from the right, so it is the least significant bit.


