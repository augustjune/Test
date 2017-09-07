package privateFieldsTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTest {

    private privateFieldsTesting.Test test = new privateFieldsTesting.Test();

    @Test
    void privateField() {
        //assertEquals("private", test.privateString);
    }

    @Test
    void publicField() {
        assertEquals("public", test.publicString);
    }

    void privateStringMethod() {
        //assertEquals("privateStringMethod", test.privateStringMethod());
    }

    @Test
    void publicStringMethod() {
        assertEquals("publicStringMethod", test.publicStringMethod());
    }
}