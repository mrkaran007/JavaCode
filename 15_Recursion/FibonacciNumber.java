
public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 100;
        int fib = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is " + fib);
    }

    private static int fibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
