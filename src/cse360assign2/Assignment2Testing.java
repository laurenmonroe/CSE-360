package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Assignment2Testing {

	@Test
	void testAdd() {
		AddingMachine a  = new AddingMachine();
		a.add(5);
		assertEquals(5, a.getTotal());
	}
	
	@Test
	void testSubtract() {
		AddingMachine a  = new AddingMachine();
		a.subtract(5);
		assertEquals(-5, a.getTotal());
	}

	@Test
	void testToString() {
		AddingMachine a  = new AddingMachine();
		a.add(5);
		a.add(6);
		a.add(7);
		a.subtract(1);
		a.subtract(3);
		assertEquals("0 + 5 + 6 + 7 - 1 - 3", a.toString());
	}
	
}
