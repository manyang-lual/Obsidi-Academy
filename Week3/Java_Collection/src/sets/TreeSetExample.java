package sets;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Tree set allows us to store elements in a sorted order
		 * It does not allow duplicate elements just like the other sets
		 * it users the tree 
		 * it does not allow the addition of null values
		 * The remove method returns true when the element exists it is removed
		 * The headSet method returns all the elements that are strictly less than the element mentioned in the parameter.
		 * The tailSet method returns all the elements that are greater or equal to the element mentioned in the parameter.
		 */
		
		Set<Integer> treeSet = new TreeSet<>();
		
		//ADD elements to the set called treeSet
		
		/*
		 * we can use addAll method to add elements the set
		 * 
		 */
		Integer[] arr = {50,40,30,10,500};
		treeSet.addAll(Arrays.asList(arr));
		
		/*
		 * this is one way to add elements to the set
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(40);
		treeSet.add(50);
		*/
		treeSet.add(12);
		
		//print the view of the set
		System.out.println(treeSet);
		
		//headSet method
		System.out.println(((TreeSet<Integer>) treeSet).headSet(30));
		
		//tailSet method
		System.out.println(((TreeSet<Integer>) treeSet).tailSet(30));
		
		/* headSet(element) returns a set with all the elements strictly less than the element
		 * tailSet(element) returns a set with all the elements greater or equal to the element
		 * 
		 */
		
		//Using for loop to print the elements 
		System.out.println("Elements in the set (using for-each loop)");
		for(Integer i: treeSet) {
			System.out.println("Element: "+i);
		}
		
		//Using for Iterator interface to print the elements 
		System.out.println("Elements in the set (using iterator interface)");
		Iterator<Integer> it = treeSet.iterator();
		while(it.hasNext()) {
			System.out.println("Element: "+it.next());
		}
	}

}
