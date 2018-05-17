/*
	Created By Vikri
	16/05/2018
	14:21
*/
import java.util.Random;
import java.util.Scanner;

public class SoalLatihan6{
	public static void main(String[] args) {
		String word, titik, secWord;
		int jmlWord, jmlWord2, jml, jml2, i;

		Scanner string = new Scanner(System.in);

		System.out.print("Enter First Word: ");
		word=string.next();

		System.out.print("Enter Second Word: ");
		secWord=string.next();

		jmlWord = word.length();
		jmlWord2 = secWord.length();

		jml = jmlWord+jmlWord2;
		jml2 = 30-jml;

		System.out.print(word);
		for (i = 0; i<=jml2 ; i++) {
			System.out.print(".");
		}
		System.out.print(secWord);
	}
}