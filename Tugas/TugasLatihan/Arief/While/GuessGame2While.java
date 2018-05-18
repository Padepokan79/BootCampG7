/*
Date Created	: 16 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;
import java.util.Random;

public class GuessGame2While {
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
		figure = rand.nextInt(random)+hot;
		System.out.println("You must guess what it is in three tries.");

		index = nol;
		while (index < cold) {
			System.out.print("Enter a guess: ");
			guess = inputKey.nextInt();

			if (guess == figure) {
				System.out.println("You have won the game");
				index+=cold;
			}else {
				if (index >= warm) {
					System.out.println("The correct number was " + figure);
					System.out.println("You have lost the game");
				}else {
					if ((guess - hot) == figure || (guess + hot) == figure) {
						System.out.println("Hot\n");	
					}else if ((guess - warm) == figure || (guess + warm) == figure) {
						System.out.println("Warm\n");
					}else {
						System.out.println("Cold\n");
					}
				}
			}	
			index ++;
		}
	}
}



