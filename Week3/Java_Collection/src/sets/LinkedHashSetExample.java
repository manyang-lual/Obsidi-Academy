package sets;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"dog","cat","mouse","tiger","lion"};
		Set<String> set = new LinkedHashSet<>(Arrays.asList(arr));
		
		
		/* 		You can use the following method to also add values to the set 
		 * 		declare a string and initialize it with variables 
		 * 		String[] arr = {"dog","cat","mouse","tiger","lion"};
		 *
		*/		set.addAll(Arrays.asList(arr));
		
		//ADD elements to the set
		/*
		set.add("dog");
		set.add("cat");
		set.add("mouse");
		set.add("tiger");
		set.add("lion");
		*/
		
		//print the size of the set
		System.out.println("The size of the set is: "+ set.size());
		
		//using for loop to print the elements in the set
		System.out.println("The elements in the set are(Using for loop): ");
		for(String s : set) {
			System.out.println(s);
		}
		
		//using iterator to print the elements in the set 
		System.out.println("The elements in the set are(Using for Iterator interface): ");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//remove an element from the set using remove method
		set.remove("dog");
		System.out.println("Set after use remove()"+set);
		
		//use set.contains() to check if the set contains the object
		System.out.println("Does the set contains 'dog "+ set.contains("dog"));
		
		//Use clear() method t0 remove all elements from the set 
		set.clear();
		System.out.println("Set after use clear() "+set);
	}

}