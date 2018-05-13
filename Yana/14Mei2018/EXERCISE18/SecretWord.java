/*
Created by	: Yana
Time		: 10 Mei 2018 17.05
*/

import java.util.Scanner;

public class SecretWord{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		String secret = "please", guess;

		System.out.print("What is the secret word? ");
		guess = keyboard.next();

		if (guess.equals(secret)) {
			System.out.println("That's correct");
		}
		else{
			System.out.println("No, the secret word isn't \"" +guess+ "\".");
		}
		if (guess == secret) {
			System.out.println("(Tis will never ever show, no matter what.)");
		}
	}
}