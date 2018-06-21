/* 
Created by  		: Richa Fitria
Date/hour			: 26 Mei 2018/ 1.14 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class SoalLatihanKuis1 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random ();

		int [] arrRandom = new int [10];

		for (int index = 1; index < arrRandom.length ; index++) {
			arrRandom [index] = rand.nextInt (9);
			System.out.print(" " + arrRandom [index]);
			if ((index)%3 == 0) {
			System.out.println();
			}

		}
	}
}


/*
1. Buatlah program untuk menampilkan isi array dalam bentuk persegi seperti  berikut, isi array random (0-9), panjang array 9. 
Contoh :
	7 4 9
	3 0 7
	6 4 9	

*/
