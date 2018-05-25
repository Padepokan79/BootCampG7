/*
Date Created	: 20 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;
import java.util.Random;

public class Vikri {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		Random rand = new Random();

		int scoreArema, scorePersib, random, tebakArema, tebakPersib, babak, totRandom, totTebak;

		babak = 1;

		do{
			System.out.println("====================================");
			System.out.print("Masukan gol Persib babak ke " + babak + " : ");
			tebakPersib = inputKey.nextInt();

			System.out.print("Masukan gol Arema babak ke " + babak + " : ");
			tebakArema = inputKey.nextInt();

			System.out.println("====================================");

			// totTebakArema = tebakArema1 + tebakArema2;
			// totTebakPersib = tebakPersib1 + tebakPersib2;

			scoreArema = rand.nextInt(10) + 1;
			scorePersib = rand.nextInt(10) + 1;

			scoreArema += scoreArema;
			scorePersib += scorePersib;
			
			totRandom = scorePersib + scoreArema;
			totTebak = tebakPersib + tebakArema;
			babak++;
		}while (babak <= 2);

		System.out.println("Skor Akhir nya adalah 1 : " + totRandom);
		System.out.println("Skor Tebakan Anda 3 : " + totTebak);

		if (totRandom != totTebak) {
			System.out.println("====================================");
			System.out.println("Maaf coba lagi minggu depan");
		}
		// System.out.println("====================================");

	}
}