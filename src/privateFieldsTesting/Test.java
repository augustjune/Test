package privateFieldsTesting;

public class Test {
    public String publicString = "public";
    private String privateString = "private";

    public String publicStringMethod() {
        return "publicStringMethod";
    }

    private String privateStringMethod() {
        return "privateStringMethod";
    }
}
