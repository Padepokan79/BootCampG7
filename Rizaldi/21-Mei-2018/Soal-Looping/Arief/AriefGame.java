/*
 * File           : AriefGame.java
 * Project Name   : Arief
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\21-Mei-2018\Soal-Looping\Arief
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Tuesday, 29th May 2018 6:28:31 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Tuesday, 29th May 2018 6:28:49 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;
import java.util.Random;

public class AriefGame {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		Random rand = new Random();

		int rock, paper, scissors, lizard, spock, round, winRound, winGame, player, enemy,
			play, hot, warm, cold, maxRound, random, index, zero, game, maxGame, totalRound;

		winGame=0;
        winRound=0;
        totalRound=0;
        zero=0;
		game=1;
        round=1;
        hot=1;
        play=1;
        rock=1;
		warm=2;
        paper=2;
		maxGame=3;
        cold=3;
        scissors=3;
		lizard=4;
		maxRound=5;
        random=5;
        spock=5;
		
		do{
			System.out.println();
			System.out.println("Game " + game);
			System.out.println("====================================================");
			winRound = 0;
			do{
				System.out.println();
				System.out.println("Ronde " + round);
				System.out.println("====================================================");
				System.out.println("Pilihan Komputer");
				System.out.println("");
				enemy = rand.nextInt(random) + hot;
				System.out.println("====================================================");

				index = zero;
					System.out.println("Plihan Kamu : ");
					System.out.println("Yang Tersedia : (1. Rock, 2. Paper, 3. Scissors, 4. Lizards, 5. Spock)");
					System.out.print("Masukkan angka : (1/2/3/4/5): ");
					player = inputKey.nextInt();

					System.out.println("====================================================");
					System.out.println("Hasil Komputer\t: " + enemy);
					System.out.println("Hasil Anda\t: " + player);
					System.out.println();

					if (player == enemy) {
						System.out.println("Hasil Sama");
						System.out.println("====================================================");
					} else {
						if (player == 1 && enemy == 5) {
							System.out.println("Rock crush Lizard");
							System.out.println("Player Menang");
							winRound+=1;
						}else if (player == 1 && enemy == 3) {
							System.out.println("Rock crush Scissors");
							System.out.println("Player Menang");
							winRound+=1;
						}else if (player == 2 && enemy == 1) {
							System.out.println("Paper covers Rock");
							System.out.println("Player Menang");
							winRound+=1;
						}else if (player == 2 && enemy == 4) {
							System.out.println("Paper disproves Spock");
							System.out.println("Player Menang");
							winRound+=1;
						}else if (player == 3 && enemy == 2) {
							System.out.println("Scissors cut Paper");
							System.out.println("Player Menang");
							winRound+=1;
						}else if (player == 3 && enemy == 5) {
							System.out.println("Scissors decapitate Lizard");
							System.out.println("Player Menang");
							winRound+=1;
						}else if (player == 4 && enemy == 1) {
							System.out.println("Spock vaporizes Rock");
							System.out.println("Player Menang");
							winRound+=1;
						}else if (player == 4 && enemy == 3) {
							System.out.println("Spock smashes Scissors");
							System.out.println("Player Menang");
							winRound+=1;
						}else if (player == 5 && enemy == 4) {
							System.out.println("Lizard poisons Spock");
							System.out.println("Player Menang");
							winRound+=1;
						}else if (player == 5 && enemy == 2) {
							System.out.println("Lizard eats Paper");
							System.out.println("Player Menang");
							winRound+=1;
						}

						else if (player == 1 && enemy == 2) {
							System.out.println("Paper covers Rock");
							System.out.println("Komputer Menang");
						}else if (player == 4 && enemy == 2) {
							System.out.println("Paper disproves Spock");
							System.out.println("Komputer Menang");
						}else if (player == 2 && enemy == 3) {
							System.out.println("Scissors cut Paper");
							System.out.println("Komputer Menang");
						}else if (player == 5 && enemy == 3) {
							System.out.println("Scissors decapitate Lizard");
							System.out.println("Komputer Menang");
						}else if (player == 1 && enemy == 4) {
							System.out.println("Spock vaporizes Rock");
							System.out.println("Komputer Menang");
						}else if (player == 3 && enemy == 4) {
							System.out.println("Spock smashes Scissors");
							System.out.println("Komputer Menang");
						}else if (player == 5 && enemy == 1) {
							System.out.println("Rock crush Lizard");
							System.out.println("Komputer Menang");
						}else if (player == 3 && enemy == 1) {
							System.out.println("Rock crush Scissors");
							System.out.println("Komputer Menang");
						}else if (player == 4 && enemy == 5) {
							System.out.println("Lizard poisons Spock");
							System.out.println("Komputer Menang");
						}else if (player == 2 && enemy == 5) {
							System.out.println("Lizard eats Paper");
							System.out.println("Komputer Menang");
						}else {
							System.out.println("Cek Else");
						}
					}
					round++;
			} while (round <= maxRound);
			if (winRound >= 4) {
				winGame+=1;
			}
			totalRound += winRound;
			round = 1;
			game++;
		} while (game <= maxGame);

		System.out.println("Kamu menang " + winGame + " Permainan dalam " + totalRound + " ronde,");

		System.out.println();
		System.out.println("====================================================");
		if (winGame == 3) {
			System.out.println("Kamu GODSPEED.");
		}else if (winGame == 2) {
			System.out.println("Kamu Palladins.");
		}else if (winGame == 1) {
			System.out.println("Kamu Knight.");
		}
		if (totalRound >= 10 && winGame != 3) {
			System.out.print(" dan seorang Enthusiast.");
		}else if (totalRound >= 8 && winGame != 3) {
			System.out.print(" dan seorang Participants.");
		}else if (winGame == 0 && totalRound == 0) {
			System.out.print(" and Want-to-know-only.");
		}
		
	}
}