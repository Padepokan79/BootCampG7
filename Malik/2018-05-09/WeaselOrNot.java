/*
created by : Malik Chaudhary
time : 09-05-2018 9:22AM
*/
import java.util.Scanner;
public class WeaselOrNot{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		String word;
		boolean yep, nope;

		System.out.println(" Type the word \"Weasel\", please");
		word = keyboard.next();

		yep = word.equals("weasel");
		nope = ! word.equals("weasel");

		System.out.println("You type what was requested : "+yep);
		System.out.println("You ignore polite instructions : "+nope);
	}
}