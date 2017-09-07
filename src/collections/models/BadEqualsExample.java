package collections.models;

public class BadEqualsExample {
    private static final String DEFAULT_NAME = "Default name";
    private int number;
    private String name;

    public BadEqualsExample(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public BadEqualsExample(int number) {
        this(number, DEFAULT_NAME);
    }

    public int getNumber() {

        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BadEqualsExample that = (BadEqualsExample) o;

        return (number == that.number);
    }

    @Override
    public String toString() {
        return "BadEqualsExample{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
