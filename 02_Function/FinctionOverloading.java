import java.util.Arrays;

public class FinctionOverloading {

    static void demo(int ...varArgs){
        System.out.println(Arrays.toString(varArgs));
    }
    static void demo(String ...varArgs){
        System.out.println(Arrays.toString(varArgs));
    }

    public static void main(String[] args) {
        fun("Iron man");
        fun(12);
        fun(24, 50);

        demo("Iron man", "Zoro", "Loki", "Luffy");
        demo(12, 24, 50);

        // demo();  // it gives ambiguity(error)
    }

    /**
     * Function overloading:-
     *               Function overloading in Java, also known as method overloading, is the ability to create multiple functions with the same name but different implementations.
     * 
     */

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(int a,int b){
        System.out.println(a+" "+b);
    }
    static void fun(String name){
        System.out.println(name);
    }

    /**
     * How program determine which function is called:-
        --> When program get complied then it determine which function is called by its different parameters..
     */
}
