/* 
Created by  		: Richa Fitria
Date/hour			: 22 Mei 2018/ 09.16 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class TugasArray13 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18,29, 49};
		int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int [] arr4 = new int [arr1.length];
		int duplikat=0;
	
		System.out.println("===============================");
		System.out.print("Array 4:  ");


		for (int index = 0; index < arr1.length; index++) {
			arr4 [index] = arr1 [index] + arr3 [index];
			System.out.print(arr4[index] + " ");
		}
		
	}
}

/*12. Jumlahkan elemen arr1 dan arr3 simpan pada arr4 */