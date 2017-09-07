package finalFields;

public class Example {

    /**
     * final fields must be initialized by default or must be initialized by all constructors.
     * In other words, there cannot be any constructor that doesn't initialize final field.
     * Works for primitive types as well as for Objects.
     * Official answer: A blank final instance variable must be definitely assigned at the end of every constructor
     *                  of the class in which it is declared; otherwise a compile-time error occurs.
     */
    private final int finalField;

    Example() {
        finalField = 14;
    }
    Example(int k) {
        finalField = k;
    }

    /*Example(String k) {           // Compile-time error

    }*/

}
