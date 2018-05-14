/*
	 Program     : Exercise 18 - Drills1
     Creator     : Khairil
     Created At  : 14 Mei 2018 10:00 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class SecretWord {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String secret = "please", guess ;

		System.out.print( "What's the secret word ?? " );
		guess = keyboard.nextLine();

		if( guess.equals(secret) || guess.equals("Khairil Anwar") ) { //drills1
			System.out.println( "That's Correct!" );
		}
		else {
			System.out.println( "No, the secret word isn't \"" + guess + "\"." );
		}

		if( guess == secret ) {
			System.out.println( "(This will never ever show, no matter what.)" );
		}   //cannot compare string using variable directly
	}
}