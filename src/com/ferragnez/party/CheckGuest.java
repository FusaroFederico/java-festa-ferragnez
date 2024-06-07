package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		// guests array
		String[] guestsList = { "Dua Lipa", "Paris Hilton" , "Manuel Agnelli" , "J-Ax" , "Francesco Totti" , "Ilary Blasi" , "Bebe Vio" , "Luis" , "Pardis Zarei" , "Martina Maccherone" , "Rachel Zeilic" };
		// new scanner instance 
		Scanner scanner = new Scanner(System.in);
		// user input
		System.out.println("Inserisci il tuo nome: ");
		String userName = scanner.nextLine();
		// check name variable
		boolean checkName = false;
		// for cycle to scroll through guestsList elements
		for (int i=0; i < guestsList.length; i++) {
			if (guestsList[i].toLowerCase().equals(userName.toLowerCase())) {
				checkName = true;
				break;
			}
		}
		
	}

}
