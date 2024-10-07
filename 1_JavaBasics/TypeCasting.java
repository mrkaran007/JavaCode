public class TypeCasting {
    public static void main(String[] args) {
        // Explicit Casting
        float i = 10.33f;
        int b = (int) i;
        System.out.println(b);
        int a = (int) (2345.344);
        System.out.println(a);

        // automatic type promotion in expressions
        int c = 257;
        // max value of byte is 256.
        byte d = (byte) (c); // 257 % 256 = 1. it gives remainder of the value by maximum value
        System.out.println("Int to byte while the value is out of range of byte is : " + d);

        byte e = 20;
        byte f = 40;
        byte g = 10;
        int h = (e * f) / g; // e*f = 800 that is exceed the range of byte (i.e. 256), so how it store the
                             // value? --> Java automatically promote its type, it convert into integer
        System.out.println(h);

        int num = 'A';
        System.out.println("Automatic type conversion, Giving the ASCII value of A : " + num);

        byte by = 42;
        char ch = 'a';
        short sh = 1024;
        int in = 123532;
        float fl = 258.78f;
        double du = 234563.4544;

        double result = (fl * by) + (in / ch) - (du * sh);
        // float + int - double = double
        System.out.println((fl * by) + " " + (in / ch) + " " + (du * sh));
        System.out.println(result);
    }
}