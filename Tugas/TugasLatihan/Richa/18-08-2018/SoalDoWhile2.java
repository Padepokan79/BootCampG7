/* 
Created by  		: Richa Fitria
Date/hour			: 18 Mei 2018/ 12.59 PM
Updated by			: 
Updated Date/hour	: 

*/

import java.util.Scanner;

public class SoalDoWhile2 {
	public static void main( String[] args ) {

	int waktu, kue, waktuTotal;

	kue = 200; //banyak kue awal
	waktuTotal = (8*60) +30; // dalam menit

	System.out.println ("Sisa kue per 15 menit adalah ");
	System.out.println();

	waktu = 0;

	do {
			kue = kue - 3;

			System.out.print (" " + kue);	
			waktu= waktu + 15;
	}
	while (waktu <= waktuTotal ); 

		


}
}


/*Tampilkan angka ganjil dan angka kelipatan dari 1 sampai 1000. */
/*
Seorang Pedagang kue, setiap harinya membawa 200 potong kue untuk di jual.
Setiap 15 menit penjual tersebut berhasil menjual 3 potong kue.
Berapakah kue yang tersisa jika si penjual berjualan selama 8 jam 30 menit?

*/