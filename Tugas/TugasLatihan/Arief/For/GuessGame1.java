/*
Date Created	: 16 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;
import java.util.Random;

public class GuessGame1 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		Random rand = new Random();

		int index, figure, guess, nol, cold, warm, hot, random;

		nol = 0;
		cold = 3;
		warm = 2;
		hot = 1;
		random = 10;

		System.out.println("I am thinking of a number from 1 to 10.");
		figure = rand.nextInt(random) + hot;
		System.out.println("You must guess what it is in three tries.");

		for (index = nol ; index < cold ; index ++) {
			System.out.print("Enter a guess: ");
			guess = inputKey.nextInt();
			if (guess == figure) {
				System.out.println("You have won the game");
				index+=cold;
			}else {
				System.out.println("Wrong! Try again\n");
				if (index >= warm) {
					System.out.println("The correct number was " + figure);
					System.out.println("You have lost the game");
				}
			}
		}
	}
}



