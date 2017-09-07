package collections.models;

import java.util.*;

public class CollectionSet<T> {
    private List<T> arrayList;
    private List<T> linkedList;

    private Set<T> hashSet;
    private Set<T> treeSet;

    private Map<String,T> hashMap;
    private Map<String,T> treeMap;

    public CollectionSet() {
        arrayList = new ArrayList<T>();
        linkedList = new LinkedList<T>();
        hashSet = new HashSet<T>();
        treeSet = new TreeSet<T>();
        hashMap = new HashMap<String, T>();
        treeMap = new TreeMap<String, T>();
    }

    public CollectionSet(Comparator<T> comparator) {
        arrayList = new ArrayList<T>();
        linkedList = new LinkedList<T>();
        hashSet = new HashSet<T>();
        treeSet = new TreeSet<T>(comparator);
        hashMap = new HashMap<String, T>();
        treeMap = new TreeMap<String, T>();
    }

    public List<T> arrayList() {
        return arrayList;
    }

    public void setArrayList(List<T> arrayList) {
        this.arrayList = arrayList;
    }

    public List<T> linkedList() {
        return linkedList;
    }

    public void setLinkedList(List<T> linkedList) {
        this.linkedList = linkedList;
    }

    public Set<T> hashSet() {
        return hashSet;
    }

    public void setHashSet(Set<T> hashSet) {
        this.hashSet = hashSet;
    }

    public Set<T> treeSet() {
        return treeSet;
    }

    public void setTreeSet(Set<T> treeSet) {
        this.treeSet = treeSet;
    }

    public Map<String, T> hashMap() {
        return hashMap;
    }

    public void setHashMap(Map<String, T> hashMap) {
        this.hashMap = hashMap;
    }

    public Map<String, T> treeMap() {
        return treeMap;
    }

    public void setTreeMap(Map<String, T> treeMap) {
        this.treeMap = treeMap;
    }
}