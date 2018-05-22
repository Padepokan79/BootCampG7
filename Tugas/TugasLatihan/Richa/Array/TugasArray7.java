/* 
Created by  		: Richa Fitria
Date/hour			: 21 Mei 2018/ 06.34 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class TugasArray7 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);


		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18,29, 49};
		int nilai, sisip;
		int [] baru = new int [10];


		System.out.println("===============================");
		System.out.print("Masukkan nilai yang ingin ditambahkan: ");
		nilai = keyboard.nextInt ();

		System.out.print("Sisipkan nilai pada posisi keberapa? ");
		sisip = keyboard.nextInt ();

		for (int index = 0; index < baru.length; index++) { //copy ke array baru
			baru [index] = arr1 [index];
		}

		for (int index = 0; index < baru.length; index++) {
			if (index == sisip-1) {
				baru [index] = nilai;
			}
			else if (index > sisip-1) {
				baru [index] = arr1 [index];
			}
			else if (index < sisip-1) {
				baru [index] = arr1 [index];
			}
			System.out.print(baru[index] + " ");
		}
		


	}
}


/*
6. Sisip suatu bilangan pada posisi tertentu pada arr1

**bikin array baru untuk menampung
*/