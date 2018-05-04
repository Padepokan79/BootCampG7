/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class WeaselOrNot {
		public static void main (String [] args ){
			Scanner keyboard = new Scanner(System.in);
			String word;
			boolean yep, nope;

			System.out.println("Type the word \"weasel\", please.");
			word = keyboard.next();

			yep = word.equals("weasel");
			nope = ! word.equals("weasel");

			System.out.println("You typed what was requested: " + yep);
			System.out.println("Ypu ignored polite instruction: " + nope);
		}
	}