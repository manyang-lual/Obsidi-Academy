package jUnitExercise;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public final void testZero() {
		assertEquals(1, Factorial.factorial(0));
	}
	@Test
	public final void testFive() {
		assertEquals(120, Factorial.factorial(5));
	}
}
