package maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a HashMap and populate it with initial key-value pairs
		/*
		 * If you put the key that already exists, it overrides the current value
		 * we use put instead of add
		 * Map takes both null key and values. You can have null keys
		 * You can also have null values
		 * putAll(Map mapName) Put all the key-value entries in mapName into another map with similar signature
		 * remove(Key) removes the key-value entry
		 * conatinsValue(value) returns true if the map contains value
		 * containsKey(key) return true if map has the key
		 * replaces(Key, Value) replaces the value associated with the given key
		 */
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 10);
		map.put("D", 2);
		map.put("C", 5);
		map.put("E", 7);
		map.put("A", null);
		map.put("Z", 10);
		map.put(null, 17);
	
		// Print the size of the map
		//similar to arrayList and set
		System.out.println(map.size());
		
		map.remove(null);		//removes the null key and the value associated with
		System.out.println(map.containsValue(7));  //returns true since 7 is in the map
		System.out.println(map.containsKey("A"));  //returns true since A is A key in the map
		
		map.replace("A", 100); 		//Replaces the value associated with key A from null to 100
		
		
		//The entrySet() basically returns a set view of the hash map or we can create a new set and store the map elements into them.
		//entrySet is mostly used with Map.Entry to loop over a map
		System.out.println("The set view of the map is "+ map.entrySet());
		
		
		// Use a for loop to print the key-value pairs in the map
		//first have to declare a variable of type Entry
		for (Map.Entry<String, Integer> set : map.entrySet()) {
            System.out.println("The value of Key " + set.getKey() + " is " + set.getValue());
        }
		
		// Use enhanced for loop to print the key-value pairs in the map
		System.out.println("Printing the key-value pairs using for-each loop");
		for(String str : map.keySet()) {
			 System.out.println("The value of Key " + str + " is " + map.get(str));
		}
		
		//using the for-each loop to print values in the map
		System.out.print("The values are: ");
		for(Integer i : map.values()) {
			System.out.print( i+" ");
		}
		System.out.println();
		
		//using the forEach() method and a lambda expression to iterate over the map
		System.out.println("Printing the key-value pairs using for-each method and lambda");
		map.forEach((key,value)->System.out.println("The value of key "+key+" is "+ value));
		
	}

}
