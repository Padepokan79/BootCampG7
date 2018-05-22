/* 
Created by  		: Richa Fitria
Date/hour			: 22 Mei 2018/ 09.54 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class TugasArray15 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18,29, 49};
		int temp;

		System.out.print("Urutan array 1: ");

		for (int index = 0; index < arr1.length; index++) {
			for (int index2 = index+1; index2 < arr1.length; index2++){
				if (arr1[index] > arr1 [index2]) {
					temp = arr1 [index];
					arr1 [index] = arr1 [index2];
					arr1 [index2] = temp;
				}
			}
			System.out.print (arr1 [index]+ " ");
		}
	
	}
}

/*14. Mengurutkan nilai pada arr1 */