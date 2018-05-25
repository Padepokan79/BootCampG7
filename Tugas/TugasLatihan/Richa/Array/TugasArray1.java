/* 
Created by  		: Richa Fitria
Date/hour			: 21 Mei 2018/ 02.30 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class TugasArray1 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		int [] angka = {1, 4, 2, 5, 7, 10, 11, 2, 1};

		

		for (int number : angka) {
			System.out.println(number);
		}

		System.out.println();
		
		for (int index = 0; index <= angka.length; index++) {
			int number []= new int [angka.length];
			number [index] = angka [index];
			System.out.println(number[index]);
		}

	}
}