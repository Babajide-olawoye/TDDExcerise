package com.solera.training.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Exc {
	ArrayList<String> notes = new ArrayList<>();
	
	public ArrayList<String> getNotes() {
		return notes;
	}


	public void saveNotes(String note) {
			
		notes.add(note);
		
	}
	
	
	
	public void viewNotes() {
		System.out.println(notes);
	}

	public static void main(String[] args) {
		
		Exc exc = new Exc();
		Scanner myObj2 = new Scanner(System.in);
		Scanner myObj = new Scanner(System.in);
		int exit = 0;
		String note = " ";
		
			
		// 1 to store note, 2 to exit
		while (exit != 2) {
			System.out.println("1 to store note, 2 to exit, 3 to view notes");
			exit = myObj.nextInt();

			if(exit == 1) {
				System.out.println("Type the note you would like to save: ");
				note = myObj2.nextLine();
				exc.saveNotes(note);
			}
			else if(exit == 3) {
				exc.viewNotes();
			}
			
		}

	}

}
