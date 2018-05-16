/*
	 Program     : Tugas For - Dot On Your Word
     Creator     : Khairil
     Created At  : 16 Mei 2018 13:55 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class DotOnYourWord {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Scanner keyboard2 = new Scanner(System.in);
		String firstWord, secondWord, titikAjah;
		int jumFirstWord, jumSecondWord, totalChar, jumTitik;

		titikAjah = "."; 

		System.out.print("Enter first word : ");
		firstWord = keyboard.nextLine();

		System.out.print("Enter second word : ");
		secondWord = keyboard2.nextLine();
		System.out.println();

		jumFirstWord = firstWord.length();
		jumSecondWord = secondWord.length();
		totalChar = 30 - (jumFirstWord + jumSecondWord);

		System.out.println("Result");
		System.out.print(firstWord);
		for(jumTitik = 1; jumTitik <= totalChar; jumTitik++) {
			System.out.print(titikAjah);
		}
		System.out.print(secondWord);
		System.out.println();
	}
}