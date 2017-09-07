package collections;

import collections.models.BadEqualsExample;
import collections.models.CollectionSet;
import collections.models.CollectionType;
import collections.models.MapType;
import javafx.util.Pair;

import java.util.Collection;
import java.util.Map;

/**
 * Class that shows how iterable and maps behave when we try to put null values in collection
 */
public class NullableTest {

    private CollectionSet<BadEqualsExample> collections = new CollectionSet<>();

    /**
     * We can store null Objects in ArrayList as much as we want
     * All added null objects are stored
     */
    void arrayListAddingTest(int nullObjectCount) {
        testCollectionNullAdding(CollectionType.ArrayList, nullObjectCount);    }

    /**
     * We can store null Objects in LinkedList as much as we want
     * All added null objects are stored
     */
    void linkedListAddingTest(int nullObjectCount) {
        testCollectionNullAdding(CollectionType.LinkedList, nullObjectCount);    }

    /**
     * We can add null to HashSet as well as we can do it with HashMap
     * After try of adding second null to HashSet, there will be only one inside as Set is unique structure
     */
    void hashSetNullAddingTest(int nullObjectCount) {
        testCollectionNullAdding(CollectionType.HashSet, nullObjectCount);    }

    /**
     * After trying to add null Object to TreeSet NullPointerException is thrown
     * as we try to call compareTo() function from added Object
     * @throws NullPointerException
     */
    void treeSetNullAddingTest(int nullObjectCount) {
        testCollectionNullAdding(CollectionType.TreeSet, nullObjectCount);    }

    /**
     * We can try to add as many elements with null key to HashMap,
     * but there will remain only the last one we added, as keys must be unique
     */
    void hashMapNullKeyAddingTest(int nullObjectCount) {
        testMapNullKeyAdding(MapType.HashMap, nullObjectCount);
    }

    /**
     * A try to add element with null key to TreeMap will cause NullPointerException
     * @throws NullPointerException
     */
    void treeMapNullKeyAddingTest(int nullObjectCount) {
        testMapNullKeyAdding(MapType.TreeMap, nullObjectCount);
    }

    /**
     * HashMap allows us to add any value elements
     * as map doesn't even look what stays as value for added element
     * The elements won't be sorted or ordered
     * @question elements may be ordered by hashCode of keys
     */
    void hashMapNullValueAddingTest(int nullObjectCount) {
        testMapNullValueAdding(MapType.HashMap, nullObjectCount);    }

    /**
     * As well as HashMap, TreeMap allows us to add null value elements
     * The elements will be sorted by key
     */
    void treeMapNullValueAddingTest(int nullObjectCount) {
        testMapNullValueAdding(MapType.TreeMap, nullObjectCount);    }



    private void testCollectionNullAdding(CollectionType type, int nullObjectCount) {
        Pair<String, Collection> collectionInfo = getCollectionInfo(type);
        String collectionName = collectionInfo.getKey();
        Collection collection = collectionInfo.getValue();
        tryCollectionNullAdding(collection, collectionName, nullObjectCount);
    }

    private Pair<String, Collection> getCollectionInfo(CollectionType type) {
        Pair<String, Collection> result = new Pair<>(null, null);
        switch (type) {
            case ArrayList:
                result = new Pair<>("ArrayList", collections.arrayList());
                break;
            case LinkedList:
                result = new Pair<>("LinkedList", collections.linkedList());
                break;
            case HashSet:
                result = new Pair<>("HashSet", collections.hashSet());
                break;
            case TreeSet:
                result = new Pair<>("TreeSet", collections.treeSet());
                break;
        }
        return result;
    }

    private void tryCollectionNullAdding(Collection collection, String collectionName, int nullObjectCount) {
        addNull(nullObjectCount, collection);
        printCollection("Null was added to " + collectionName + " " + nullObjectCount + " times",collection);

    }

    private void addNull(int times, Collection collection) {
         for (int i = 0; i < times; i++)
             collection.add(null);
     }

    private void testMapNullKeyAdding(MapType type, int nullObjectCount) {
        Pair<String, Map<String, BadEqualsExample>> mapInfo = getMapnInfo(type);
        String mapName = mapInfo.getKey();
        Map<String, BadEqualsExample> map = mapInfo.getValue();
        tryMapNullKeyAdding(map, mapName, nullObjectCount);
    }

    private void testMapNullValueAdding(MapType type, int nullObjectCount) {
        Pair<String, Map<String, BadEqualsExample>> mapInfo = getMapnInfo(type);
        String mapName = mapInfo.getKey();
        Map<String, BadEqualsExample> map = mapInfo.getValue();
        tryMapNullValueAdding(map, mapName, nullObjectCount);
    }

    private Pair<String, Map<String, BadEqualsExample>> getMapnInfo(MapType type) {
        Pair<String, Map<String, BadEqualsExample>> result = new Pair<>(null, null);
        switch (type) {
            case HashMap:
                result = new Pair<>("HashMap", collections.hashMap());
                break;
            case TreeMap:
                result = new Pair<>("TreeMap", collections.treeMap());
                break;
        }
        return result;
    }

    private void tryMapNullKeyAdding(Map<String, BadEqualsExample> map, String mapName, int nullObjectCount) {
        addNullKeyToMap(map, nullObjectCount);
        printMap("Null was added as key to " + mapName + " " + nullObjectCount + " times", map);
    }

    private void addNullKeyToMap(Map<String, BadEqualsExample> map, int times) {
        for (int i=0; i<times; i++) {
            map.put(null, new BadEqualsExample(i+1));
        }
    }

    private void tryMapNullValueAdding(Map<String, BadEqualsExample> map, String mapName, int nullObjectCount) {
        addNullValuesToMap(map, nullObjectCount);
        printMap("Null was added as value to " + mapName + " " + nullObjectCount + " times", map);
    }

    private void addNullValuesToMap(Map<String, BadEqualsExample> map, int times) {
        for (int i=0; i<times; i++) {
            map.put("Element #" + (i+1), null);
        }
    }

     private void printCollection(String message, Collection collection) {
         System.out.println(message);
         System.out.println("Collection size: " + collection.size());
         collection.forEach(System.out::println);
         System.out.println("==========================================");
     }

     private void printMap(String message, Map map) {
         System.out.println(message);
         System.out.println("Map size: " + map.size());
         map.forEach((k,v) -> System.out.println("Element Key: " + k + " Value: " + v));
         System.out.println("==========================================");
     }
}
