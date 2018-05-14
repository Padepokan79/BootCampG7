/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 14 Mei 2018 09:20 
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class SecretWord{
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String secret = "please", guess;

		System.out.print( "What's the secret word? ");
		guess = keyboard.next();

		if (guess.equals(secret)) {
			System.out.println("That's correct!");
		}
		else {
			System.out.println("No, the secret word isn't \""+guess+"\".");
		}
		if (guess == secret ) {
			System.out.println("(This will never ever show, no matter what.)");
		}
	}
}