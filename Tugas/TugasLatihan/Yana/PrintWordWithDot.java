/*
Creted by	: Yana
Time		: 16 Mei 2018
*/

import java.util.Scanner;

public class PrintWordWithDot{
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		String firstWord, secondWord, dot=".";
		int angkaAwal = 1;

		System.out.print("Enter first word: ");
		firstWord = keyboard.next();
		System.out.print("Enter first word: ");
		secondWord = keyboard.next();

		System.out.print(firstWord);
		for (angkaAwal = 1 ; angkaAwal <= 30 ; angkaAwal++ ) {
			System.out.print(".");
		}
		System.out.print(secondWord);
	}
}