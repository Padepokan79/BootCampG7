/*
	DATE CREATED : 22 MEI 2018
	TIME  		 : 09.30 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;	
public class LatihanArray14 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int inputIndex1, inputIndex2, tampung = 0;
		boolean cek = false;

		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] arr2 = new int[10];
		int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int[] arr4 = new int[10];

		System.out.print("Nilai : ");
		for ( int number : arr1) {
			System.out.print(" "+number+" ");
		}
		System.out.println("");

			System.out.print("Input Index Pertama ? ");
			inputIndex1 = keyboard.nextInt();

			System.out.print("Input Index Kedua ? ");
			inputIndex2 = keyboard.nextInt();

		for (int a = 0; a < arr1.length; a++) {
			if (a == inputIndex1) {
				tampung = arr1[a];
				cek = true;
			}
			else if (a == inputIndex2) {
				arr1[inputIndex1] = arr1[a];
				arr1[inputIndex2] = tampung;
				cek = true;
			}
		}
		
		System.out.println("");
		System.out.print("Array 1 : ");
		for ( int number : arr1) {
			System.out.print(" "+number+" ");
		}
		System.out.println("");

	}
}