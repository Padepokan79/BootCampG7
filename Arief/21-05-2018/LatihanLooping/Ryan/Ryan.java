/*
Date Created	: 20 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;
import java.util.Random;

public class Ryan {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		Random rand = new Random();

		int jlhPlayer, com, playerRandom, round, maxRound, comScore, playerScore, nol, satu, ten;
		String player;

		maxRound = jlhPlayer = 5;
		nol = playerScore = comScore = 0;
		satu = 1;
		ten = 10;

		System.out.println("=========================================");
		System.out.println("Adu Penalty V1");
		System.out.println("=========================================");
		System.out.println("Penendang Pertama \t\t: Player");
		System.out.println("Penendang Kedua \t\t: Komputer");
		System.out.println("=========================================");
		System.out.println("Lets Start");
		System.out.println("*****************************************");

		round = satu;
		while (round <= maxRound) {
			System.out.println("Round ke " + round);
			System.out.println("Jika siap menendang, masukan (ok)");
			player = inputKey.next();

			if (player.equals("ok")) {
				playerRandom = rand.nextInt(ten);

				com = rand.nextInt(ten);

				if (playerRandom == com) {
					System.out.println("Tertangkap");
					comScore+=satu;
				}else if (playerRandom > com) {
					System.out.println("Masuk ke gawang lawan");
					playerScore+=satu;
				}else {
					System.out.println("Tertangkap Juga");
					comScore+=satu;
				}
			}else {
				System.out.println("Anda tidak menekan ok, default power = 0");
				playerRandom = nol;
			}

			System.out.println("Round ke " + round);
			System.out.println("Jika anda siap menangkap, masukan (ok)");
			player = inputKey.next();

			if (player.equals("ok")) {
				playerRandom = rand.nextInt(ten);

				com = rand.nextInt(ten);

				if (playerRandom == com) {
					System.out.println("Bola dapat ditangkap");
					playerScore+=satu;
				}else if (playerRandom > com) {
					System.out.println("Bola dapat ditangkap juga");
					playerScore+=satu;
				}else {
					System.out.println("Bola Lolos");
					comScore+=satu;
				}
			}else {
				System.out.println("Anda tidak menekan ok, default power = 0");
				playerRandom = nol;
			}

			System.out.println("Skor : Player " + playerScore + " - Komputer " + comScore );

			round++;
		}
		
	}
}