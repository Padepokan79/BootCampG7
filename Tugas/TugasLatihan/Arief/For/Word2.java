/*
Date Created	: 16 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Word2 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		int angka, nol, end;
		String start;

		nol = 0;

		System.out.println("Enter Word : ");
		start = inputKey.next();
		end = start.length();
		System.out.println();

		for ( angka = nol ; angka < end ; angka ++ ) {
				System.out.println(start.charAt(angka));
		}

	}
}