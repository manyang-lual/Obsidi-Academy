package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDifferences {
		// Function show insertion order of
    	// LinkedHashSet, TreeSet and HashSet
	    public static void insertionOrder()
	    {
	    	HashSet<Integer> hashSet = new HashSet<>();
	        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
	        TreeSet<Integer> treeSet = new TreeSet<>();
	        
	        // Add five elements object in
	        // LinkedHashSet ,TreeSet and HashSet
	        int[] arr = {200,10, 300,200,1,50};
	        for (Integer i : arr) {
	            linkedSet.add(i);
	            treeSet.add(i);
	            hashSet.add(i);
	        }
	 
	        // should be sorted order HashSet
	        // stores element in sorted order
	        System.out.println("Insertion Order" + " of objects in HashSet :"+ hashSet);
	 
	        // insertion order or elements LinkedHashSet
	        // stores elements as insertion
	        System.out.println("Insertion Order" + " of objects in LinkedHashSet :"+ linkedSet);
	 
	        // should be sorted order TreeSet
	        // stores element in sorted order
	        System.out.println("Insertion Order" + " of objects in TreeSet :"+ treeSet);
	    }
	    public static void main(String[] args) {
			// TODO Auto-generated method stub
			// Function show insertion order of
		    // LinkedHashSet, TreeSet and HashSet
	    	insertionOrder();
		}

}
