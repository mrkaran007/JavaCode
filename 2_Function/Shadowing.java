public class Shadowing {
    static int x = 10; // this will be shadowed by local variable
    static int y = 100;

    public static void main(String[] args) {
        fun();

        System.out.println("Inside main function before shadowing, x = " + x); // prints 10
        int x = 20; // higher level is shadowed by lower level
        System.out.println("Inside main function after shadowing, x = " + x); // print 20

        System.out.println("Inside main function before shadowing, y = " + y); // prints 100
        int y;
        // System.out.println(y); // scope will begin when value is initialised. If want to print it, it gives an error: variable y might not have been initialized
        y = 200;    // higher level is shadowed by lower level
        System.out.println("Inside main function after shadowing, y = " + y); // print 200
    }

    public static void fun() {
        System.out.println("Inside fun function before shadowing, x = " + x);
        int x = 900;
        System.out.println("Inside fun function after shadowing, x = " + x);
    }
}
