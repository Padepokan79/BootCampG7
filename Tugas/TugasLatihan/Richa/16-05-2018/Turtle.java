/* 
Created by  		: Richa Fitria
Date/hour			: 16 Mei 2018/ 02.23 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;

public class Turtle {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	String firstWord, secondWord;
	int wordLen, urutan, sisaTitik, firstLen, secondLen;

	System.out.println("Enter first word: ");
	firstWord = keyboard.next ();

	System.out.println("Enter second word: ");
	secondWord = keyboard.next ();

	firstLen = firstWord.length ();
	secondLen = secondWord.length ();
	wordLen = firstLen + secondLen;

	sisaTitik = 30-wordLen;

	System.out.print(firstWord);

	for (urutan= 1; urutan <= sisaTitik ; urutan+=1) {
		System.out.print(".");
	}

	System.out.print(secondWord);
}
}

/*
Write a program that asks the user to enter two words. The program then prints out both words on one line. The words will be separated by enought dots so that the total line length is 30:

Enter first word:
turtle
Enter second word
153

turtle....................153
*/

20 + 6 + 3