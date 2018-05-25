/*
Date Created	: 20 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;
import java.util.Random;

public class Chaudry {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		Random rand = new Random();

		int hpPlayer, hpCom, round, maxRound, chance, figure, guess,
			nol, satu, dua, tiga, enam, enamBelas, duaEnam, delapan, sebelas;
		char huruf, charPlayer, charCom;

		hpPlayer = hpCom = chance = round = satu = 1;
		nol = 0;
		dua = 2;
		tiga = 3;
		maxRound = 20;
		enam = dua * tiga;
		enamBelas = (maxRound / dua) + enam;
		delapan = enamBelas / dua;
		sebelas = (maxRound / dua) + satu;
		duaEnam = maxRound + enam;

		do{
			System.out.println();
			System.out.println("Round " + round);
			System.out.println("==========================");
			System.out.println("Komputer memikirkan sebuah huruf dari A sampai Z.");
			charCom = (char) (rand.nextInt(duaEnam) + 'A');
			// System.out.println(charCom);
			System.out.println("Kamu punya dua kesempatan untuk menebak.");

			chance = satu;

			while (chance <= dua) {
				System.out.println("Masukan Tebakan");
				charPlayer = inputKey.next().charAt(nol);

				if (charPlayer == charCom) {
					System.out.println("Tebakanmu Tepat");
					System.out.println("==========================");
					hpPlayer+=dua;
					chance+=dua;
				}else {
					hpPlayer-=satu;
					hpCom+=dua;
					if (chance > satu) {
						System.out.println("Huruf yang tepat adalah " + charCom);
						System.out.println("Kamu kalah di Kesempatan ini");
						System.out.println("==========================");
					}else {
						System.out.println("Tebakanmu Salah");
						System.out.println("==========================");
						System.out.println("Kesempatan Terakhir !!");
					}
				}	
				chance++;
			}
			System.out.println("Nyawa Pemain:\t " + hpPlayer);
			System.out.println("Nyawa Komputer:\t " + hpCom);

			if ((hpPlayer - hpCom) >= enam || (hpCom - hpPlayer) >= enam) {
				if ((hpPlayer - hpCom) >= enam) {
					System.out.print("Player Menang, ");
					if (round<=delapan) {
						System.out.println("Anda Cheater");
					}else if (round>delapan) {
						System.out.println("Anda Nice");
					}else if (round>sebelas) {
						System.out.println("Anda Noob");
					}
				}else {
					System.out.println("Komputer Menang");
				}
				round+=maxRound;
			}else if (hpPlayer >= enamBelas || hpCom >= enamBelas) {
				if (hpPlayer >= enamBelas) {
					System.out.print("Player Menang, ");
					if (round<=delapan && hpPlayer >= enamBelas) {
						System.out.println("Anda Cheater");
					}else if (round>delapan && round<=sebelas && hpPlayer >= enamBelas) {
						System.out.println("Anda Nice");
					}else if (round>sebelas && hpPlayer >= enamBelas) {
						System.out.println("Anda Noob");
					}
				}else {
					System.out.println("Komputer Menang");
				}
				round+=maxRound;
			}

			round++;
		} while (round <= maxRound);


		
	}
}