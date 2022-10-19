package com.solera.training.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.solera.training.demo.Exc;

class ExcTest {
	
	
	@Test
	void testInput() {
		Exc exc = new Exc();
		String testVal = "Testing on User input";
		
		exc.saveNotes("Testing on User input");
		exc.saveNotes("This should be equal");
		
		assertEquals(testVal, exc.getNotes().get(0));
		
	}
	
	@Test
	void testInput2() {
		Exc exc = new Exc();
		String testVal = "Testing on User input";
		
		exc.saveNotes("Testing on User input");
		exc.saveNotes("This should be equal");
		
		assertNotEquals(testVal, exc.getNotes().get(1));
		
	}

}
