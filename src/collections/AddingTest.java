package collections;

import collections.models.BadEqualsExample;
import collections.models.CollectionSet;

import java.util.*;

public class AddingTest {

    private CollectionSet<BadEqualsExample> collections = new CollectionSet<>(Comparator.comparingInt(BadEqualsExample::getNumber));

    void testHashMapAdding() {
        System.out.println("HashMap Adding Test");
        testMapAdding(collections.hashMap());    }

    void testTreeMapAdding() {
        System.out.println("TreeMap Adding Test");
        testMapAdding(collections.treeMap());
    }

    private void testMapAdding(Map<String, BadEqualsExample> map) {
        BadEqualsExample addable1 = new BadEqualsExample(5, "Name1");
        BadEqualsExample addable2 = new BadEqualsExample(5, "Name2");
        map.put("Element #1", addable1);
        map.put("Element #2", addable1);
        map.put("Element #1", addable2);
        map.forEach((k,v) -> System.out.println("Key: " + k + " Value: " + v));
    }

    void testHashSetAdding() {
        System.out.println("HashSet Adding Test:");
        testSetAdding(collections.hashSet());
    }

    void testTreeSetAdding() {
        System.out.println("TreeSet Adding Test:");
        testSetAdding(collections.treeSet());
    }

    private void testSetAdding(Set<BadEqualsExample> set){
        BadEqualsExample addable1 = new BadEqualsExample(5, "Name1");
        BadEqualsExample addable2 = new BadEqualsExample(5, "Name2");
        set.add(addable1);
        set.add(addable2);
        set.forEach(System.out::println);

    }
}
