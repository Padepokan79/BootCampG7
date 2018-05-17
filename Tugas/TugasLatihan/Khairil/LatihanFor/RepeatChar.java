/*
	 Program     : Tugas For - Repeat from Count Character Input
     Creator     : Khairil
     Created At  : 16 Mei 2018 13:55 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class RepeatChar {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String wordType;
		int executeLag, printing; 

		System.out.println("Enter a word : ");
		wordType = keyboard.next();
		System.out.println();

		executeLag = wordType.length();

		System.out.println("Result");
		for(printing = 1; printing <= executeLag; printing++) {
			System.out.println(wordType);
		}
	}
}