/* 
Created by  		: Richa Fitria
Date/hour			: 22 Mei 2018/ 12.49 AM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class TugasArray9 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18,29, 49};
		int minimum;


		minimum = arr1 [0];
		for (int index = 0; index < arr1.length; index++) {
			if (arr1[index] < minimum) {
				minimum= arr1 [index];
			}
		}

		System.out.print("Nilai minimum arr1 adalah " + minimum);
	
	}
}

/* Tampilkan nilai minimum arr1 */