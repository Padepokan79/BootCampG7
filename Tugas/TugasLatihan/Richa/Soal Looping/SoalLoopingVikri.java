/* 
Created by  		: Richa Fitria
Date/hour			: 20 Mei 2018/ 07.11 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class SoalLoopingVikri {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random ();

		int skorPersib, skorArema, babakPersib, babakArema, totalArema =0, totalPersib =0, tebakPersib, tebakArema;

		babakPersib =1;
		babakArema = 1;
		tebakPersib = 0;

		System.out.println("====================================");		
			
		skorPersib = rand.nextInt (5) + 1;
		skorArema = rand.nextInt (5) +1;
		System.out.println (skorPersib);
		System.out.println (skorArema);

		do {
			System.out.print("Masukan gol Persib babak ke " + babakPersib + ": ");
			tebakPersib= keyboard.nextInt ();	
			totalPersib = totalPersib + tebakPersib;
			System.out.print("Masukan gol Arema babak ke " + babakArema + ": ");	
			tebakArema = keyboard.nextInt ();
			totalArema = totalArema + tebakArema;
			System.out.println("====================================");		
			babakArema++;
			babakPersib++;
		} while (babakArema <= 2 || babakPersib <= 2);

		System.out.println("Skor Akhir nya adalah " + skorPersib + " : " + skorArema);
		System.out.println("Skor Tebakan Anda " + totalPersib + " : " + totalArema);
		System.out.println("====================================");		

		if (skorPersib == totalPersib && skorArema == totalArema) {
			System.out.println("Selamat Anda mendapatkan paket umroh gratis bareng pemain persib");
		}
		else if (skorPersib == totalPersib || skorArema == totalArema) {
			System.out.println("Selamat Anda mendapatkan kaos atep");
		}
		else {
			System.out.println("Maaf coba lagi minggu depan");

		}

	}
}


/*
diketahui pertandingan persib dan arema digelar hari ini, tapi tidak disiarkan tv karna kendala Stasiun televisi nya dibajak. 
agar tidak membuat para pendukung sepak bola tah air tidak kecewa, akhirnya panitia persib membuat kuis PERSIB VS AREMA, cara main nya adalah: 

	- tebak berapa gol yang dicetak persib dan arema di babak 1, lalu tebak lagi berapa gol di babak kedua.

	- kemudian gol dibabak ke 1 dan kedua akan dijumlahkan sebagai skor akhir;

	- jika skor akhir antara persib dan arema bisa ditebak maka, pemenang bisa mendapatkan paket umroh gratis bareng pemain persib.

	- dan jika berhasil menebak skor akhir dari salah satu tim akan diberi kaos atep

*Example
gunakan do While
skala skor 1 sd 10

====================================
Masukan gol Persib babak ke 1: 1
Masukan gol Arema babak ke 1: 1
====================================
Masukan gol Persib babak ke 2: 2
Masukan gol Arema babak ke 2: 2
====================================

Skor Akhir nya adalah 1 : 4
Skor Tebakan Anda 3 : 3
====================================
Maaf coba lagi minngu depan
====================================
*/