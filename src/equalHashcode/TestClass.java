package equalHashcode;

public class TestClass {
    private String testStringValue;
    private int testIntValue;
    private TestEnum testEnum;

    void enumTestMethod(TestEnum testEnum) {
        switch (testEnum) {
            case Enum1:
                System.out.println();
                break;
            case ENUMB:
                System.out.println();
                break;
        }
    }

    /*
                if testStringValue is not @Nullable
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestClass testClass = (TestClass) o;

        return testIntValue == testClass.testIntValue && testStringValue.equals(testClass.testStringValue);
    }

    @Override
    public int hashCode() {
        int result = testStringValue.hashCode();
        result = 31 * result + testIntValue;
        return result;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestClass testClass = (TestClass) o;

        if (testIntValue != testClass.testIntValue) return false;
        if (testStringValue != null ? !testStringValue.equals(testClass.testStringValue) : testClass.testStringValue != null)
            return false;
        return testEnum == testClass.testEnum;
    }

    @Override
    public int hashCode() {
        int result = testStringValue != null ? testStringValue.hashCode() : 0;
        result = 31 * result + testIntValue;
        result = 31 * result + (testEnum != null ? testEnum.hashCode() : 0);
        return result;
    }
}
