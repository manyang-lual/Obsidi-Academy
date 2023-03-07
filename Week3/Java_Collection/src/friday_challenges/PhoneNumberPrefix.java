package friday_challenges;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PhoneNumberPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a list of phone numbers
		List<String> phoneNumbers = new ArrayList<>();
		phoneNumbers.add("555-555-1234");
		phoneNumbers.add("555-555-2345");
		phoneNumbers.add("555-555-3456");
		phoneNumbers.add("444-444-1234");
		phoneNumbers.add("333-333-1234");

        // Create a set of unique prefixes
        Set<String> prefixes = new HashSet<>();
       // Add the prefix of each phone number to the set
        for(String str : phoneNumbers) {
        	prefixes.add(str.substring(0,7));
        }
     

        // Print the unique prefixes
        System.out.println("Unique prefixes: " + prefixes);
    }
}

