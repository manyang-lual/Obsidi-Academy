package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		//Set interface can be implementd using the hashSet class
		Set<String> set = new HashSet<>();
		
		//ADD ELEMENTS TO THE SET
		set.add("dog");
		set.add("cat");
		set.add("mouse");
		set.add("tiger");
		set.add("lion");
		set.add(null);
		//You can add more elements to the set using addAll method
		String[] arr = {"elephant","donkey","chicken"};
		set.addAll(Arrays.asList(arr));
		
		//print the view of the set. The elements are not ordered in any sequence
		System.out.println(set);
		
		//print the size of the set
		System.out.println(set.size());
		
		//Using for loop to print the elements 
		System.out.println("Elements in the set (using for-each loop)");
		for(String str: set) {
			System.out.println("Element: "+str);
		}
		
		//Using for Iterator interface to print the elements 
		System.out.println("Elements in the set (using iterator interface)");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println("Element: "+it.next());
		}
		
		/*set.remove("element") removes the element from the set. Returns false when element is not in set and true otherwise
		 *set.contains("element") returns true if element exists in the set
		 *set.clear() removes all elements in the set
		 * 
		 */
	}
}
