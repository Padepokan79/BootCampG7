/*
created by 	: Malik Chaudhary
time 		: 17-05-2018 1:31PM

soal :
>Write an even more complicated guessing game. In this version, the full game consists of 10 "rounds," where each round is a game like exercise 2. After the 10 rounds, the program prints out how many of the 10 rounds were won and how many were lost.
>
>players who win 7 or fewer rounds are rated as "amateurs,"
>players who win 8 rounds are rated as "advanced,"
>players who win 9 rounds are rated as "professionals," and
>players who win all 10 rounds are rated as "hackers."
>Here is an example run:
>
>C:\>java GuessingGame
>
>round 1:
>
>I am thinking of a number from 1 to 10.
>You must guess what it is in three tries.
>Enter a guess:
>4
>hot
>5
>RIGHT!
>You have won 1 out of 1 rounds.
>
>round 2:
>
>I am thinking of a number from 1 to 10.
>You must guess what it is in three tries.
>Enter a guess:
>10
>cold
>5
>cold
>3
>wrong
>The correct number was 1
>You have won 1 out of 2 rounds.
>
>. . .
>
>round 10:
>
>I am thinking of a number from 1 to 10.
>You must guess what it is in three tries.
>Enter a guess:
>1
>cold
>6
>warm
>8
>RIGHT!
>You have won 7 out of 10 rounds.
>
>Your rating: amateur.

*/

import java.util.Scanner;
import java.util.Random;
public class TugasWhile4{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);
		Random rand = new Random();

		int tebakan, random, satu = 1, dua = 2, tiga = 3, chance2 = 1, benar = 0, sepuluh = 10;
		int tujuh = 7, delapan = 8, sembilan = 9, minDua = -2, minTiga = -3, minSatu = -1;

		while ( chance2 <= sepuluh ) {
			random = rand.nextInt(11);
			System.out.println("angka random PC : "+random+"\n");
			System.out.print("Ronde "+chance2+"\n");
			int chance = satu;
			
				while( chance <= tiga ){
					System.out.println("Masukan tebakan : ");
					tebakan = num.nextInt();
					if ( tebakan == random ) {
						benar += satu;
						System.out.print("RIGHT!\nYou have won the game");
						chance = tiga;
							System.out.print("You have won "+benar+" to 10\n\n");
					}else{
						if ( (tebakan-random) >= tiga || (tebakan-random) <= minTiga ) {
							System.out.println("COLD");
						}else if ( tebakan-random == dua || tebakan-random == minDua ) {
							System.out.println("WARM");
						}else if ( tebakan-random == satu || tebakan-random == minSatu ) {
							System.out.println("HOT");
						}
						if ( chance == tiga ) {
							System.out.print("GAME OVER\n");
							System.out.print("You have won "+benar+" to 10\n\n");
						}
						
					}
					chance += satu;
			}
			if ( chance2 == sepuluh ) {
				if ( benar <= tujuh ) {
				System.out.print("Rating : Amateur");
				}else if ( benar == delapan ) {
					System.out.print("Rating : Advanced");
				}else if ( benar == sembilan ) {
					System.out.print("Rating : Professionl");
				}else if ( benar == sepuluh ) {
					System.out.print("Rating : Hack");
				}
			}
			chance2 += satu;	
		}

	}
}