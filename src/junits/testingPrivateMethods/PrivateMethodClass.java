package junits.testingPrivateMethods;

public class PrivateMethodClass {

    private static final int ASCII_ZERO = 48;
    private static final int ASCII_NINE = 57;

    private int privateMethodThatShouldReturnFive() {
        return 5;
    }

    private int privateMethodThatTakesFirstNumberOfString(String string) {
        char[] chars = string.toCharArray();
        for (char c : chars)
            if (c >= ASCII_ZERO && c <= ASCII_NINE)
                return c - ASCII_ZERO;
        return -1;
    }


    private void testItSelf() {
        PrivateMethodClassTester selfTester = new PrivateMethodClassTester();
        selfTester.testPrivateMethodThatShouldReturnFive(this::privateMethodThatShouldReturnFive);
        selfTester.testPrivateMethodThatTakesFirstNumberOfString(this::privateMethodThatTakesFirstNumberOfString);
    }
}
