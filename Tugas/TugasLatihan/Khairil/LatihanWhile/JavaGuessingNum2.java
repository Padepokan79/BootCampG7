/*
	 Program     : Tugas While - Java Guessing 2
     Creator     : Khairil
     Created At  : 16 Mei 2018 13:21 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;
import java.util.Random;

public class JavaGuessingNum2 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int hideNumber, guessNumber, repeater, tempCold, tempWarm, tempHot, goCold, goWarm, goHot, first, max;
		Random r = new Random();
		hideNumber = r.nextInt(100000) + 1; 
		first = 1;
		max = 3;

		repeater = first; 

		tempCold = hideNumber - 3;
		tempWarm = hideNumber - 2;
		tempHot  = hideNumber - 1;

		goCold = hideNumber + 3;
		goWarm = hideNumber + 2;
		goHot = hideNumber + 1;

		while(repeater <= max) {
			System.out.println("Enter a guess" + repeater);
			guessNumber = keyboard.nextInt();
			if(hideNumber == guessNumber) {
				System.out.println("RIGHT!!");
				System.out.println("You have won a game!");
				break;
			}
			else {
				if(guessNumber <= tempCold || guessNumber >= goCold ) {
					if(repeater == max) {
						System.out.println("WRONG!");	
						System.out.println("The Right is " + hideNumber);							
					}
					else {
						System.out.println("Cold");
					}					
				}
				else if(guessNumber == tempWarm || guessNumber == goWarm ) {
					if(repeater == max) {
						System.out.println("WRONG!");	
						System.out.println("The Right is " + hideNumber);							
					}
					else {
						System.out.println("Warm");
					}					
				}
				else if(guessNumber == tempHot || guessNumber == goHot ) {
					if(repeater == max) {
						System.out.println("WRONG!");
						System.out.println("The Right is " + hideNumber);	
					}
					else {
						System.out.println("Hot");
					}					
				}
			}
			repeater = repeater + 1;
		}
	}
}