package demo.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Collections API, set of classes and interfaces that allows us to manage large amount of data in the memory
 * using prebuilt data structures in a dynamic manner.
 * List, Set, Map these are the main categories of collection classes.
 */
public class CollectionsDemo {
    /**
     * Creating Set using Java collections. Represented using java.util.Set interface.
     * A Set is collection of unique values, duplicates are not allowed. Some set implementations allow the user
     * to enter one null value. HashSet, LinkedHashSet, TreeSet
     */
    static void set() {
        // HashSet allows one null value.
        Set<String> userNames = new HashSet<>();
        userNames.add("alice");
        userNames.add("john");
        userNames.add("john");
        userNames.add(null);
        System.out.println(userNames);

        // Sorted set orders the elements based on the natural ordering or custom ordering logic.
        SortedSet<Integer> userIds = new TreeSet<>();
        userIds.add(10);
        userIds.add(100);
        userIds.add(1);
        userIds.add(40);
        userIds.add(54);
        System.out.println(userIds);

        NavigableSet<Integer> costOfItems = new TreeSet<>();
        costOfItems.add(300);
        costOfItems.add(200);
        costOfItems.add(340);
        costOfItems.add(210);
        System.out.println(costOfItems);
        System.out.println(costOfItems.descendingSet());
        System.out.println(costOfItems.lower(250));

        System.out.println();
        var iterator = costOfItems.descendingIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        System.out.println();
        for (var item : userIds) {
            System.out.print(item + " ");
        }
    }

    /**
     * Creating list in Java using collections API. Implemented using the java.util.List interface.
     * LinkedList, ArrayList, these are the common classes that implements this List interface.
     * List allows duplicates, indexed access is possible in a list. Positional insertion and deletion.
     */
    static void list() {
        List<String> authors = new LinkedList<>();
        authors.add("Enid Blyton");
        authors.add("George Orwell");
        Collections.sort(authors); // sort the list
        System.out.println(authors);
        authors.add(1, "J K rowling");
        System.out.println(authors);
        authors.set(0, "Dan Brown"); // replaces the element at position 0 with this value
        System.out.println(authors);
        System.out.println(authors.subList(1,2));
    }

    /**
     * Map allows you to store values in Key=Value pair. Implemented via java.util.Map interface.
     * Each key has to be unique, certain implementations allows one nul key and multiple null values.
     * HashMap, LinkedHashMap, TreeMap these are some of the common classes that are used for implementing a Map.
     */
    static void map() {
        Map<String, Integer> prices = new HashMap<>();
        prices.put("P010", 100);
        prices.put("P001", 120);
        prices.put("P003", 300);
        prices.put("P004", 250);
        System.out.println(prices);
        System.out.println(prices.keySet());
        System.out.println(prices.values());
        Set<Map.Entry<String, Integer>> entries = prices.entrySet();
        for(var entry: entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        System.out.println();

        // SortedMap, keeps the keys in a sorted manner
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("P010", 100);
        sortedMap.put("P001", 120);
        sortedMap.put("P003", 300);
        sortedMap.put("P004", 250);
        System.out.println(sortedMap);

        // ConcurrentMap, thread safe extension of Map
        ConcurrentMap<String, String> sessionMap = new ConcurrentHashMap<>();
        sessionMap.put("user1", "token1");
        sessionMap.putIfAbsent("user1", "token2");

    }

    public static void main(String[] args) {
        map();
    }
}
