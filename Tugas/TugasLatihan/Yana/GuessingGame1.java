/*
Creted by	: Yana
Time		: 16 Mei 2018
*/

import java.util.Scanner;
import java.util.Random;

public class GuessingGame1{
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		int yourGuess, random, angkaAwal, kesempatan = 3;

		random = rand.nextInt(10)+1;
		System.out.println(random);


		for (angkaAwal = 1; angkaAwal <= kesempatan; angkaAwal++ ) {
			System.out.print("Your guess:");
			yourGuess = keyboard.nextInt();

			if ( yourGuess == random ) {
				System.out.println("RIGHT!");
				angkaAwal = kesempatan;
				System.out.println("You have won the game");
			} else{
				System.out.println("wrong");
				if ( angkaAwal == kesempatan) {
					System.out.println("The correct number is "+random);	
					System.out.println("You have lost the game");					
				}
			}
		}

	}
}