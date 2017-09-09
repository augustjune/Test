package algorythms.recursion.tailRec;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciExampleTest {

    private FibonacciCalculator fib;

    @BeforeEach
    void setUp() {
        fib = new SimpleRecFibonacciExample();
    }

    @Test
    public void fibonacciNumbersTest() {
        assertFib(0, 0);
        assertFib(1, 1);
        assertFib(2, 1);
        assertFib(3, 2);
        assertFib(4, 3);
        assertFib(5, 5);
        assertFib(6, 8);
        assertFib(7, 13);
        assertFib(8, 21);
        assertFib(20, 6765);
    }

    @Test
    public void factorialTest() {
        assertFac(0, 0);
        assertFac(1, 1);
        assertFac(2, 2);
        assertFac(3, 6);
        assertFac(4, 24);
        assertFac(5, 120);
        assertFac(6, 720);
        assertFac(7, 5040);
    }

    private void assertFac(int n, int fac) {
        assertEquals(fac, calculateFac(n));
    }

    private void assertFib(int n, int res) {
        assertEquals(res, calculateFibTail(n));
    }

    private int calculateFac(int n) {
        if (n < 3)
            return n;
        return n * calculateFac(n - 1);
    }

    private int calculateFacTail(int n, int accum) {
        if (n < 3)
            return n * accum;
        return calculateFacTail(n - 1, accum * n);
    }

    private int calculateFib(int n) {
        if (n < 4) return (n + 1) / 2;
        return calculateFib(n - 1) + calculateFib(n - 2);
    }

    private int calculateFibTail(int n) {
        return calculateFibTailHelper(n, 2, 0, 1);
    }

    private int calculateFibTailHelper(int max, int n, int smallPrev, int bigPrev) {
        if (max == 0) return 0;
        if (n >= max ) return bigPrev + smallPrev;
        return calculateFibTailHelper(max, n + 1, bigPrev, bigPrev + smallPrev);
    }


}
