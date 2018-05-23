/*
	DATE CREATED : 22 MEI 2018
	TIME  		 : 09.54 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;	
public class LatihanArray13 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int angkaDuplicat = 0, valueAngka;

		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] arr2 = new int[10];
		int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int[] arr4 = new int[10];

		System.out.print("Nilai 1: ");
		for ( int number : arr1) {
			System.out.print(" "+number+" ");
		}
		System.out.println("");
		System.out.print("Nilai 3: ");
		for ( int numbers : arr3) {
			System.out.print(" "+numbers+" ");
		}
		System.out.println("");

			for (int a = 0; a < arr1.length; a++) {

				for (int b = 0; b < arr3.length; b++) {
					if (a == b) {
						valueAngka  = arr1[a] + arr3[b];
						arr4[a] 	= valueAngka;
					}
				}

			}

			System.out.println("");
			System.out.print("Array 4: ");
			for ( int numbers : arr4) {
				System.out.print(" "+numbers+" ");
			}

	}
}