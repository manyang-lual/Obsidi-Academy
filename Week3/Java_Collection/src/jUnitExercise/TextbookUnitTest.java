package jUnitExercise;

import static org.junit.Assert.*;

import org.junit.Test;

public class TextbookUnitTest {
	
	//create 2 instance variable for the Textbook class
	Textbook tb = new Textbook("Computer Science", 14.99, 9);
    Textbook tb2 = new Textbook("Basketweaving", 19.99, 2);
	
	@Test
	public final void testGetTitle() {
		//make sure the title of textbook tb is equals to Computer Science
		assertTrue(tb.getTitle().equals("Computer Science"));
		
		//make sure the title of textbook tb2 is equals to Basketweaving
		assertTrue(tb2.getTitle().equals("Basketweaving"));
	}
	@Test
	public final void testGetEdition() {
		//make sure the edition of textbook tb is equals to 9
		assertEquals(9, tb.getEdition());
		//make sure the edition of textbook tb2 is equals to 2
		assertEquals(2, tb2.getEdition());
	}
	
	@Test
	public final void testgetBookInfo() {
		//make sure the the book info is equals to "Computer Science", 14.99, 9
		assertTrue(tb.getBookInfo().equals("Computer Science-14.99-9"));
		//make sure the edition of textbook tb2 is equals to 2
		assertTrue(tb2.getBookInfo().equals("Basketweaving-19.99-2"));
	}
	
	@Test
	public final void testCanSubstituteFor_canSubstitute() {
		//make sure the two textbooks can substitute for each other
		//make sure the two books have same edition and title, this should return true
		Textbook text1 = new Textbook("Computer Science", 14.99, 9);
		Textbook text2 = new Textbook("Computer Science", 14.99, 9);
		assertEquals(true, text1.canSubstituteFor(text2));
		
	}
	public final void testCanSubstituteFor_cannotSubstitute() {
		//make sure the two textbooks can substitute for each other
		//the two books have different titles and this would return false
		assertEquals(false, tb.canSubstituteFor(tb2));
		
	}

}
