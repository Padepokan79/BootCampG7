/* 
Created by  		: Richa Fitria
Date/hour			: 17 Mei 2018/ 01.31 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class GuessingGameWhile2 {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	Random rand = new Random();

	int tebak, angka, kesempatan, round, jmlMenang;
	
	round =1;
	jmlMenang = 0 ;

	
	while (round <= 10) {
		kesempatan = 1;
		angka = rand.nextInt(10) + 1;
		System.out.println("=====================================");
		System.out.println("round " + round + ":");
		System.out.println();
		System.out.println("I am thinking of a number from 1 to 10.\nYou must guess what it is in three tries.");

		while (kesempatan <=3){

				System.out.println("Enter a guess: "); 
				tebak = keyboard.nextInt();
			if (angka != tebak && kesempatan <=2) {
				if (tebak >= angka+3 || tebak <= angka-3) {
					System.out.println("cold");
				}
				else if (angka == tebak + 2 || angka== tebak- 2) {
					System.out.println("warm");
				}
				else if (angka==tebak + 1 ||  angka==tebak - 1) {
					System.out.println("hot");
				}
			}
			else if (kesempatan==3 && angka != tebak) {
					System.out.println("wrong\nThe correct number was " + angka + "\nYou have lost the game.");
			}

			else if (angka == tebak){
					kesempatan +=4;
					jmlMenang++;
					System.out.println("RIGHT!\nYou have won the game.");
			}
			kesempatan++;
		}
			System.out.println("You have won " + jmlMenang + " out of " + (round) + " rounds.");
			round = round +1;
	}

				if (jmlMenang<7) {
					System.out.println("Your rating: amateur.");
				}
				else if (jmlMenang == 8) {
					System.out.println("Your rating: advanced. ");
				}
				else if (jmlMenang == 9) {
					System.out.println("Your rating: professionals.");
				}
				else if (jmlMenang == 10) {
					System.out.println("Your rating: hackers. ");
				}

}
}

/*
I am thinking of a number from 1 to 10.
You must guess what it is in three tries.
Enter a guess:
4
hot
5
RIGHT!
You have won 1 out of 1 rounds.

round 2:

I am thinking of a number from 1 to 10.
You must guess what it is in three tries.
Enter a guess:
10
cold
5
cold
3
wrong
The correct number was 1
You have won 1 out of 2 rounds.

. . .

round 10:

I am thinking of a number from 1 to 10.
You must guess what it is in three tries.
Enter a guess:
1
cold
6
warm
8
RIGHT!
You have won 7 out of 10 rounds.

Your rating: amateur.

players who win 7 or fewer rounds are rated as "amateurs,"
players who win 8 rounds are rated as "advanced,"
players who win 9 rounds are rated as "professionals," and
players who win all 10 rounds are rated as "hackers."

*/