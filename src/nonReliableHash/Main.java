package nonReliableHash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		MutableObject mutableObject = new MutableObject("String", 5);
		HashSet<MutableObject> hashSet = new HashSet<>();
		hashSet.add(mutableObject);     // hash 15  [][][][][]][]][][][mutableObject][]
		hashSet.add(mutableObject);     // hash 15  [][][][][]][]][][][mutableObject][]
		System.out.println("HashSet size: " + hashSet.size());
		mutableObject.changeState();
		hashSet.add(mutableObject); // hash 3    [][][mutableObject][][]][]][][][mutableObject][]
		System.out.println("HashSet size: " + hashSet.size());
		mutableObject.changeState();
		hashSet.remove(mutableObject);      //  [][][mutableObject][][]][]][][][mutableObject][]
		System.out.println("HashSet size: " + hashSet.size());
		hashSet.remove(mutableObject);      // [][][mutableObject][][]][]][][][mutableObject][]
		System.out.println("HashSet size: " + hashSet.size());
		hashSet.forEach(System.out::println);

		List<MutableObject> list = new ArrayList<>(hashSet);
		System.out.println("List size: " + list.size());
		System.out.println("First element equals to second ? " + list.get(0).equals(list.get(1)));
		System.out.println("First element == second ? " + (list.get(0) == list.get(1)));
	}
}
