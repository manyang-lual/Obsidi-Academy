package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		//ADD ELEMENTS TO THE LIST
		//YOU CAN USE ADD OR addAll method
		
		list.add("Lual");
		list.add("Manyang");
		list.add("Jok");
		list.add("Riak");
		list.add("Davy");
		
		/*
		 * YOU CAN ALSO USE addAll method to add to the list
		 * tIS COMMAND WILL ADD THE ARRAY TO THE LIST AT INDEX 1
		 */
		
		String[] arr = {"Lulu","Manny","Joky"};
		list.addAll(1, Arrays.asList(arr));
		
		
		//size() returns the size of the list
		/*
		 * The set method replaces the element in the list with the value specified. Gives you indeXOutOfBound when the index is not there
		 * You can add null values to the list
		 * list.get(index) get element at index, error if index is out of bound
		 * list.remove(index) remove element at index, error if index is out of bound
		 * indexOf() returns the index at which the element occurs in the list
		 * lastIndexOf(Object o): In lists where objects are repeated, this returns the index of the last appearance of the given object.
		 **/
		
		System.out.println(list);
		System.out.println("The size of the list is: "+list.size());
		System.out.println("The first element is "+list.get(0));
		
		//indexOf() returns the index at which the element occurs in the list
		if(list.contains("Joky")) {
			System.out.println("The list contains 'Joky'");
			System.out.println("The index of 'Joky' is "+list.indexOf("Joky"));
		}
		
		//USING ITERATOR INTERFACE TO LOOP THROUGH THE LIST
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println("Element: "+it.next());
		}
		
		//USING FOR-EACH LOOP TO GET ELEMENTS OF THE LIST
		System.out.println("Elements using for-loop");
		for(String str : list) {
			System.out.println("Element: "+str);
		}
	}

}
