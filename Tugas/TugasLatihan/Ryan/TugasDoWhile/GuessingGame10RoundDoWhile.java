/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 18 May 2018 13:04
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;
import java.util.Random;

public class GuessingGame10RoundDoWhile{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Random rand = new Random();

		int nilaiRandom, guess, batasKesempatan=3, kesempatan=1,
		round=1, jmlRound=10, won=0;

		do{

		nilaiRandom = rand.nextInt(10)+1;
		System.out.println("I am thinking of a number from 1 to 10.\nYou must guess what it is in three tries.");
		System.out.println("Enter a guess :");
			do{
				guess = key.nextInt();
			
				if (guess == nilaiRandom) {
					System.out.println("RIGHT!\nYou Have won the game.");
					kesempatan = kesempatan+batasKesempatan;
					won ++;
				}
				else if(kesempatan <= 2 && (guess == nilaiRandom+1 || guess == nilaiRandom-1)) {
					System.out.println("hot");
				}
				else if (kesempatan <= 2 && (guess == nilaiRandom+2 || guess == nilaiRandom-2)) {
					System.out.println("warm");	
				}
				else if(kesempatan <= 2){
					System.out.println("cold");
				}

				if (kesempatan == batasKesempatan) {
					System.out.println("Wrong\nThe correct number was "+nilaiRandom+"\nYou have lost then game.");
				}
				kesempatan++;	
				} while (kesempatan<=batasKesempatan);

			jmlRound--;
			int sisaRound = 10-jmlRound;
			System.out.println("\nYou Have won "+won+" out of "+sisaRound+" round");
			kesempatan=1;
			System.out.println();	
		} while ( round <= jmlRound);


		if (won <= 7) {
			System.out.println("\nYour rating: amateur.");
		}
		else if (won == 8) {
			System.out.println("\nYour rating: advanced.");
		}
		else if (won == 9) {
			System.out.println("\nYour rating: profesionals.");
		}
		else if (won == 10) {
			System.out.println("\nYour rating: HACKERS.");
		}

	}
}