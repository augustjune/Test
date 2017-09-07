package java8.interfaces;

public class NothingDoer {

    interface PersonFactory<P extends Person> {
        P create(String name, String surname);
    }

    public static void main(String[] args) {
        NothingDoer doer = new NothingDoer();
        PersonFactory creater = Person::new;
    }
}