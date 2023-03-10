package friday_challenges;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "This is a test sentence with no repeating words.";

        // Split the sentence into words using split() method
        String[] words = sentence.split(" ");
        
        // Create a Map to store the frequency of each word
        Map<String, Integer>  wordFrequency = new HashMap<>();
        
        
//        for(String str : words) {
//        	wordFrequency.merge(str, 1, (a,b)->a+b);
//        }
//        
        // Iterate through each word in the sentence
        for (String str : words) {
           // If the word is already in the map, increment its frequency 
            if ( wordFrequency.containsKey(str)) {
            	wordFrequency.put(str,wordFrequency.get(str)+1);
            }
            // If the word is not in the map, add it with a frequency of 1
            else {
            	wordFrequency.put(str,1);
           }
        }

        // Print the frequency of each word
        System.out.println("Word frequency: " + wordFrequency);
        
    }
}
