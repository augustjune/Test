import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        List<Integer> list = Arrays.asList(5,8,12,4,56,2,23,4,6);
        System.out.println(list.stream().reduce((x,y) -> x+y).get() / list.size());


    }

}

