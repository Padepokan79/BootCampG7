/* 
Created by  		: Richa Fitria
Date/hour			: 22 Mei 2018/ 09.27 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class TugasArray14 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18,29, 49};
		int temp, posisi, posisi2;
		
		System.out.print("Array 1: ");
			for (int index = 0; index < arr1.length; index++) {
			System.out.print(arr1 [index] + " ");
		}

		System.out.println();
		System.out.println("===============================");
		System.out.print("Posisi berapa yang akan ditukar? ");
		posisi = keyboard.nextInt ();

		System.out.print("dan posisi? ");
		posisi2 = keyboard.nextInt ();

		System.out.print("Array 1 menjadi:  ");

		for (int index = 0; index < arr1.length; index++) {
			if (index == posisi-1) {
				temp = arr1 [posisi-1];
				arr1 [posisi-1] = arr1 [posisi2-1];
				arr1 [posisi2-1] = temp;
			}
			System.out.print(arr1 [index] + " ");

		}


		
	}
}

/*13. Tukar nilai antara dua posisi pada arr1*/