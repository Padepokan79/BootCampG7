/* 
Created by  		: Richa Fitria
Date/hour			: 16 Mei 2018/ 2.16 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;

public class Hello {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	int hasil, wordLen;
	String word;

	System.out.print("Enter a word: ");
	word = keyboard.next ();

	wordLen = word.length();

	System.out.println();

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