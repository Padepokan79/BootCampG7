/*
Date Created	: 22 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;
import java.util.Random;

public class Malik{
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		Random random = new Random();

		int pencil, randPencil, guess, chance, poin;
		String pilihan;

		System.out.print("Masukkan Jumlah pencil: ");
		pencil = keyboard.nextInt();

		chance = 5;
		poin = 0;
		do{
			chance--;

			randPencil = random.nextInt(pencil);
			System.out.print("Masukkan tebakan pencil: ");
			guess = keyboard.nextInt();

			if (guess == randPencil) {
				chance = chance + 1;
				poin = poin + 10;
			}
			if (chance == 0 && poin >= 10) {
				System.out.println("Poin Anda: " + poin);
				System.out.print("Apakah ingin menukar 10 poin dengan 1 chance? (Y/N) ");
				pilihan = keyboard.next();
				if (pilihan.equals("Y")) {
					chance = chance + 1;
					poin = poin - 10;
				}
			}
		}while(chance > 0);

		if (poin < 1) {
			System.out.println("GAME OVER");
		}else{
			System.out.println("Poin Anda: " + poin);
		}
	}
}