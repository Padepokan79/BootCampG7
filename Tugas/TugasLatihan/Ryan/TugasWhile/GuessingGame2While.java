/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 17 May 2018 13:24
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;
import java.util.Random;

public class GuessingGame2While{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Random rand = new Random();

		int nilaiRandom, guess, batasKesempatan=3, kesempatan=1;

		nilaiRandom = rand.nextInt(10)+1;

		System.out.println("I am thinking of a number from 1 to 10.\nYou must guess what it is in three tries.");
		System.out.println("Enter a guess :");

		while (kesempatan<=batasKesempatan) {
			guess = key.nextInt();
			
			if (guess == nilaiRandom) {
				System.out.println("RIGHT!\nYou Have won the game.");
				kesempatan = kesempatan+batasKesempatan;
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
		}
	}
}