/* 
Created by  		: Richa Fitria
Date/hour			: 17 Mei 2018/ 01.31 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

	public class PigLikeDiceGame {
		public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		int totalPoin, poinComp, poinPlayer, maksPoin, round, compTurn, playerTurn, angkaPlayer, angkaComp, totalPoinCom, totalPoinPlayer,nol, maksDadu;
		String playerAgain;

		poinPlayer = 0;
		totalPoinCom = 0;
		totalPoinPlayer = 0;
		maksPoin = 100;
		nol= 0;
		maksDadu = 6;
		round=1;

			while (round >= 1 && (totalPoinCom <= maksPoin && totalPoinPlayer <= maksPoin)) { //total poin salah satu. Player atau Computer
				//loop computer's turns
				compTurn = 1;
				poinComp = 0;
				System.out.println("==========================================");
				System.out.println("round " + round + ":");
				System.out.println("Waktunya Computer untuk main!");
				while (compTurn <= 3 ) { 
					System.out.println ("Kocok dadu! ");
					angkaComp = (rand.nextInt (maksDadu) + 1);
					System.out.println("Dadu ke-" + compTurn + " Computer: " + angkaComp);
					poinComp = poinComp + angkaComp;
					compTurn++;
				}
				System.out.println();
				System.out.println("Total poin Computer saat round " + round + " adalah " + poinComp);
				totalPoinCom = totalPoinCom + poinComp; 
				System.out.println("TOTAL POIN COMPUTER: " + totalPoinCom);
				System.out.println("-------------------------------------------");
				//loop players turns
				if (totalPoinCom >= maksPoin) {
					System.out.println("SELAMAT KOMPUTER MENANG!");
				}
				playerTurn = 1;
				poinPlayer = 0;
	
				while (playerTurn >= 1 && totalPoinCom <= 100) {
					if (playerTurn ==1) {
						System.out.println("Waktunya Player untuk main!");
					}
					System.out.println ("Kocok dadu! ");
					angkaPlayer = (rand.nextInt (maksDadu) + 1);
					System.out.println("Dadu ke-" + playerTurn + " Player: " + angkaPlayer);
						if (angkaPlayer == 1) {
							poinPlayer = 0;
							System.out.println();
							System.out.println("Total poin Player saat round " + round + " adalah " + nol);
							playerTurn= playerTurn -100; // biar berhenti loopnya
						}
						else if (angkaPlayer != 1) {
							System.out.println("Mau poin lagi?(Ya/Tidak) ");
							playerAgain = keyboard.next();
							System.out.println();
							if (playerAgain.equals("Ya")){
								poinPlayer = poinPlayer + angkaPlayer;
								playerTurn++;
							}
							else if (playerAgain.equals ("Tidak")) {
								poinPlayer = poinPlayer + angkaPlayer;
								System.out.println("Total poin Player saat round " + round + " adalah " + poinPlayer);
								playerTurn= playerTurn - 100; //biar berhenti loopingnya
							}
						}
				
				}
				totalPoinPlayer = totalPoinPlayer + poinPlayer;
				System.out.println("TOTAL POIN PLAYER: " + totalPoinPlayer);
				if (totalPoinPlayer >= maksPoin) {
					System.out.println("-------------------------------------------");
					System.out.println("SELAMAT PLAYER MENANG!"); 
				}


				round++;
			}
}
}

/*Pig-like Dice Game
This is a dice game similar to the game Pig, but easier to implement. The player plays against the computer.

-Player and Computer start out with zero points.

-The winner is the first player to reach 100 points or more.

-In each round, the computer rolls first, followed by the player.

-The computer rolls three dice and the sum of spots is added to its 
score.

-At the start of the player's turn, a working sum is initialized to zero.

-The player then rolls a single die as many times as desired.

-If the die shows a 1 (on the first roll or any roll), then the player's turn is over and nothing is added to the player's score.

-For rolls other than 1, the roll is added to the working sum.

-If the player stops rolling before a 1 occurs, then the working sum is added to the player's score. */