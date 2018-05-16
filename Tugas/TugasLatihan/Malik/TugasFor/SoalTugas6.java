/*
created by 	: Malik Chaudhary
time 		: 16-05-2018 2:19PM
soal :

Write a program that asks the user to enter two words. The program then prints out both words on one line. 
The words will be separated by enought dots so that the total line length is 30:

Enter first word:
turtle
Enter second word
153

turtle....................153

==================================================




*/

import java.util.Scanner;
public class SoalTugas6{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);

		String word1, word2, kata;
		int jml1, jml2, total, kurang, angka;


		System.out.print("Masukan kata pertama : ");
		word1 = num.next();

		System.out.print("Masukan kata kedua : ");
		word2 = num.next();

		jml1 	= word1.length();
		jml2 	= word2.length();

		total 	= jml2+jml1;
		kurang  = 30-total;

		System.out.print(word1);
		for (angka = 0; angka < kurang; angka++) {
			System.out.print(".");
		}
		System.out.print(word2);


	}
}