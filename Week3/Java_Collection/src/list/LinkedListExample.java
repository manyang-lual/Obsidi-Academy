package list;

import java.util.Arrays;
import java.util.LinkedList;
public class LinkedListExample {
	
	public static void main(String[] args) {
		
		/*LinkedList Class in java is use to implement the list interface 
		 * The type of linkedList use is the doubly linkedlist which contains the pointer to the prev and next elements 
		 * It contains the same methods as arraylist
		 * 
		 */
		 
		LinkedList<String> list = new LinkedList<>();
		list.add("Lual");
		list.add("Manyang");
		list.add("Jok");
		
		String[] arr = {"Davy", "Yoyo"};
		list.addAll(Arrays.asList(arr));
		
		/*list.add() add element to the end of the list
		 * list.add(index,element) add element to the index specified
		 * list.get(Index) get element at index
		 * list.remove(index) remove element at index
		 * list.remove == list.removeFirst()
		 * list.add == list.addLast()
		 */
		
		System.out.println(list.get(2));
	}
}
