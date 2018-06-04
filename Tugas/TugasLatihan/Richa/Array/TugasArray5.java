/* 
Created by  		: Richa Fitria
Date/hour			: 21 Mei 2018/ 03.36 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class TugasArray5 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18,29, 49};
		boolean cek = false;
		int addMe = 0, moveMe =  0;


		System.out.println("===============================");
		System.out.println("Masukkan angka: ");
		addMe = keyboard.nextInt ();

		System.out.println("Pindah ke posisi berapa? ");
		moveMe = keyboard.nextInt ();


		for (int index = 0; index < arr1.length; index++) {
			if (index == moveMe-1) {
				arr1 [index] = addMe;
			}
			System.out.print (arr1[index] +  " ");
		}

		
	}
}

/*
4. Terima nilai dan ubah nilai u/ suatu posisi pada arr1

*/