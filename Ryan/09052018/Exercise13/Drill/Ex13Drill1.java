/*
     * Weasel Or Not
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At : 09 May 2018 10:31
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex13Drill1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String word;
		boolean yep,nope;

		System.out.println("Type the word \"weasel\", please. ");
		word = keyboard.next();

		yep = "weasel".equals(word);
		nope = ! "weasel".equals(word);

		System.out.println("You typed what was requested: "+yep);
		System.out.println("You ignored polite instructions: "+nope);
	}
}