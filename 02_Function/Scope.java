public class Scope {
    public static void main(String[] args) {
        System.out.println();

        int a = 10;
        int b = 20;
        System.out.println("Before entered in the block scope : a = " + a + ", b = " + b);

        String name = "Captian";
        System.out.println("Before entered in the block scope : Name = " + name);

        // block scope :-
        {
            // int a = 30; // already initialised outside of the block in the same method,
            // hence it cannot initialised again
            // int b = 40; // already initialised outside of the block in the same method,
            // hence it cannot initialised again
            int c = 50;
            System.out.println("Inside the block before reassigning: a = " + a + ", b = " + b + ", c = " + c);

            a = 101; // but can update or change the original value which reflect outside the block
            b = 102;
            System.out.println("Inside the block: a = " + a + ", b = " + b);

            name = "Iron man";
            System.out.println("Inside the block: Name = " + name);
        }
        System.out.println("Outside the block: a = " + a + ", b = " + b);
        System.out.println("Outside the block: Name = " + name);

        // System.out.println(c); // cannot use outside the block
        System.out.println();

        /**
         * NOTE: -> Anything initialized outside the block can use and reassigned inside the block, but it not be vice-versa
         */
    }
}
