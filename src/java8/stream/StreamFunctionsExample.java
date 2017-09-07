package java8.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamFunctionsExample {

    /**
     * stream() function returns Stream Object and can be invoked by any class that implements java.util.Collection
     * is not supported by Map
     * all functions below work on Stream, taken from exemplary stringList
     */
    private List<String> stringList;

    public StreamFunctionsExample() {
        stringList = new ArrayList<>();
        stringList.add("aa1");
        stringList.add("aA2");
        stringList.add("bb1");
        stringList.add("aa3");
        stringList.add("bB1");
        stringList.add("cc1");
        stringList.add("bC1");
    }

    public StreamFunctionsExample(List<String> stringList) {
        this.stringList = stringList;
    }

    /**
     * filter() method takes Predicate as argument and returns same Stream class
     */
    void filterExample() {
        printLine();
        printList();
        System.out.println("filterExample");
        stringList.stream().filter((s) -> s.startsWith("a")).forEach(System.out::println);
    }

    /**
     * default non-parameters sort() function returns sorted Stream
     * to use default sort() Object held in Stream has to be Comparable
     */
    void defaultSortedExample() {
        printList();
        System.out.println("default sortedExample");
        stringList.stream().sorted().forEach(System.out::println);
    }

    /**
     * sort() function with parameter takes Comparator
     * returns sorted Stream
     */
    void customSortedExample() {
        printList();
        System.out.println("custom(with ignoring cases) sortedExample");
        stringList.stream().sorted(String::compareToIgnoreCase).forEach(System.out::println);
    }

    /**
     * map() function takes Function<H,T> where H is held class (or it's child) and T is any class
     * returns mapped Stream<T>
     */
    void mapExample() {
        printList();
        System.out.println("mapExample");
        stringList.stream().map(String::length).forEach(System.out::println);
    }

    /**
     * anyMatch() function takes Predicate<H> and
     * returns boolean value whether Stream contains at least 1 value that fulfills requirement
     */
    void anyMatchExample() {
        printList();
        System.out.println("anyMatchExample");
        System.out.println(stringList.stream().anyMatch((s) -> s.equals("aa1")));
    }

    /**
     * allMatch() function takes Predicate<H> and
     * returns boolean value whether all Stream values fulfill requirement
     */
    void allMatchExample() {
        printList();
        System.out.println("allNatchExample");
        System.out.println(stringList.stream().allMatch((s) -> s.equals("aa1")));
    }

    /**
     * noneMatch() function takes Predicate<H> and
     * returns boolean value whether Stream contains no value that fulfills requirement
     */
    void noneMatchExample() {
        printList();
        System.out.println("noneMatchExample");
        System.out.println(stringList.stream().noneMatch((s) -> s.equals("aa1")));
    }

    /**
     * count() function is non-parameter and returns int value which represents size of Stream
     */
    void countExample() {
        printList();
        System.out.println("countExample");
        System.out.println(stringList.stream().count());
    }

    /**
     * reduce() function takes BinaryOperator<H>(Function<H, H> which takes two parameters: accum and value from Stream and returns accumulated value)
     * returns Optional<H> that is result of accumulating and can be null
     */
    void reduceExample() {
        printList();
        System.out.println("reduceExample");
        System.out.println(stringList.stream().reduce(String::concat));
    }

    private void printLine() {
        System.out.println("=============================================================");
    }

    private void printList() {
        printLine();
        System.out.println("Actual list:");
        printList(stringList);
        System.out.println("-----------:");
    }

    private void printList(List<String> list) {
        list.forEach(System.out::println);
    }
}
