package abstractClassesAndInterfaces;

public abstract class SimpleClass extends AbstractExampleClass{

    SimpleClass(int value) {
        super(value);
    }

    @Override
    abstract void abstractClassBodilessFunction();
}
