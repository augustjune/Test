package junits.testingPrivateMethods;

import java.util.function.Function;
import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;

public class PrivateMethodClassTester {

    public void testPrivateMethodThatShouldReturnFive(Supplier<Integer> testFunction) {
        assertEquals(new Integer(5), testFunction.get());
    }


    public void testPrivateMethodThatTakesFirstNumberOfString(Function<String, Integer> testFunction) {
        ifNumberOccurs_returnFirstOne(testFunction);
        ifNoNumberInString_returnMinusOne(testFunction);
    }

    private void ifNumberOccurs_returnFirstOne(Function<String, Integer> testFunction) {
        assertEquals(Integer.valueOf(1), testFunction.apply("owqe1ow"));
        assertEquals(Integer.valueOf(0), testFunction.apply("w01ker"));
        assertEquals(Integer.valueOf(5), testFunction.apply("5aawe"));
    }

    private void ifNoNumberInString_returnMinusOne(Function<String, Integer> testFunction) {
        assertEquals(Integer.valueOf(-1), testFunction.apply("wadsd"));
    }
}
