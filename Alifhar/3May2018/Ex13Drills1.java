/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	08.42
	* Updated by:
	*
*/

import java.util.Scanner;

public class Ex13Drills1{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		String word;
		boolean yep, nope;

		System.out.println("Type the word \"weasel\", please.");
		word=keyboard.next();

		yep="weasel".equals(word);
		nope=!word.equals("weasel");

		System.out.println("You typed what was instructed: "+yep);
		System.out.println("You ingonres polite instructions: "+nope);
	}
}