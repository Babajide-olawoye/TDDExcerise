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
	
	@Test
	void checkIfEmpty() {
		Exc exc = new Exc();
		
		exc.saveNotes("Testing on User input");
		exc.deleteLastNote();
		
		assertEquals(exc.getNotes().isEmpty(), true);
		
	}
	
	@Test
	void checkIfNotEmpty() {
		Exc exc = new Exc();
		
		exc.saveNotes("Testing on User input");
		exc.saveNotes("Testing on Users second input");
		exc.deleteLastNote();
		
		assertNotEquals(exc.getNotes().isEmpty(), true);
	}
	
	@Test
	void checkIfClear() {
		Exc exc = new Exc();
		
		exc.saveNotes("Note 1");
		exc.saveNotes("Note 2");
		exc.saveNotes("Note 3");
		exc.deleteNotes();
		
		assertEquals(exc.getNotes().isEmpty(), true);
		
	}
	
	@Test
	void testUpdate() {
		Exc exc = new Exc();
		String updateVersin = "Updated Note 2";
		
		exc.saveNotes("Note 1");
		exc.saveNotes("Note 2");
		exc.saveNotes("Note 3");
		
		exc.updateNotes(1, "Updated Note 2");
		
		assertEquals(exc.getNotes().get(1), updateVersin);
		
	}
	
	@Test
	void testSearchNote() {
		Exc exc = new Exc();
		String note = "Note 4";
		int indexOfNote = 0;
		
		exc.saveNotes("Note 1");
		exc.saveNotes("Note 2");
		exc.saveNotes("Note 3");
		exc.saveNotes("Note 4");
		exc.saveNotes("Note 5");
		exc.saveNotes("Note 6");
		
		indexOfNote = exc.searchNote(note);
		
		assertEquals(indexOfNote, 3);
		
	}
	

}
