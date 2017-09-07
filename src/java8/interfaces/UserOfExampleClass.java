package java8.interfaces;

public class UserOfExampleClass {

    private ExampleInterface exampleInterface = new ExampleClass();
    private ExampleClass exampleClass = new ExampleClass();

    /**
     * we can use all the methods in ExampleInterface
     * but if we have ExampleClass reference, we can also use ExampleClass methods as it is decided in compile time
     */
    void useExamplesMethods() {
        exampleInterface.doSomething();
        exampleInterface.defaultMethod();
        //exampleInterface.ownMethod();

        exampleClass.doSomething();
        exampleClass.defaultMethod();
        exampleClass.ownMethod();
    }

    /**
     * as interface variables are static we can get them through inner objects or static references which is better
     */
    void useExamplePrimitiveVariable() {
        int newVariable;
        newVariable = exampleInterface.variable; // = newVariable = ExampleInterface.variable;
        newVariable = exampleClass.variable;    // = newVariable = ExampleInterface.variable;
    }

    void useExampleObjectVariable() {
        String newVariable1 = exampleInterface.stringVariable;
        String newVariable2 = exampleClass.stringVariable;
        System.out.println("exampleInterface.string has same reference as exampleClass.string: " + (newVariable1==newVariable2));
    }


}
