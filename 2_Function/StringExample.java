import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String ans = greet();
        System.out.println(ans);

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        String personalized = myGreet(name);
        System.out.println(personalized);

    }

    // return parametrised String method
    public static String myGreet(String name){
        return "Hello, " + name + "!";
    }

    // return String method
    public static String greet() {
        String name = "Hello! John";
        return name;
    }

    
}
