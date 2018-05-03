/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	08.35
	* Updated by:
	*
*/

import java.util.Scanner;

public class WeaselOrNot{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		String word;
		boolean yep, nope;

		System.out.println("Type the word \"weasel\", please.");
		word=keyboard.next();

		yep=word.equals("weasel");
		nope=!word.equals("weasel");

		System.out.println("You typed what was instructed: "+yep);
		System.out.println("You ingonres polite instructions: "+nope);
	}
}