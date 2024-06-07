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
		scanner.close();
		// check name variable
		boolean checkName = false;
		// counter initialization
		int index = 0;
		// do-while loop
		do {
			if (guestsList[index].toLowerCase().equals(userName.toLowerCase())) {
				checkName = true;
			}
			index += 1;
		} while (!checkName && (index < guestsList.length));
		// output: display if user can join the party
				if (checkName) {
					System.out.println("Puoi entrare. Il tuo nome è sulla lista.");
				} else {
					System.out.println("Mi dispiace, il tuo nome non è sulla lista. Non puoi entrare.");
				}
	}

}
