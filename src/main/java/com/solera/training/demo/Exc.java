package com.solera.training.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Exc {
	
	ArrayList<String> notes = new ArrayList<>();
	
	
	public ArrayList<String> getNotes() {
		return notes;
	}
	
	//Update notes
	public void updateNotes(int index, String newNote) {
		notes.set(index, newNote);
	}
	
	//Add notes
	public void saveNotes(String note) {
		notes.add(note);
	}
	
	//View notes
	public void viewNotes() {
		System.out.println(notes);
	}
	
	//Delete notes
	public void deleteNotes() {
		notes.clear();
	}
	
	//Delete last note
	public void deleteLastNote() {
		int index = notes.size() - 1;   
		notes.remove(index);
	}
	
	public int searchNote(String note) {
		
		return notes.indexOf(note);
	}

	public static void main(String[] args) {
		
		Exc exc = new Exc();
		Scanner myObj = new Scanner(System.in);
		Scanner myObj2 = new Scanner(System.in);
		Scanner myObj3 = new Scanner(System.in);
		Scanner myObj4 = new Scanner(System.in);
		Scanner myObj5 = new Scanner(System.in);
		int exit = 0;
		int index = 0;
		int indexOfNote = 0;
		String note = " ";
		String newNote;
		
			
		// 1 to store note, 2 to exit
		while (exit != 2) {
			System.out.println("1 to store note, 2 to exit, 3 to view notes, 4 to clear the list, 5 to clear the last note or 6 to update an entry");
			exit = myObj.nextInt();
			
			if(exit == 1) {
				System.out.println("Type the note you would like to save: ");
				note = myObj2.nextLine();
				exc.saveNotes(note);
			}
			else if(exit == 3) {
				exc.viewNotes();
			}
			else if(exit == 4) {
				exc.deleteNotes();
			}
			else if(exit == 5) {
				exc.deleteLastNote();
			}
			else if(exit == 6){
				System.out.println("Please enter the index you would like to edit");
				index = myObj3.nextInt();
				
				System.out.println("Please enter the updated note");
				newNote = myObj4.nextLine();
				exc.updateNotes(index, newNote);
				
			}
			else if(exit==7) {
				System.out.println("Please enter the title of the note you are looking for");
				note = myObj5.nextLine();
				
				indexOfNote = exc.searchNote(note);
				
				System.out.println("The note you are looking for is located at index: " +indexOfNote);
			}
			
			
		}

	}

}
