/* 
Created by  		: Richa Fitria
Date/hour			: 28 Mei 2018/ 10.28 AM
Updated by			:
Updated Date/hour	:
*/

import java.util.Scanner;
import java.util.Random;

public class SoalLatihanKuis4 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		int input;

		System.out.print("input angka :  ");
		input = keyboard.nextInt ();
		System.out.println();

		for (int baris = 1; baris < input+1; baris++) {
			for (int spasi = input; spasi > baris; spasi-- ) {
				System.out.print(" ");
			}
			for (int kolom = 1; kolom < baris+1; kolom++ ) {
				System.out.print("#");
			}	
			System.out.println();
		}

	}
}

/*
4. buat sebuah tampilkan # membentuk sebuah tangga, seperti contoh berikut: 

contoh 1:
input angka : 5  // di input user

    #
   ##
  ###
 ####
#####

contoh 2:
input angka : 3  // di input user

  #
 ##
###
*/