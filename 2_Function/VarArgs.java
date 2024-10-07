import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        fun();
        fun(1, 2, 3, 5, 3, 5, 6);
        fun(100,3,5);

        fun2();
        fun2("Iron", "Captian", "Loki", "Zoro");

        mixedArgs(12, 11, "Luffy", "Sanji", "Naruto");
    }

    // use variable length argument when not know the actual number of values will be passes
    public static void fun(int ...varArgs) {  // Internally taking arrays of integer. ( or string, char, byte etc. according to the data type)
        System.out.println(Arrays.toString(varArgs));
        System.out.println("Length of varArgs = "+varArgs.length);
    }

    static void fun2(String... name){
        System.out.println(Arrays.toString(name));
    }

    static void mixedArgs(int a, int b, String... name){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("name = "+Arrays.toString(name));
    }
}
