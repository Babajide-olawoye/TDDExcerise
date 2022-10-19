package com.solera.training.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Exc {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		Scanner myObj2 = new Scanner(System.in);
		int exit = 0;
		ArrayList<String> notes = new ArrayList<>();
		String note = " ";
		
		
		
		// 1 to store note, 2 to exit
		while (exit != 2) {
			System.out.println("1 to store note, 2 to exit, 3 to view notes");
			exit = myObj.nextInt();
			
			if(exit==1) {
				System.out.println("Type the note you would like to save: ");
				note = myObj2.nextLine();
				
				notes.add(note);
			}
			else if(exit == 3) {
				System.out.println(notes);
			}
			else;
			
		}

		System.out.println("Adios");
	}

}
