/* 
Created by  		: Richa Fitria
Date/hour			: 17 Mei 2018/ 01.21 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class GuessingGameWhile {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	Random rand = new Random();

	int tebak, angka, kesempatan;

	angka = rand.nextInt(10) + 1;
	System.out.println("angka random: " + angka);
	System.out.println("I am thinking of a number from 1 to 10.\nYou must guess what it is in three tries.");

	
	kesempatan = 1;
	while (kesempatan <=3){
			System.out.println("Enter a guess: "); 
			tebak = keyboard.nextInt();
		if (angka != tebak && kesempatan <=2) {
			if (angka-tebak>=3) {
				System.out.println("cold");
			}
			else if (angka-tebak == 2) {
				System.out.println("warm");
			}
			else if (angka-tebak == 1) {
				System.out.println("hot");
			}
			kesempatan++;
		}
		else if (kesempatan==3) {
				System.out.println("wrong\nThe correct number was " + angka + "\nYou have lost the game.");
		}

		else if (angka == tebak){
				kesempatan +=4;
				System.out.println("RIGHT!\nYou have won the game.");
		}
	}
}
}


/*Write a more complicated guessing game, similar to the one in Exercise 1, 
but now the program is to write "cold" when the guess is 3 or more away from the correct answer, 
"warm" when the guess is 2 away, and "hot" when the guess is 1 away. 
As soon as the user enters the correct number the program writes a winning message and exits. For example:

C:\>java GuessingGame

I am thinking of a number from 1 to 10.
You must guess what it is in three tries.
Enter a guess:
1
cold
5
RIGHT!
You have won the game.

C:\>java GuessingGame

I am thinking of a number from 1 to 10.
You must guess what it is in three tries.
Enter a guess:
4
cold
5
cold
8
wrong.
The correct number was 9.
You have lost the game.

C:\>java GuessingGame
I am thinking of a number from 1 to 10.
You must guess what it is in three tries.
Enter a guess:
4
hot
5
warm
3
RIGHT!
You have won the game.
*/