/* 
Created by  		: Richa Fitria
Date/hour			: 21 Mei 2018/ 03.36 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class TugasArray4 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18,29, 49};
		boolean cek = false;
		int findMe = 0;


		System.out.println("===============================");
		System.out.println("Cek posisi angka?\nMasukkan angka: ");
		findMe = keyboard.nextInt ();

		for (int index = 0; index < arr1.length; index++) {
			if (findMe == arr1 [index]) {
				System.out.println("Angka " + findMe + " berapa pada posisi ke-" + (index+1));
				cek = true;
			}
		}

		if (cek == false) {
			System.out.println("Angka tersebut TIDAK ADA di posisi manapun");
		}

		for (int index = 0; index < arr1.length; index++) {
			if (findMe == arr1 [index]) {
				System.out.println("Angka " + findMe + " berapa pada index ke-" + index);
				cek = true;
			}
		}

		if (cek == false) {
			System.out.println("Angka tersebut TIDAK ADA di index manapun");
		}

	}
}

/*
3. Suatu bilangan ada di-posisi/index ke berapa di arr1?

*/