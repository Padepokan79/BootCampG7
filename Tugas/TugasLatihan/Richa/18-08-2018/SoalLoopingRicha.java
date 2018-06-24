/* 
Created by  		: Richa Fitria
Date/hour			: 18 Mei 2018/ 01.40 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class SoalLoopingRicha {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		double gaji, naikGaji;
		int umurAwal, umurSekarang; 
		String pangkat;

		gaji = 1500000;
		naikGaji = 1.05;
		umurSekarang = 56;
		umurAwal = (umurSekarang-25);

		System.out.println("============================");
		System.out.println("       Gaji Pak Jokowi      ");
		System.out.println("============================");
		System.out.println();
		System.out.println("Umur: " + umurAwal);
		System.out.printf ("Gaji: %f.\n", gaji);
		System.out.println("-------------------------");

		do {
			System.out.println("Umur: " + (umurAwal+1));
			if (umurAwal%5 == 0) {
				System.out.println("Naik pangkat? (y/n)");
				pangkat = keyboard.next ();
				if (pangkat.equals ("y")) {
					gaji = (gaji*2)/1.05;
					System.out.printf ("Gaji: %f.\n", gaji);
						
				}
				else {
					gaji = gaji * naikGaji;
					System.out.printf ("Gaji: %f.\n", gaji);
					
				}
			}
			else {
				System.out.println("Naik pangkat? Tidak");
				gaji = gaji * naikGaji;
				System.out.printf ("Gaji: %f.\n", gaji);
				
			}
			System.out.println("-------------------------");
			umurAwal++;
		} while (umurSekarang>=umurAwal);
	
	}
}

/*
Soal looping (Richa)

1.

25 tahun yang lalu gaji pak Jokowi hanya 1500.000. Setelah berkarir cukup lama gaji pak jokowi
meningkat 20% per tahunnya dan tiap 5 tahun beliau mungkin naik pangkat hingga gajinya menjadi 2 

kali lipat dari yang sebelumnya. Berapa gaji pak jokowi sekarang jika umur beliau 56 tahun?

output:

==================
 Gaji Pak Jokowi
==================

Umur: 31 tahun
Naik pangkat? Tidak
gaji : 1500000

-------------------
Umur: 32 tahun
Naik pangkat? Tidak
gaji : 1800000

-------------------
.
.
.
.
.
.
------------------
Umur: 35 tahun
Naik pangkat? (y/n)
y
gaji: 5184000

------------------
Umur: 36 tahun
Naik pangkat? Tidak
gaji: 6220800

------------------
.
.
.
.
.
.
dan seterusnya

*/