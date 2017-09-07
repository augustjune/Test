package algorythms.recursion.tailRec;

public class SimpleRecFibonacciExample implements FibonacciCalculator{

    @Override
    public int calculateFib(int n) {
        if (n < 4)
            return n-1;
        return n+1;
    }
}
