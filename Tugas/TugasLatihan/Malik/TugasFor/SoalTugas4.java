/*
created by 	: Malik Chaudhary
time 		: 16-05-2018 2:02PM
soal :

Write a program that asks the user to enter a word. The program will then repeat word for as many times as 
it has characters:

Enter a word:
Hello

Hello
Hello
Hello
Hello
Hello

=====================================================
Buatlah program yang dapat menampilkan



*/

import java.util.Scanner;

import java.util.Scanner;
public class SoalTugas4{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);

		String word;
		int jlm, angka;

		System.out.print("Enter a word : ");
		word = num.next();

		jlm = word.length();

		for (angka = 1; angka <= jlm; angka++) {
				System.out.println(word);
		}

	}
}