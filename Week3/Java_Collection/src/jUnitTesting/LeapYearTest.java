package jUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeapYearTest {
	

	@Test
	public final void testLeapYear() {
		int year =2020;
		boolean expectedResult = true;
		boolean actualResult = LeapYear.isLeapYear(year);
		assertTrue(expectedResult==actualResult);
	}
	
	@Test
	public final void testNotLeapYear() {
		int year = 1900;
		boolean expectedResult = false;
		boolean actualResult = LeapYear.isLeapYear(year);
		assertTrue(expectedResult==actualResult);
	}

}
