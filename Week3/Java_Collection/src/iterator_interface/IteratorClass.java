package iterator_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> numbers = new ArrayList<>();
	    numbers.add("One");
	    numbers.add("Two");
	    numbers.add("Three");
	    numbers.add("Four");


	    Iterator<String> it = numbers.iterator();
	    
	    while(it.hasNext()) {
	      String i = it.next();
	      if(i .equals("Three")) {
	        it.remove();
	      }
	    }
	    System.out.println(numbers);
	  }
	}