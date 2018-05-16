/*
	 Program     : Tugas For - Java Guessing 1
     Creator     : Khairil
     Created At  : 16 Mei 2018 14:30 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;
import java.util.Random;

public class JavaGuessingNum {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int hideNumber, guessNumber, repeater, first, max;
		Random r = new Random();
		hideNumber = r.nextInt(10) + 1;
		first = 1;
		max = 3; 

		for(repeater = first; repeater <= max; repeater++) {
			System.out.println("Enter a guess " + repeater);
			guessNumber = keyboard.nextInt();
			if(hideNumber == guessNumber) {
				System.out.println("RIGHT!!");
				System.out.println("You have won a game!");
			}
			else {
				System.out.println("WRONG");	
			}
		}
	}
}