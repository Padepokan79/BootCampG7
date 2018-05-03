/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 8.34 AM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class WeaselOrNot1 {
	public static void main (String [] args){
		Scanner keyboard = new Scanner (System.in);
		String word;
		boolean yep, nope;

		System.out.println ("Type word \"weasel\", please.");
		word = keyboard.next ();

		yep = word.equals ("weasel");
		nope = ! word.equals ("weasel");

		System.out.println ("You typed what was requested: " + yep);
		System.out.println ("You ignored polite instructions: " + nope);

	}
}