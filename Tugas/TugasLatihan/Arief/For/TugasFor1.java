/*
Date Created	: 16 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

class TugasFor1 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		int angka, maxAngka, nol, satu, dua, empat;

		maxAngka = 1000;
		nol = 0;
		satu = 1;
		dua = 2;
		empat = 4;

		for ( angka = satu ; angka <= maxAngka; angka ++ ) {
			if ((angka % empat == nol) || (angka % dua == satu)) {
				System.out.print(angka + "\t");	
			}
		}

	}
}