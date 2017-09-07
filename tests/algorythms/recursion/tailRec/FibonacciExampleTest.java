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
        assertFib(2,1);
        assertFib(3,2);
        assertFib(4,5);

    }

    private void assertFib(int n, int res) {
        assertEquals(res, fib.calculateFib(n));
    }

}
