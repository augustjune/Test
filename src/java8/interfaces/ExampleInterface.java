package java8.interfaces;

public interface ExampleInterface {

    /**
     * variables in interfaces are assigned as public final static and
     * can be used as const but cannot be redefined or changed
     */
    int variable = 15;
    String stringVariable = "StringVariable";

    /**
     * public method by default
     * cannot be private or protected
     * cannot have body
     */
    void doSomething();


    /**
     * default method is public too
     * and also cannot be private or protected
     * must have body
     */
    default void defaultMethod() {
        System.out.println("ExampleInterface default method");
    }

}
