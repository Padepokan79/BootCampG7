/* 
Created by  		: Richa Fitria
Date/hour			: 28 Mei 2018/ 10.53 AM
Updated by			:
Updated Date/hour	:
*/

import java.util.Scanner;
import java.util.Random;

public class SoalLatihanKuis5 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int temp;

		int [] array = {0,0,80,49,0,13,57,0,0,61,0,72,0,34,26};
		int [] baru = new int [array.length];


		for (int index = 0; index < array.length; index++) {
			for (int index1 = index+1; index1 < array.length; index1++) {
				if (array[index] > array[index1]) {
					temp = array [index];
					array [index] = array [index1];
					array [index1] = temp;
				}
			}
			System.out.print (array[index] + " ");
		}
		System.out.println();

		for (int index = 0; index < array.length; index++) { 
			if (array [index] == 0) {
				array [index1] = array [index];
				for (int index1 = array.length; index1 > index; index1--) {	
					array [index] = array [index+1];
				}
			}
			System.out.print (array[index] + " ");
		}
	}
}

/*

5.Original Array : {0,0,80,49,0,13,57,0,0,61,0,72,0,34,26}

urutkan dari kecil ke besar dan simpan angka 0 di akhir array

hasil Array : 13, 26, 34, 49, 57, 61, 72, 80, 0, 0, 0, 0, 0, 0, 0


*/