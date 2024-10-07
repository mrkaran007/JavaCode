public class Arrays {
    public static void main(String[] args) {
        // directly create array
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println("Element at the index 1: " + array[1]);

        // syntax:
        // datatype [] array_name = new datatype[size]
        // "new" keyword is used to create an object
        int[] array2 = new int[5];
        array2[0] = 5;
        array2[1] = 10;
        array2[2] = 15;
        array2[3] = 20;
        array2[4] = 255;
        // array2[5] = 30; // it gives compile time error :->
        // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        System.out.println("Element at the index 0: " + array2[0]);

        int[] ros; // declaration of an array. ros is getting defined in stack [At compiletime]
        ros = new int[5]; // initialisation: ros is getting allocated in heap (actual memory is created
                          // here or can we say, actually here object is being created in the memory i.e.
                          // heap memory) [At runtime]

        /**
         * NOTE:-
         * 1. Array objects are in heap
         * 2. Heap objects are not continous
         * 3. DMA(Dynamic Memory Allocation) [Assigning memory at runtime]
         * 4. In java array objects may not be continous b/c it totaly depends on
         * JVM(Java Virtual Machine)
         * 
         * SPECIAL NOTE:--> Array actually containing object or can be say reference variable. like: {arr[0],arr[1],arr[2],arr[3]}
         * 
         * 5. Array objects are not garbage collected
         * 6. Array objects are not thread safe
         * 7. Array objects are not cloneable
         * 8. Array objects are not serializable
         * 9. Array objects are not final
         * 
         * 
         * 10. By default value at each index of an int array is 0
         * 11. By default value at each index of a boolean array is false
         * 12. By default value at each index of a char array is '\u0000'
         * 13. By default value at each index of a byte array is 0
         * 14. By default value at each index of a short array is 0
         * 15. By default value at each index of a long array is 0L
         * 16. By default value at each index of a String array is null
         * 
         */

        for (int i : ros) {
            System.out.print(i + " ");
        }

    }
}
