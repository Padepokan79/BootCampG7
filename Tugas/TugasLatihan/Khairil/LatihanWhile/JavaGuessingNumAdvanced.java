/*
	 Program     : Tugas While - Java Guessing 2 (Advanced Version)
     Creator     : Khairil
     Created At  : 16 Mei 2018 13:31 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;
import java.util.Random;

public class JavaGuessingNumAdvanced {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int poin, hideNumber, guessNumber, repeater, tempCold, tempWarm, tempHot, goCold, goWarm, goHot, first, max, round, totalRound;
		Random r = new Random();
		first = 1;
		max = 3;
		round = 1;
		totalRound = 10;
		poin = 0;

		while(round <= 10) {
			hideNumber = r.nextInt(10) + 1; 			
			
			tempCold = hideNumber - 3;
			tempWarm = hideNumber - 2;
			tempHot  = hideNumber - 1;

			goCold = hideNumber + 3;
			goWarm = hideNumber + 2;
			goHot = hideNumber + 1;

			repeater = first; 

			System.out.println("Welcome To Guessing Number :");
			System.out.println("Are You Lucky ?? Let's Try Guess");
			System.out.println("Round " + round + " of " + totalRound);

			while(repeater <= max) {

				System.out.println();
				System.out.println("Enter a guess " + repeater);
				guessNumber = keyboard.nextInt();
			
				if(hideNumber == guessNumber) {
					System.out.println("RIGHT!!");
					System.out.println("You have won a game!");
					System.out.println();
					poin = poin + 1;
					break;
				}
				else {
					if(guessNumber <= tempCold || guessNumber >= goCold ) {
						if(repeater == max) {
							System.out.println("WRONG!");	
							System.out.println("The Right is " + hideNumber);		
							System.out.println();
							poin = poin + 0;					
						}
						else {
							System.out.println("Cold");
						}					
					}
					else if(guessNumber == tempWarm || guessNumber == goWarm ) {
						if(repeater == max) {
							System.out.println("WRONG!");	
							System.out.println("The Right is " + hideNumber);							
							System.out.println();
							poin = poin + 0;												
						}
						else {
							System.out.println("Warm");
						}					
					}
					else if(guessNumber == tempHot || guessNumber == goHot ) {
						if(repeater == max) {
							System.out.println("WRONG!");
							System.out.println("The Right is " + hideNumber);
							System.out.println();	
							poin = poin + 0;							
						}
						else {
							System.out.println("Hot");
						}					
					}
				}
				repeater = repeater + 1;
			}
			round = round + 1;
			System.out.println("Poin anda adalah : " + poin);
			System.out.println("\n\n");
		}
		
		if(poin <= 7) {
			System.out.println("You Are AMATEUR");
		}
		else if(poin == 8) {
			System.out.println("You are ADVANCED!");
		}
		else if(poin == 9) {
			System.out.println("You are PROFESSIONAL!!");
		}
		else if(poin == 10) {
			System.out.println("You are HACKER!!!");
		}
		else {
			System.out.println("An error occured...");
		}		
	}
}