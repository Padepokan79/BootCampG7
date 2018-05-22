/* 
Created by  		: Richa Fitria
Date/hour			: 21 Mei 2018/ 03.15 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class TugasArray3 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18,29, 49};
		boolean cek = false;
		int findMe = 0;


		System.out.println("===============================");
		System.out.println("Cek angka?\nMasukkan angka: ");
		findMe = keyboard.nextInt ();

		for (int index = 0; index < arr1.length; index++) {
			if (findMe == arr1 [index]) {
				System.out.println("Angka tersebut ADA");
				cek = true;
			}
		}

		if (cek == false) {
			System.out.println("Angka tersebut TIDAK ADA");
		}

	}
}

/*
int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};



2. Apakah suatu bilangan ada di arr1 atau tidak?


4======================================
Masukan Nilai: 11
Masukan di posisi ke: 3

25, 14, 11, 15, 36, 56, 77, 18, 29 ,49
*/
