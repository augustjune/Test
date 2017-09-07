package java8.interfaces;

public class Tutorial {

    /**
     * final fields must be initialized by default or must be initialized by all constructors
     * in other words, there cannot be any constructor that don't initialize final field
     */
    private final int finalField = 15;

    interface Converter<F,T> {
        T convert(F from);
    }

    /**
     * we can't use lambdas with non final references
     */
    void useLambdaWithNonFinalVariable() {
        int nonFinalVariable = 14;
        Converter<String, Integer> toIntConverter = (string) -> nonFinalVariable;
        //can't change value
        //nonFinalVariable += 14;
    }

    private int nonStaticField;
    void useLambdaWithNonFinalField() {
        System.out.println("nonStaticField = " + nonStaticField);
        Converter<Integer, Integer> addTen = (x) -> x + nonStaticField;
        System.out.println(addTen.convert(5));
        nonStaticField = 15;
        System.out.println("nonStaticField = " + nonStaticField);
        System.out.println(addTen.convert(5));
    }


    void useLambdaWithFinalField() {
        //finalField = 10;
        System.out.println("staticField = " + finalField);
        Converter<Integer, Integer> addTen = (x) -> x + finalField;
        // cannot change final field as it is FINAL
        //finalField = 15;
        System.out.println("staticField = " + finalField);
    }

    public static void main(String[] args) {
        Tutorial tutorial = new Tutorial();
        tutorial.useLambdaWithNonFinalField();
    }

}
