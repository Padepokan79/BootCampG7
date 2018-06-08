/* 
Created by  		: Richa Fitria
Date/hour			: 20 Mei 2018/ 09.34
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class SoalLoopingChaudry {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random ();

		int ronde, kesempatan, maxRonde, nyawaPlayer, nyawaCom, menang, selisih;
		char tebakHuruf = 'a', tebakHuruf2 = 'a';

		ronde = 1;
		kesempatan = 1;
		maxRonde = 20;
		nyawaPlayer = 1;
		nyawaCom = 1;
		menang=0;

		while (ronde<= maxRonde && (nyawaCom <= 16 || nyawaPlayer <= 16)) {
			System.out.println("Ronde " + ronde);
			System.out.println("-----------------------------");
			char hurufCom = (char) (rand.nextInt(26) + 'A');
			System.out.println(hurufCom);
			System.out.print("Tebak huruf (capslock): ");
			tebakHuruf = keyboard.next().charAt(0);
			if (hurufCom == tebakHuruf) {
				System.out.println("Selamat! Tebakan kamu benar!");
				nyawaPlayer = nyawaPlayer +2;
				menang++;
			}
			else {
				System.out.println("Maaf. Tebakan kamu salah!");
				System.out.print("Tebak huruf LAGI (capslock): ");
				tebakHuruf2 = keyboard.next().charAt(0);
				if (hurufCom == tebakHuruf2) {
					System.out.println("Selamat! Tebakan kamu benar!");
					nyawaPlayer = nyawaPlayer +2;
					menang++;
				}
				else {
					System.out.println("Maaf. Tebakan kamu salah!");
					nyawaPlayer--; nyawaCom+=2;
				}

			}
			System.out.println("================================");
			ronde++;

		}

		selisih = nyawaCom-nyawaPlayer;
		System.out.println(nyawaCom);
		System.out.println(nyawaPlayer);
		System.out.println(selisih);
		
		if (selisih >= 6 || nyawaCom >=16) {
			System.out.println("KOMPUTER MENANG!");
		}
		else if (selisih <= -6 || nyawaCom >=16 ) {
			System.out.println("PLAYER MENANG!");
		}

		if (menang <= 8) {
			System.out.println("Kamu CHEATER!");
		}
		else if (menang > 8 && menang <= 11) {
			System.out.println("Kamu NICE!");
		}
		if (menang > 11) {
				System.out.println("Kamu NOOB");
		}


	}
}


/*
1. Micheal sedang memainkan sebuah permainan classik tebak huruf. Dimana Pemain dinyatakan menang jika salah satu pemain memiliki nyawa mencapai 16.
 - nyawa awal yang tersedia : - Player 1 nyawa
			      - Komputer 1 nyawa 
 - ada 2 kesempatan bermain dalam 1 ronde
 - max 20 ronde, dan pemain dinyatakan menang.
 - jika tebakan player sama dengan tebakan komputer, maka player mendapatkan 2 nyawa
 - jika tebakan player salah, maka nyawa player berkurang 1 dan komputer bertambah 2 nyawa
 
 - jika pemain palyer menang pada ronde <= 8 --> "CHEATER"
   jika pemain palyer menang pada ronde > 8 && <= 11  --> "NICE"
   jika pemain palyer menang pada ronde > 11 --> "NOOB"
 
 - jika selisih nyawa player dengan nyawa komputer = 6, maka permainan dimenangkan oleh pemain yang memiliki nyawa lebih unggul

 */