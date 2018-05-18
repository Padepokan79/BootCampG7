/* 	Date 		: 18/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;
	import java.util.Random;
	
	public class TugasDoWhileGuessingGame {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			Random rand = new Random();

			int numberOfTries=3, randomNumber, number, firstNumber=1,won=0, round=0, maxRound=10;

			System.out.println("I am thinking of a number from 1 to 10.");
			System.out.println("You must guess what it is in three tries.");

			randomNumber = rand.nextInt(10)+1;
			//System.out.println(randomNumber);


			do {
				System.out.println("\nI am thinking of a number from 1 to 10.");
				System.out.println("You must guess what it is in three tries.");
			
				randomNumber = rand.nextInt(10)+1;
				//System.out.println(randomNumber);

				do {
					System.out.print("Your guess :");
					number = key.nextInt();	

					if (number==randomNumber) {
						System.out.println("RIGHT");
						firstNumber = numberOfTries;
						System.out.println("You won the game");
						won ++;
					}
					else {
						if (firstNumber<=numberOfTries-1) {
							if (number==randomNumber+1 || number==randomNumber-1) {
								System.out.println("hot");
							}
							else if (number==randomNumber+2 || number==randomNumber-2) {
								System.out.println("warm");
							}
							else {
								System.out.println("cold");
							}
						}
					if (firstNumber == numberOfTries) {
						System.out.println("Your correct number is "+randomNumber);
						System.out.println("You've lost the game");
						}
					}
				firstNumber++;

				} while (firstNumber<=numberOfTries);

			} while (round < maxRound);

			if (won>=10) {
				System.out.println("Your skill is hackers");
			}
			else if (won>=9) {
				System.out.println("Your skill is profesionals");
			}
			else if (won>=8) {
				System.out.println("Your skill is advance");
			}
			else {
				System.out.println("Your skill is amateurs,");
			}

		}

	}