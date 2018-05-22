/* 
Created by  		: Richa Fitria
Date/hour			: 21 Mei 2018/ 03.15 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class TugasArray2 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		int jumlahArr1 = 0;
		double rata2;

		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18,29, 49};

		for (int index = 0; index < arr1.length; index++) {
			jumlahArr1 = jumlahArr1 + arr1 [index];
		}

		rata2= jumlahArr1/arr1.length;

		System.out.println("===============================");
		System.out.println("Rata-rata nilai arr 1: " + rata2);
	}
}

/*
int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};


1. Hitung jumlah dan rata-rata dari arr1 di atas
*/