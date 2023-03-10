package maps;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * LinkedHashMap is a java class use to implement the set interface
		 * Unlike the HashSet that doesn't preserve any kind of order for the elements it contains, the LinkedHashSet does
		 * The methods available to the HashSet are all available to the LinkedHashSet.
		 * Indeed, the only real difference is that the LinkedHashSet retains the order in which the elements were added to the set
		*/
		
		Map <String, Integer> linkedMap = new LinkedHashMap<>();
		//LinkedMap maintains order in which elements were added to the list
		linkedMap.put("John",25);
		linkedMap.put("Jane",30);
		linkedMap.put("Jack",30);
		linkedMap.put("James",55);
		
		//USING FOR EACH METHOD WITH LAMBDA EXPRESSION TO LOOP OVER MAP
		linkedMap.forEach((k,v)->System.out.println("The value of key "+k+" is "+v));
		
		//UISNG keyset method to get key
		System.out.println(linkedMap.keySet());
		
		//UISNG values method to get key
		System.out.println(linkedMap.values());
		
		//UISNG entrySet method to get key-value pairs
		System.out.println(linkedMap.entrySet());
	}

}
