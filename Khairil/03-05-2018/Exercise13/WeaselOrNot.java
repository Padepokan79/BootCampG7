/*
     Creator     : Khairil
     Created At  : 3 Mei 2018 08:45 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class WeaselOrNot {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String word;
		boolean yep, nope;

		System.out.println( "Type the word \"weasel\" please." );
		word = keyboard.next();

		yep  = "weasel".equals(word); //drill1
		// yep  =   word.equals("weasel");
		nope = ! word.equals("weasel");

		System.out.println( "You typed that was requested: " + yep );
		System.out.println( "You ignored polite instructions: " + nope );
	}
}