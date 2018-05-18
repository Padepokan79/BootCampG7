/* 	Date 		: 17/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
import java.util.Scanner;
import java.util.Random;

public class TugaswhileGuessingGame1 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Random rand = new Random();
		int numberOfTries=3, randomNumber, number, firstNumber=1;

		System.out.println("I am thinking of a number from 1 to 10.");
		System.out.println("You must guess what it is in three tries.");

		randomNumber = rand.nextInt(10)+1;
		System.out.println(randomNumber);

		while (firstNumber<=numberOfTries) {
			System.out.print("Your guess :");
			number = key.nextInt();	

			if (number==randomNumber) {
				System.out.println("RIGHT");
				firstNumber = numberOfTries;
				System.out.println("You won the game");
			}
			else {
				System.out.println("wrong");
				
				if (firstNumber == numberOfTries) {
					System.out.println("Your correct number is "+randomNumber);
					System.out.println("You've lost the game");
				}
			}

			firstNumber++;
		}


	}
}