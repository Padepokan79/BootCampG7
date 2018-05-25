/* 
Created by  		: Richa Fitria
Date/hour			: 22 Mei 2018/ 09.00 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class TugasArray11 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18,29, 49};
		int duplikat=0;
	
		System.out.println("===============================");
		System.out.println("Nilai array yang memiliki angka lebih dari satu adalah ");


		for (int index1 = 0; index1 < arr1.length; index1++) {
			for (int index2 = index1+1; index2 < arr1.length; index2++) {
				if (arr1 [index1] == arr1 [index2]) {
					duplikat = arr1[index2];
					System.out.print(duplikat+ " ");
				}
				
			}

		}
		
	}
}


