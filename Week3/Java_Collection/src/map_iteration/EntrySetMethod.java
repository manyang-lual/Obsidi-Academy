package map_iteration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class EntrySetMethod {

	public static void main(String[] args) {
		Map<Integer, String> students = new HashMap<>();
		students.put(100, "James Warton");
		students.put(101, "Alex Truman");
		students.put(102, "Alice Killet");
		students.put(103, "Lual Manyang");
		students.put(104, "Aston Villa");
		students.put(105, "Black Freeman");
		students.put(106, "Chris Dallas");
		
		//METHOD 1
		/* Using enhanced for loop to iterate over entry set of the map
		 * The entrySet method returns the set view of the map i.e view of all the key value pairs in the map
		 * The Map.Entry method has methods such getKey and getValue
		 * */
		System.out.println("Printing the keys and values using METHOD 1");
		//System.out.println(students.entrySet());
		for(Map.Entry<Integer, String> entry: students.entrySet()) {
			System.out.println("The Key is: "+entry.getKey()+" and the Value is "+entry.getValue());
		}
		
		//METHOD 2
		/* Using iterator to loop through the entrySet
		 * We wrap the entry set into an iterator object and use the getKey and getValue method
		 * We cannot directly use iterator on Map because Map is not a collection
		 * This method is somehow similar to the one above
		 */
		System.out.println("\nPrinting the keys and values using METHOD 2");
		Iterator<Map.Entry<Integer, String>> it = students.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			System.out.println("The Key is: "+entry.getKey()+" and the Value is "+entry.getValue());
		}
		
		
		//METHOD 3
		/* Using keySet method
		 * Using enhanced for loop to iterate over the Keys
		 * The keySet method returns the keys present in the map
		 *  The values method returns all the values in the map
		 */
		System.out.println("\nPrinting the keys and values using METHOD 3");
		for(Integer key : students.keySet()) {
			System.out.println("The Key is: "+key + " and the Value is: "+students.get(key));
		}
		
		
		//METHOD 4
		/* Using the forEach method that takes a lambda expression 
		 * This is by far the cleanest way to iterate the map
		 */
		System.out.println("\nPrinting the keys and values using METHOD 4");
		students.forEach((key,value)->System.out.println("The Key is : "+key + " and the Value: "+value));
	}

}
