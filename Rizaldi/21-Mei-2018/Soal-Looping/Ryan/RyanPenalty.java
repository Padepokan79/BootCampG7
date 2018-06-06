/*
 * File           : RyanPenalty.java
 * Project Name   : Ryan
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\21-Mei-2018\Soal-Looping\Ryan
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.comp
 * File Created   : Tuesday, 29th May 2018 6:46:00 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Tuesday, 29th May 2018 6:46:16 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */





import java.util.Scanner;
import java.util.Random;

public class RyanPenalty {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		Random rand = new Random();

		String player;
		int jlhPlayer, comp, playerRandom, round, maxRound, compPoint, playerPoint, zero, one, ten;

        jlhPlayer=5;
		maxRound=5;
        playerPoint=0;
        compPoint=0;
		zero=0;
		one=1;
		ten=10;

		System.out.println("=========================================");
		System.out.println("Adu Penalty V1");
		System.out.println("=========================================");
		System.out.println("Penendang Pertama   : Player");
		System.out.println("Penendang Kedua     : Komputer");
		System.out.println("=========================================");

		round = one;
		while (round <= maxRound) {
			System.out.println("Round ke " + round);
			System.out.println("Jika siap menendang, masukan (ya)");
			player = inputKey.next();

			if (player.equals("ya")) {
				playerRandom = rand.nextInt(ten);

				comp = rand.nextInt(ten);

				if (playerRandom == comp) {
					System.out.println("Tertangkap");
					compPoint+=one;
				}else if (playerRandom > comp) {
					System.out.println("Masuk ke gawang lawan");
					playerPoint+=one;
				}else {
					System.out.println("Tertangkap Juga");
					compPoint+=one;
				}
			}else {
				System.out.println("Anda tidak menekan ya, default power = 0");
				playerRandom = zero;
			}

			System.out.println("Round ke " + round);
			System.out.println("Jika anda siap menangkap, masukan (ya)");
			player = inputKey.next();

			if (player.equals("ya")) {
				playerRandom = rand.nextInt(ten);

				comp = rand.nextInt(ten);

				if (playerRandom == comp) {
					System.out.println("Bola dapat ditangkap");
					playerPoint+=one;
				}else if (playerRandom > comp) {
					System.out.println("Bola dapat ditangkap juga");
					playerPoint+=one;
				}else {
					System.out.println("Bola Lolos");
					compPoint+=one;
				}
			}else {
				System.out.println("Anda tidak menekan ya, default power = 0");
				playerRandom = zero;
			}

			System.out.println("Hasil : Pemain " + playerPoint + " - Komputer " + compPoint );

			round++;
		}
		
	}
}