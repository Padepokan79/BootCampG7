/* 
Created by  		: Richa Fitria
Date/hour			: 21 Mei 2018/ 06.34 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class TugasArray6 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18,29, 49};
		int hapus;


		System.out.println("===============================");
		System.out.print("Nilai array yang akan dihapus urutan ke? ");
		hapus = keyboard.nextInt ();

		for (int index = 0; index < arr1.length-1; index++) {
			if (index >= hapus-1) {
				arr1 [index] = arr1 [index+1];
			}
		System.out.print(arr1[index] + " ");
		System.out.println(arr1.length);
		}

	}
}

/*

5. Hapus suatu posisi dari arr1
**bikin array baru untuk menampung


*/