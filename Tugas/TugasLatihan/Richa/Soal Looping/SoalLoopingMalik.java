/* 
Created by  		: Richa Fitria
Date/hour			: 20 Mei 2018/ 11.36
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class SoalLoopingMalik {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random ();

		int poin, kesempatan, jmlPensil, acakPensil, tebak, cobaLagi;

		kesempatan =5;
		poin = 0;


		System.out.print("Jumlah pensil Rangga: ");
		jmlPensil = keyboard.nextInt ();


		do {
			acakPensil = rand.nextInt (jmlPensil) + 1;
			System.out.println(acakPensil);
			System.out.print("Tebak pensil Rangga? ");
			tebak = keyboard.nextInt ();
			if (tebak == acakPensil) {
				System.out.println("Tebakan benar");
				poin +=10;
				kesempatan++;
			}
			else {
				System.out.println("Tebakan salah");
				kesempatan--;
			}
			System.out.println("Poin: " + poin);
			System.out.println("Kesempatan: " + kesempatan);
			System.out.println("---------------------------");	

			if (kesempatan == 0 && poin >=10) {
			System.out.println("Kesempatan Anda sudah habis.\nBerapa poin yang ingin Anda tukarkan (10 poin = 1 kesempatan)?");
			cobaLagi = keyboard.nextInt ();
			poin = poin - cobaLagi;
			kesempatan = kesempatan + (cobaLagi/10);
			}											

		} while (kesempatan >0);


		System.out.println();	
		System.out.println("Skor terakhir " + poin + " poin");
		


		





	}
}


/*
Nama	: Malik Chaudhary
Time	: 2018-05-18 3:04PM

=========================================================================================================================
Soal :

Rangga menginputkan jumlah pensilnya sendiri 
rangga akan menebak jumlah pensilnya sendiri yang diacak oleh komputer

- pertama bermain player memiliki 5 kesempatan yang diberikan
- bila tebakan player benar, maka player mendapatkan satu kesempatan dan menambahkan 10 poin untuk skor
- kesempatan berlaku bila ia salah menebak, maka kesempatan yang dimiliki berkurang
- bila player sudah tidak memiliki kesempatan, maka permainan berakhir atau GAME OVER
- terkecuali bila player memiliki poin min 10 dan kesempatan sudah habis maka program akan bertanya, apakah ingin menukar 10
  poin untuk 1 kesempatan.

  *note : bila ada yang bingung bisa ditanyakan langsung
*/
