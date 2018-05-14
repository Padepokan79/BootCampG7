/*
created by : Malik Chaudhary
time : 09-05-2018 9:28AM
*/
import java.util.Scanner;
public class Ex13Drill1{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		String word;
		boolean yep, nope;

		System.out.println(" Type the word \"Weasel\", please");
		word = keyboard.next();

		yep = "weasel".equals(word);
		nope = ! word.equals("weasel");

		System.out.println("You type what was requested : "+yep);
		System.out.println("You ignore polite instructions : "+nope);
	}
}