/*
Creted by	: Yana
Time		: 16 Mei 2018
*/

import java.util.Scanner;

public class RepeatWordAsCharacter{
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		String 	word;
		int 	lenghtWord, angkaAwal;

		System.out.println("Enter a Word :");
		word = keyboard.next();
		lenghtWord = word.length();

		for (angkaAwal = 1; angkaAwal <= lenghtWord; angkaAwal++ ) {
			System.out.print("\n"word);
		}
	}
}
/*
Write a program that asks the user to enter a word. The program will then repeat word for as many times as it has characters:

Enter a word:
Hello

Hello
Hello
Hello
Hello
Hello
*/