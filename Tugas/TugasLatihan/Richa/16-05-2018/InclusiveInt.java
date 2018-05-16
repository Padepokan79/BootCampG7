/* 
Created by  		: Richa Fitria
Date/hour			: 16 Mei 2018/ 2.03 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;

public class InclusiveInt {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	String word;
	int wordLen, hasil;

	System.out.print("Enter a word: ");
	word = keyboard.next ();

	wordLen = word.length();

	for (hasil = 1; hasil <= wordLen; hasil+=1) {
		System.out.println(word);
	}
}
}

/*Write a program that asks the user to enter a word. The program will then repeat word for as many times as it has characters:

Enter a word:
Hello

Hello
Hello
Hello
Hello
Hello
*/