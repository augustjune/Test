package allByValue.collectionsInCollections;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> stringSet1 = new HashSet<>();
        Set<String> stringSet2 = new HashSet<>();
        Set<String> stringSet1Copy = stringSet1;


        stringSet1.add("New String");
        System.out.println(stringSet1Copy.size());

    }
}
