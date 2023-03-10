package jUnitExercise;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeCheck {
	
	public static boolean isPalindrome(int number) {
		int reverse=0;
		int remainder=0;
		int inputNumber=number;
		while(number != 0) {
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		
		return inputNumber==reverse;
	}
	@Test
	public void testIsPalindrome() {
		assertTrue(isPalindrome(111));
	}
	
	@Test
	public void testIsNotPalindrome() {
		assertFalse(isPalindrome(112));
	}
	
}
