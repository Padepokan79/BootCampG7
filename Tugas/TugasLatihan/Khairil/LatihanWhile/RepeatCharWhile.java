/*
	 Program     : Tugas While - Repeat from Count Character Input
     Creator     : Khairil
     Created At  : 17 Mei 2018 13:04 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class RepeatCharWhile {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String wordType;
		int executeLag, printing; 

		printing = 1;

		System.out.println("Enter a word : ");
		wordType = keyboard.next();
		System.out.println();

		executeLag = wordType.length();

		System.out.println("Result");
		while(printing <= executeLag) {
			System.out.println(wordType);
			printing += 1;
		}
	}
}