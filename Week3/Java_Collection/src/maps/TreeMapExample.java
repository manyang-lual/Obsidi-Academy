package maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
    	
    	/* TreeMap is a collection class in Java that is used to store key-value pairs in a sorted order
    	 * TreeMap is a class that is used to implement the Map interface
    	 * It has similar methods as HashMap and LinkedHashMap
    	 **/
        // Creating a TreeMap with initial key-value pairs
        Map<String, Integer> map = new TreeMap<>();
        map.put("John", 25);
        map.put("Jane", 30);
        map.put("Jack", 35);

        // Using the forEach() method and a lambda expression to iterate over the map
        map.forEach((key, value) -> System.out.println(key + ": " + value));

        // Using the get() method to access a value
        System.out.println("John's age: " + map.get("John"));

        // Using the put() method to update the value for a given key
        map.put("John", 30);
        System.out.println("John's new age: " + map.get("John"));

        // Using the remove() method to remove a key-value pair
        map.remove("Jane");
        System.out.println("Jane's age: " + map.get("Jane"));

        // Using the headMap() method to get a submap of the TreeMap
        System.out.println("HeadMap of the TreeMap: " + ((TreeMap<String, Integer>) map).headMap("John"));

        // Using the tailMap() method to get a submap of the TreeMap
        System.out.println("TailMap of the TreeMap: " + ((TreeMap<String, Integer>) map).tailMap("John"));

        // Using the subMap() method to get a submap of the TreeMap
        System.out.println("Submap of the TreeMap: " + ((TreeMap<String, Integer>) map).subMap("Jack", "John"));

        // Using the firstKey() method to get the first key in the TreeMap
        System.out.println("First key in the TreeMap: " + ((TreeMap<String, Integer>) map).firstKey());

        // Using the lastKey() method to get the last key in the TreeMap
        System.out.println("Last key in the TreeMap: " + ((TreeMap<String, Integer>) map).lastKey());
    }
}