/*
Creted by	: Yana
Time		: 19 Mei 2018 17.34
*/

import java.util.Scanner;
import java.util.Random;

public class Rijaldi{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();

		int uangPlayer1, uangPlayer2, poinLotre, pilihanPlayer1, pilihanPlayer2, 
			poinPlayer1, poinPlayer2, totalPoinPlayer1, totalPoinPlayer2;

		uangPlayer1			= 1000;
		uangPlayer2			= 1000;
		poinLotre 			= 0;
		poinPlayer1			= 0;
		poinPlayer2			= 0;
		totalPoinPlayer1	= 0;
		totalPoinPlayer2	= 0;

		while(uangPlayer1 > 0 || uangPlayer2 > 0){
			if (uangPlayer1 > 0) {			
				System.out.println("PLAYER 1");
				System.out.println("Uang Anda : "+uangPlayer1);
				System.out.print("Pilih harga lotre (100, 200, 300, 500): ");
				pilihanPlayer1 = keyboard.nextInt();

				if (pilihanPlayer1 == 100) {
					poinLotre = random.nextInt(10);
					poinPlayer1 = poinPlayer1 + poinLotre;
					uangPlayer1 = uangPlayer1 - pilihanPlayer1;
					totalPoinPlayer1 = totalPoinPlayer1 + poinLotre;
					System.out.println("Poin Lotre : "+poinLotre);
					System.out.println("Total Poin : "+totalPoinPlayer1);
				}
				else if (pilihanPlayer1 == 200) {
					poinLotre = random.nextInt(20);
					poinPlayer1 = poinPlayer1 + poinLotre;
					uangPlayer1 = uangPlayer1 - pilihanPlayer1;
					totalPoinPlayer1 = totalPoinPlayer1 + poinLotre;
					System.out.println("Poin Lotre : "+poinLotre);
					System.out.println("Total Poin : "+totalPoinPlayer1);
				}
				else if (pilihanPlayer1 == 300) {
					poinLotre = random.nextInt(50);
					poinPlayer1 = poinPlayer1 + poinLotre;
					uangPlayer1 = uangPlayer1 - pilihanPlayer1;
					totalPoinPlayer1 = totalPoinPlayer1 + poinLotre;
					System.out.println("Poin Lotre : "+poinLotre);
					System.out.println("Total Poin : "+totalPoinPlayer1);
				}
				else if (pilihanPlayer1 == 500) {
					poinLotre = random.nextInt(100);
					poinPlayer1 = poinPlayer1 + poinLotre;
					uangPlayer1 = uangPlayer1 - pilihanPlayer1;
					totalPoinPlayer1 = totalPoinPlayer1 + poinLotre;
					System.out.println("Poin Lotre : "+poinLotre);
					System.out.println("Total Poin : "+totalPoinPlayer1);
				}
			System.out.println();
			}
			if (uangPlayer2 > 0) {
				System.out.println("PLAYER 2");
				System.out.println("Uang Anda : "+uangPlayer2);
				System.out.print("Pilih harga lotre (100, 200, 300, 500): ");
				pilihanPlayer2 = keyboard.nextInt();

				if (pilihanPlayer2 == 100) {
					poinLotre = random.nextInt(10);
					poinPlayer2 = poinPlayer2 + poinLotre;
					uangPlayer2 = uangPlayer2 - pilihanPlayer2;
					totalPoinPlayer2 = totalPoinPlayer2 + poinLotre;
					System.out.println("Poin Lotre : "+poinLotre);
					System.out.println("Total Poin : "+totalPoinPlayer2);
				}
				else if (pilihanPlayer2 == 200) {
					poinLotre = random.nextInt(20);
					poinPlayer2 = poinPlayer2 + poinLotre;
					uangPlayer2 = uangPlayer2 - pilihanPlayer2;
					totalPoinPlayer2 = totalPoinPlayer2 + poinLotre;
					System.out.println("Poin Lotre : "+poinLotre);
					System.out.println("Total Poin : "+totalPoinPlayer2);
				}
				else if (pilihanPlayer2 == 300) {
					poinLotre = random.nextInt(50);
					poinPlayer2 = poinPlayer2 + poinLotre;
					uangPlayer2 = uangPlayer2 - pilihanPlayer2;
					totalPoinPlayer2 = totalPoinPlayer2 + poinLotre;
					System.out.println("Poin Lotre : "+poinLotre);
					System.out.println("Total Poin : "+totalPoinPlayer2);
				}
				else if (pilihanPlayer2 == 500) {
					poinLotre = random.nextInt(100);
					poinPlayer2 = poinPlayer2 + poinLotre;
					uangPlayer2 = uangPlayer2 - pilihanPlayer2;
					totalPoinPlayer2 = totalPoinPlayer2 + poinLotre;
					System.out.println("Poin Lotre : "+poinLotre);
					System.out.println("Total Poin : "+totalPoinPlayer2);
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Poin Akhir Player 1: "+totalPoinPlayer1);
		System.out.println("Poin Akhir Player 2: "+totalPoinPlayer2);

		if (totalPoinPlayer1 > totalPoinPlayer2) {
			System.out.println("PLAYER 1 MENANG");
		}
		else if (totalPoinPlayer2 > totalPoinPlayer1) {
			System.out.println("PLAYER 2 MENANG");
		}
		else if (totalPoinPlayer1 == totalPoinPlayer2) {
			System.out.println("SERI");
		}
		System.out.println();
	}
}
/*
>lotre
- anda membeli lotre dengan kriteria
- harga 100 kesempatan mendapat point 0s/d10
- harga 200=0s/d20, 300=0s/d50, 500=0s/d100
- yang pertama kali mencapai point 1000 menang.
- yang uang nya habis, kalah dan point lotre nya tidak dapet.
- yang menjadi pemain 2 orang manusia.
- diberi modal awal 100.000.

*/