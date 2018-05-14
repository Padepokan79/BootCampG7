/*
Date Created	: 08 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class SecretWord{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String secret = "please", guess;

		System.out.println("What is the secret word? ");
		guess = keyboard.next();

		if ( guess.equals(secret) ) {
			System.out.println("That's correct!");
		}
		else {
			System.out.println("No, the secret word isn't \"" + guess + "\".");
		}

		if ( guess == secret ) {	
			System.out.println("(This will never show, no matter what.)");
		}

	}
}