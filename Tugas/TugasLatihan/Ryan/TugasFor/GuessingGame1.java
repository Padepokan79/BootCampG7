/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 16 May 2018 14:38
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;
import java.util.Random;

public class GuessingGame1{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Random rand = new Random();

		int nilaiRandom, guess;

		nilaiRandom = rand.nextInt(10)+1;

		System.out.println("I am thinking of a number from 1 to 10.\nYou must guess what it is in three tries.");
		System.out.println("Enter a guess :");
		for (int i=1;i<=3;i++) {
			guess = key.nextInt();

			if (guess == nilaiRandom) {
				System.out.println("RIGHT!\nYou Have won the game.");
				i = i+3;
			}
			else {
				System.out.println("Wrong");
			}
		}
		System.out.println("The correct number was "+nilaiRandom+"\nYou have lost then game.");
	}
}