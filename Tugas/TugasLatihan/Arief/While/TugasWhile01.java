/*
Date Created	: 17 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

class TugasWhile01 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		int angka, maxAngka, nol, satu, dua, empat;

		maxAngka = 1000;
		nol = 0;
		satu = 1;
		dua = 2;
		empat = 4;

		angka = satu;

		while (angka <= maxAngka) {
			if ((angka % empat == nol) || (angka % dua == satu)) {
				System.out.print(angka + "\t");	
			}	
			angka ++;
		}

		System.out.println("\n\nWhile ended here");

	}
}