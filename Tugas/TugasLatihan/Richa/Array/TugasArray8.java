/* 
Created by  		: Richa Fitria
Date/hour			: 21 Mei 2018/ 06.34 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class TugasArray8 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18,29, 49};
		int[] arr2 = new int[10];

		System.out.println("===============================");
		System.out.print("Array 1: ");

		for (int index=0; index < arr1.length; index++) {
			System.out.print (arr1[index] + " ");
			arr2[index] = arr1 [index];
		}
		System.out.println();

		System.out.print("Array 2: ");
		for (int index=0; index < arr1.length; index++) {
			System.out.print (arr2[index] + " ");
		}

		

	}
}

/*7. Copy isi arr1 ke arr2 */