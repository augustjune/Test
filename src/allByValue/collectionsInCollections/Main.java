package allByValue.collectionsInCollections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> stringSet1 = new HashSet<>();
        Set<String> stringSet1Copy = stringSet1;


        stringSet1.add("New String");
        printCollection(stringSet1Copy);
    }

    private static void printCollection(Collection<String> collection) {
		System.out.printf("Collection contains: %d elements\n", collection.size());
		System.out.println("Element list:");
		collection.forEach(s -> System.out.printf("\t%strings\n", s));
	}
}
