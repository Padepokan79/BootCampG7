/*
Date Created	: 16 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		int angka, maxAngka, nol, satu, start, end, dua;

		maxAngka = 500;
		nol = 0;
		satu = 1;
		dua = 2;

		System.out.println("Enter Start : ");
		start = inputKey.nextInt();

		System.out.println("Enter End : ");
		end = inputKey.nextInt();
		System.out.println();

		for ( angka = start ; angka <= end; angka ++ ) {
			if (angka % dua == nol) {
				System.out.println(angka);
			}
		}

	}
}