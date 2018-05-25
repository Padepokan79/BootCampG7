/*
	DATE CREATED : 22 MEI 2018
	TIME  		 : 10.25 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;	
public class LatihanArray15 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int nilaiMin = 1000, satu = 1, tampung;

		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] arr2 = new int[10];
		int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int[] arr4 = new int[10];


		System.out.println("");
		System.out.print("Array Number : \t");
		for (int tampil : arr1) {
			System.out.print(tampil+" ");
		}
		System.out.println("");

		for (int a = 0; a < arr1.length; a++) {
				
				for (int b = a + 1; b < arr1.length; b++) {
					if (arr1[a] > arr1[b]) {
						tampung = arr1[a];
						arr1[a] = arr1[b];
						arr1[b] = tampung;
					}
				}
		}

			

		System.out.println("");
		System.out.print("Array Urut : \t");
		for (int tampil : arr1) {
			System.out.print(tampil+" ");
		}

	}
}