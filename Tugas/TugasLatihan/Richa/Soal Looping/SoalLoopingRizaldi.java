/* 
Created by  		: Richa Fitria
Date/hour			: 20 Mei 2018/ 03.55 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class SoalLoopingRizaldi {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random ();

		int harga1, harga2, modal1, modal2, poin1 =0, poin2=0, random1=0, random2=0, poinMenang, sisaUang1, sisaUang2;

		poinMenang = 1000;
		modal1 = 100000;
		modal2 = 100000;
		sisaUang1 = modal1;
		sisaUang2 = modal2;

		System.out.println("Pilihan harga LOTRE!");
		System.out.println("harga 100 kesempatan mendapat point 0-10");
		System.out.println("harga 200 kesempatan mendapat point 0-20");
		System.out.println("harga 300 kesempatan mendapat point 0-50");
		System.out.println("harga 500 kesempatan mendapat point 0-100");
		System.out.println("Modal awal 100000");
		System.out.println("----------------------------------------");

		while ((sisaUang1 <= modal1 && sisaUang2 <= modal2) && (poin1 <= poinMenang && poin2 <= poinMenang)) {
			//pemain 1
			System.out.print("Pemain 1 -> harga: ");
			harga1 = keyboard.nextInt ();
			if (harga1 == 100) {
				random1 = rand.nextInt (10);
			}
			else if (harga1 == 200) {
				random1 = rand.nextInt (20);
			}
			else if (harga1 == 300) {
				random1 = rand.nextInt (50);
			}
			else if (harga1 == 500) {
				random1 = rand.nextInt (100);
			}
			poin1 = poin1 + random1;
			sisaUang1 = sisaUang1 -harga1;

			System.out.println("Poin pemain 1: " + poin1);
			System.out.println("Sisa uang pemain 1: " + sisaUang1);
			System.out.println("----------------------------------------");


			//Pemain 2
			System.out.print("Pemain 2 -> harga: ");
			harga2 = keyboard.nextInt ();

			if (harga2 == 100) {
				random2 = rand.nextInt (10);
			}
			else if (harga2 == 200) {
				random2 = rand.nextInt (20);
			}
			else if (harga2 == 300) {
				random2 = rand.nextInt (50);
			}
			else if (harga2 == 500) {
				random2 = rand.nextInt (100);
			}
			poin2 = poin2 + random2;
			sisaUang2 = sisaUang2 -harga2;

			System.out.println("Poin pemain 2: " + poin2);
			System.out.println("Sisa uang pemain 2: " + sisaUang2);
			System.out.println("----------------------------------------");

		}
		if (poin1 >= 1000) {
			System.out.println("Pemain 1 menang");
		}
		else if (poin2 >= 1000) {
			System.out.println("Pemain 2 menang");
		}
	
	}
}		










/*
Soal 2 tugas Looping >>>>>>>>>>>>>>>>>>
>lotre
- anda membeli lotre dengan kriteria
- harga 100 kesempatan mendapat point 0s/d10
- harga 200=0s/d20, 300=0s/d50, 500=0s/d100
- yang pertama kali mencapai point 1000 menang.
- yang uang nya habis, kalah dan point lotre nya tidak dapet.
- yang menjadi pemain 2 orang manusia.
- diberi modal awal 100.000.
*/