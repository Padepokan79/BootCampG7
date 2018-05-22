/*
Date Created	: 18 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;
import java.util.Random;

public class RPSLS {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		Random rand = new Random();

		int rock, paper, scissors, lizard, spock, round, winRound, winGame, player, enemy, playerScore, enemyScore,
			play, hot, warm, cold, maxRound, random, index, nol, game, maxGame, totalRound;

		winGame = winRound = totalRound = nol = 0;
		game = round = hot = play = rock = 1;
		warm = paper = 2;
		maxGame = cold = scissors = 3;
		lizard = 4;
		maxRound = random = spock = 5;
		
		do{
			System.out.println();
			System.out.println("Game " + game);
			System.out.println("==========================");
			winRound = 0;
			do{
				System.out.println();
				System.out.println("Round " + round);
				System.out.println("==========================");
				System.out.println("Computer's Pick.");
				System.out.println("Computer's done");
				enemy = rand.nextInt(random) + hot;
				System.out.println("==========================");

				index = nol;
					System.out.println("Your's Pick.");
					System.out.println("In case (1. Rock, 2. Paper, 3. Scissors, 4. Lizards, 5. Spock)");
					System.out.print("Enter a Symbol (1/2/3/4/5): ");
					player = inputKey.nextInt();

					System.out.println("==========================");
					System.out.println("Computer's Symbol\t: " + enemy);
					System.out.println("Your's Symbol\t: " + player);
					System.out.println();

					if (player == enemy) {
						System.out.println("Its A Tie");
						System.out.println("==========================");
					} else {
						if (player == 1 && enemy == 5) {
							System.out.println("Rock crush Lizard");
							System.out.println("Player Wins");
							winRound+=1;
						}else if (player == 1 && enemy == 3) {
							System.out.println("Rock crush Scissors");
							System.out.println("Player Wins");
							winRound+=1;
						}else if (player == 2 && enemy == 1) {
							System.out.println("Paper covers Rock");
							System.out.println("Player Wins");
							winRound+=1;
						}else if (player == 2 && enemy == 4) {
							System.out.println("Paper disproves Spock");
							System.out.println("Player Wins");
							winRound+=1;
						}else if (player == 3 && enemy == 2) {
							System.out.println("Scissors cut Paper");
							System.out.println("Player Wins");
							winRound+=1;
						}else if (player == 3 && enemy == 5) {
							System.out.println("Scissors decapitate Lizard");
							System.out.println("Player Wins");
							winRound+=1;
						}else if (player == 4 && enemy == 1) {
							System.out.println("Spock vaporizes Rock");
							System.out.println("Player Wins");
							winRound+=1;
						}else if (player == 4 && enemy == 3) {
							System.out.println("Spock smashes Scissors");
							System.out.println("Player Wins");
							winRound+=1;
						}else if (player == 5 && enemy == 4) {
							System.out.println("Lizard poisons Spock");
							System.out.println("Player Wins");
							winRound+=1;
						}else if (player == 5 && enemy == 2) {
							System.out.println("Lizard eats Paper");
							System.out.println("Player Wins");
							winRound+=1;
						}

						else if (player == 1 && enemy == 2) {
							System.out.println("Paper covers Rock");
							System.out.println("Computer Wins");
						}else if (player == 4 && enemy == 2) {
							System.out.println("Paper disproves Spock");
							System.out.println("Computer Wins");
						}else if (player == 2 && enemy == 3) {
							System.out.println("Scissors cut Paper");
							System.out.println("Computer Wins");
						}else if (player == 5 && enemy == 3) {
							System.out.println("Scissors decapitate Lizard");
							System.out.println("Computer Wins");
						}else if (player == 1 && enemy == 4) {
							System.out.println("Spock vaporizes Rock");
							System.out.println("Computer Wins");
						}else if (player == 3 && enemy == 4) {
							System.out.println("Spock smashes Scissors");
							System.out.println("Computer Wins");
						}else if (player == 5 && enemy == 1) {
							System.out.println("Rock crush Lizard");
							System.out.println("Computer Wins");
						}else if (player == 3 && enemy == 1) {
							System.out.println("Rock crush Scissors");
							System.out.println("Computer Wins");
						}else if (player == 4 && enemy == 5) {
							System.out.println("Lizard poisons Spock");
							System.out.println("Computer Wins");
						}else if (player == 2 && enemy == 5) {
							System.out.println("Lizard eats Paper");
							System.out.println("Computer Wins");
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

		System.out.println("You have won " + winGame + " games with " + totalRound + " rounds,");

		System.out.println();
		System.out.println("==========================");
		if (winGame == 3) {
			System.out.println("You are GODSPEED.");
		}else if (winGame == 2) {
			System.out.println("You are Palladins.");
		}else if (winGame == 1) {
			System.out.println("You are Knight.");
		}
		if (totalRound >= 10 && winGame != 3) {
			System.out.print(" and are Enthusiast.");
		}else if (totalRound >= 8 && winGame != 3) {
			System.out.print(" and are Participants.");
		}else if (winGame == 0 && totalRound == 0) {
			System.out.print(" and are Want-to-know-only.");
		}
		
	}
}