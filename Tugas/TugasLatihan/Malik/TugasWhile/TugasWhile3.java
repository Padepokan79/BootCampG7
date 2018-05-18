/*
created by 	: Malik Chaudhary
time 		: 17-05-2018 1:22PM
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
public class TugasWhile3{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);
		Random rand = new Random();

		int tebakan, random, chance = 1, satu = 1, dua = 2, tiga = 3;

		random = rand.nextInt(11);

		System.out.println("angka random PC : "+random); 
		while ( chance <= tiga ) {
			System.out.println("Masukan tebakan : ");
			tebakan = num.nextInt();
			if ( tebakan == random ) {
				System.out.print("RIGHT!\nYou have won the game");
				chance = tiga;
			}else{
				if ( (tebakan-random) >= tiga || (tebakan-random) <= -tiga ) {
					System.out.println("COLD");
				}else if ( tebakan-random == dua || tebakan-random == -dua ) {
					System.out.println("WARM");
				}else if ( tebakan-random == satu || tebakan-random == -satu ) {
					System.out.println("HOT");
				}
				if ( chance == tiga ) {
					System.out.print("GAME OVER");
				}
			}
			chance += 1;
		}

	}
}