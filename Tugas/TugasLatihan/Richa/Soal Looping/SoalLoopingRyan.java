/* 
Created by  		: Richa Fitria
Date/hour			: 20 Mei 2018/ 04.29 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class SoalLoopingRyan {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random ();

		int skorPlayer=0, skorComp = 0, round, playerTendang=0, compTangkap=0, playerTangkap=0, compTendang=0;
		String tendang, tangkap;

		System.out.println("========= Adu Penalti v1 ========");	
		System.out.println("Penendang pertama   : player");
		System.out.println("Penendang kedua     : komputer");
		System.out.println("==================================");	
		System.out.println("Let's start");	
		System.out.println();

		for (round = 1; round <=5; round++) {
			System.out.println("Round " + round);
			System.out.println("Jika siap menendang, masukan (ok)");
			tendang = keyboard.next();
			if (tendang.equals ("ok")) {
				playerTendang = rand.nextInt (10);
				compTangkap = rand.nextInt (10);
			}
			System.out.println(playerTendang);
			System.out.println(compTangkap);
			if (playerTendang < compTangkap) {
				System.out.println("Sayang sekali tendangan anda lemah");
			}
			else if (playerTendang >= compTangkap) {
				System.out.println("Anda berhasil memasukkan bola ke gawang!");
			}

			System.out.println("-------------------------------------");
			System.out.println("Jika siap menangkap, masukan (ok)");
			tangkap = keyboard.next();

			if (tangkap.equals ("ok")) {
				playerTangkap = rand.nextInt (10);
				compTendang = rand.nextInt (10);
			}

			if (playerTangkap <= compTendang) {
				System.out.println("Sayang sekali Feeling anda terhadap bola jelek!!");
			}
			else if (playerTangkap > compTendang) {
				System.out.println("Anda berhasil menangkap bola!");
			}

			if (playerTendang< compTangkap && playerTangkap <=compTendang) {
				skorComp++;
			}
			else if (playerTendang <= compTangkap && playerTangkap > compTendang){
				skorPlayer++;
				skorComp++;
			}
			else if (playerTendang >= compTangkap && playerTangkap > compTendang){
				skorPlayer++;
			}
			else if (playerTendang > compTangkap && playerTangkap <= compTendang){
				skorPlayer++;
				skorComp++;
			}


			System.out.println("Skor: Player " + skorPlayer + " - komputer " + skorComp);
			System.out.println("=====================================");
		}
	}
}





		




/*
coba buat game adu penalti dengan 5 penendang vs komputer.
untuk menentukan bola masuk atau tidak, menggunakan teknik random dimana yang mendapat random lebih tinggi itu yang berhasil memasukan/menangkap bola.
tapi random untuk player, diperintah dengan masukan tendang/tangkap
jika player memasukan perintah yang tidak sama dengan instruksi, random kekuatan player = 0

*/