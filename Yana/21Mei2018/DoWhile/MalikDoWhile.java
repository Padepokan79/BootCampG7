/*
Creted by	: Yana
Time		: 19 Mei 2018 17.28
*/

import java.util.Scanner;
import java.util.Random;

public class MalikDoWhile{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();

		int inputPensil, randomPensil, tebakPensil, kesempatan, poin;
		String pilihan;

		System.out.print("Masukkan Jumlah Pensil Anda : ");
		inputPensil = keyboard.nextInt();

		kesempatan 	= 5;
		poin		= 0;
		do{
			kesempatan--;

			randomPensil = random.nextInt(inputPensil);
			// System.out.println("random"+randomPensil);
			System.out.print("Masukkan tebakan pensil: ");
			tebakPensil = keyboard.nextInt();

			if (tebakPensil == randomPensil) {
				kesempatan 	= kesempatan + 1;
				poin		= poin + 10;
			}
			if (kesempatan == 0 && poin >= 10) {
				System.out.println("Poin Anda : "+poin);
				System.out.print("Apakah ingin menukar 10 poin dengan 1 kesempatan? (Y/N) ");
				pilihan = keyboard.next();
				if (pilihan.equals("Y")) {
					kesempatan = kesempatan + 1;
					poin = poin - 10;
				}
			}
		}while(kesempatan > 0);

		if (poin < 1) {
			System.out.println("GAME OVER");
		}else{
			System.out.println("Poin Anda : "+poin);
		}
	}
}
/*
Rangga menginputkan jumlah pensilnya sendiri 
rangga akan menebak jumlah pensilnya sendiri yang diacak oleh komputer

- pertama bermain player memiliki 5 kesempatan yang diberikan
- bila tebakan player benar, maka player mendapatkan satu kesempatan dan menambahkan 10 poin untuk skor
- kesempatan berlaku bila ia salah menebak, maka kesempatan yang dimiliki berkurang
- bila player sudah tidak memiliki kesempatan, maka permainan berakhir atau GAME OVER
- terkecuali bila player memiliki poin min 10 dan kesempatan sudah habis maka program akan 
bertanya, apakah ingin menukar 10
  poin untuk 1 kesempatan.

  *note : bila ada yang bingung bisa ditanyakan langsung
*/