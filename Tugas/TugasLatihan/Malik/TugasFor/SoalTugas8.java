/*
created by 	: Malik Chaudhary
time 		: 16-05-2018 2:53PM
soal :

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
You have lost the game.

==========================================================
Write a more complicated guessing game, similar to the one in Exercise 1, 
but now the program is to write "cold" when the guess is 3 or more away from the correct answer, 
"warm" when the guess is 2 away, and "hot" when the guess is 1 away. As soon as the user enters the correct 
number the program writes a winning message and exits. For example:


*/

import java.util.Scanner;
import java.util.Random;
public class SoalTugas8{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);
		Random rand = new Random();

		int tebakan, random, chance;

		random = rand.nextInt(11);

		System.out.println("angka random PC : "+random);
		for ( chance = 1; chance <= 3 ; chance++ ) {
			System.out.println("Masukan tebakan : ");
			tebakan = num.nextInt();
			if ( tebakan == random ) {
				System.out.print("RIGHT!\nYou have won the game");
				chance = 3;
			}else{
				if ( (tebakan-random) >= 3 || (tebakan-random) <= -3 ) {
					System.out.println("COLD");
				}else if ( tebakan-random == 2 || tebakan-random == -2 ) {
					System.out.println("WARM");
				}else if ( tebakan-random == 1 || tebakan-random == -1 ) {
					System.out.println("HOT");
				}
				if ( chance == 3 ) {
					System.out.print("GAME OVER");
				}
			}
		}

	}
}

// 			tebakan2 = num.nextInt();
// 			if ( tebakan2 == random ) {
// 				System.out.print("RIGHT!\nYou have won the game");
// 			}else{
// 				System.out.println("WRONG");
// 				tebakan3 = num.nextInt();
// 				if ( tebakan3 == random ) {
// 					System.out.print("RIGHT!\nYou have won the game");
// 				}else{
// 					System.out.print("Kesempatan Habis\nGAME OVER");
// 				}
// 			}