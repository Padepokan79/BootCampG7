/* 
Created by  		: Richa Fitria
Date/hour			: 16 Mei 2018/ 02.36 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class GuessingGame1 {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	Random rand = new Random();

	int tebak, angka, kesempatan;

	angka = rand.nextInt(10) + 1;
	System.out.println("angka random: " + angka);
	System.out.println("I am thinking of a number from 1 to 10.\nYou must guess what it is in three tries.");

	
	for (kesempatan = 1; kesempatan <= 3; kesempatan++) {
			System.out.println("Enter a guess: ");
			tebak = keyboard.nextInt ();
		if (angka != tebak) {
			System.out.println("wrong");
			if (kesempatan==3) {
				System.out.println("The correct number was " + angka + "\nYou have lost the game.");
			}
		}

		else if (angka == tebak){
				kesempatan +=1;
				System.out.println("RIGHT!\nYou have won the game.");
		}
	}
}
}


/*
Write a program that implements a guessing game. This is a "classic" program, frequently assigned in beginning CS classes.

The program picks a random number from 1 to 10. Now the user gets three guesses. As soon as the user enters the correct number the program writes a winning message and exits. If the user fails to enter the correct number in three guesses, the program writes a failure message and exits.
Use methods of the Random class. Here are two example runs of the program:

C:\>java GuessingGame

I am thinking of a number from 1 to 10.
You must guess what it is in three tries.
Enter a guess:
4
wrong
8
RIGHT!
You have won the game.

C:\>java GuessingGame
 
I am thinking of a number from 1 to 10.
You must guess what it is in three tries.
Enter a guess:
1
wrong
5
wrong
9
wrong
The correct number was 7.
You have lost the game. */