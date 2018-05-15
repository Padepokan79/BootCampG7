/*
Date Created	: 08 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Ex18Drills1{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String secret = "please", secret2 = "mordor", guess;

		System.out.println("What is the secret word? ");
		guess = keyboard.next();

		if ( guess.equals(secret) || guess.equals(secret2) ) {
			System.out.print("That's correct!");
			if (guess.equals(secret)) {
				System.out.println(", That's the first password!");
			}
			else {
				System.out.println(", That's the second password!");
			}
		}
		else {
			System.out.println("No, the secret word isn't \"" + guess + "\".");
		}

		if ( guess == secret ) {	
			System.out.println("(This will never show, no matter what.)");
		}

	}
}