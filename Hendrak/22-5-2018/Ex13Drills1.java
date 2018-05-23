//created by:Hendra Kurniawan 
//Date: 18 Mei 2018 Time:2:02 AM
//Modified by :
import java.util.Scanner;

public class Ex13Drills1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String word;
		boolean yep, nope;

		System.out.println( " Type the word \" weasel\" , please");
		word = keyboard.next();

		yep = "weasel".equals(word);
		nope = ! word.equals("weasel");

		System.out.println("You typed what was requested : " + yep);
		System.out.println("You ignored polite instructions : " + nope);

	}	

}//Its Work