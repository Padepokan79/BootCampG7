/* 
Created by  		: Richa Fitria
Date/hour			: 16 Mei 2018/ 6.32 PM
Updated by			: Richa Fitria
Updated Date/hour	: 17 Mei 2016/ 8.00 AM

*/

import java.util.Scanner;

public class KomandanBersatu {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);

	int batasSegitiga, kalimatLen, baris, spasi, urutanHuruf, indexHuruf =0;
	String kalimat;

		System.out.println("Kalimat: ");
	kalimat = keyboard.nextLine();
	System.out.print("Batas Segitiga: ");

	batasSegitiga = keyboard.nextInt ();
	
	

	//catatan: jumlah huruf yang diprint sejumlah urutan baris dimulai dari nol

	kalimatLen = kalimat.length ();

	for (baris = 0; baris < batasSegitiga; baris++ ) { //membuat baris dan sesuai dengan batas yg diinput
		for (spasi = 0; spasi < kalimatLen-baris; spasi++) { //membuat spasi 
		System.out.print(" ");
		}
		for (urutanHuruf = 0; urutanHuruf<= baris; urutanHuruf++) { // print huruf
			if (indexHuruf < kalimatLen){ //print huruf dalam range jumlah huruf kalimat
			System.out.print (kalimat.charAt(indexHuruf)) ;
			System.out.print(" ");
			indexHuruf++;
			}
			
		}
	System.out.println();
	}
	

}
}



/*
-Buatlah program untuk menampilkan kalimat dalam bentuk segitiga hingga batas segitiga yg ditentukan. Contoh :
	Batas segitiga : 6
	Kalimat : Komandan Bersatu

	         K
	        o m
	       a n d
	      a n   B
         e r s a t
        u
*/