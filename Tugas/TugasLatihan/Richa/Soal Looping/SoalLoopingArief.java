/* 
Created by  		: Richa Fitria
Date/hour			: 19 Mei 2018/ 05.39 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class SoalLoopingArief {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random ();


		int round, playerPick, enemyPick, games, gameWins = 0, roundWins = 0, totalRoundWins = 0;
		String playerSymbol = "coba" , enemySymbol = "coba";


		System.out.println("=======================================");
		System.out.println("Welcome to the game!\nRock, Paper, Scissors, Lizards, Spock.");
		System.out.println("=======================================");
		System.out.println();
		System.out.println("Attention!");
		System.out.println("Input 1 for Rock");
		System.out.println("Input 2 for Paper");
		System.out.println("Input 3 for Scissors");
		System.out.println("Input 4 for Spock");
		System.out.println("Input 5 for Lizard");
		System.out.println();

		for (games =1; games <= 3; games ++) {
			System.out.println("GAME " + games);
			System.out.println("--------------------------------");
			round = 1;
			roundWins = 0;
			do {
				System.out.println("Round " + round + "!");
				enemyPick = rand.nextInt (5) + 1;

				System.out.print ("Input your symbol: ");
				playerPick = keyboard.nextInt ();



				if (playerPick == 1) {
					playerSymbol = "Rock";
				}
				else if ( playerPick == 2) {
					playerSymbol = "Paper";
				}
				else if (playerPick == 3) {
					playerSymbol = "Scissors"; 
				}
				else if (playerPick == 4) {
					playerSymbol = "Spock";
				}
				else if (playerPick == 5) {
					playerSymbol = "Lizard";
				}

				if (enemyPick == 1) {
					enemySymbol = "Rock";
				}
				else if ( enemyPick == 2) {
					enemySymbol = "Paper";
				}
				else if (enemyPick == 3) {
					enemySymbol = "Scissors"; 
				}
				else if (enemyPick == 4) {
					enemySymbol = "Spock";
				}
				else if (enemyPick == 5) {
				enemySymbol = "Lizard";
				}


				System.out.println("Your enemy put " + enemySymbol + "!" );
				System.out.println(playerSymbol + " versus " + enemySymbol);
				System.out.println("---------------------------------------");

				if ((playerPick == 1 && enemyPick == 5) || (playerPick == 1 && enemyPick == 3) || 
					(playerPick == 2 && enemyPick == 1) || (playerPick == 2 && enemyPick == 4) || 
					(playerPick == 3 && enemyPick == 2) || (playerPick == 3 && enemyPick == 5) ||
					(playerPick == 4 && enemyPick == 3) || (playerPick == 4 && enemyPick == 1) || 
					(playerPick == 5 && enemyPick == 4) || (playerPick == 5 && enemyPick == 2)){
					System.out.println("Congrats! You'd defeated your enemy ^^");
					totalRoundWins++;
					roundWins++;
				}

				else if ((enemyPick == 1 && playerPick == 5) || (enemyPick == 1 && playerPick == 3) || 
					(enemyPick == 2 && playerPick == 1) || (enemyPick == 2 && playerPick == 4) || 
					(enemyPick == 3 && playerPick == 2) || (enemyPick == 3 && playerPick == 5) ||
					(enemyPick == 4 && playerPick == 3) || (enemyPick == 4 && playerPick == 1)|| 
					(enemyPick == 5 && playerPick == 4) || (enemyPick == 5 && playerPick == 2)){
					System.out.println("That's too bad. You're lose this round");
				}
				else {
					System.out.println("Oops. You pick same symbol!");
				}
				System.out.println("=========================================");
				round++;

			} while (round <= 5);

			if (roundWins == 4 || roundWins == 5) {
			gameWins = gameWins + 1;
			System.out.println("you win " + gameWins+ " games");
			System.out.println("=========================================");
			}

		}

		System.out.println("Total game wins " + (gameWins) + " , total round wins " + totalRoundWins);
		if (gameWins == 3) {
			System.out.println("Yeah! You're GODSPEED");
		}
		else if (gameWins == 2) {
			System.out.println("Yeah! You're Palladins");
		}
		else if (gameWins == 1) {
			System.out.println("Yeah! You're Knight");
		}

		if (totalRoundWins >= 10) {
			System.out.println("and You're Enthusiast");
		}

		else if (totalRoundWins >= 8) {
			System.out.println("and You're Participants");
		}

		else if (totalRoundWins == 0) {
			System.out.println("and You're Want-to-know-only");
		}
			
	}
}



/*
	Rock, Paper, Scissors, Lizards, Spock.

This is just another version of Rock Paper Scissors Game, the diffrence is that there are another 2 symbol to play with, 
its called "Lizard", and "Spock".
There are TWO ways to USE a symbol as a weapon, and there are TWO ways to be DEFEATED by other symbols. 
You can read the rules below. Two player is enough (Player & Enemy).
Game, play for 3 games, each game has 5 rounds, player could win 1 Game if player win at least (>=) 4 round.

					 	RULES
Symbol 1	> Symbol 1 ATTACK Symmbol 2

WIN CONDITION
Rock		> Rock crush Lizard, Rock crush Scissors
Paper		> Paper covers Rock, Paper disproves Spock
Scissors	> Scissors cut Paper, Scissors decapitate Lizard
Spock		> Spock vaporizes Rock, Spock smashes Scissors
Lizard		> Lizard poisons Spock, Lizard eats Paper
Other Notes
"GODSPEED" win 3 Game
"Palladins" win 2 Game
"Knight" win 1 games
"Enthusiast" win 10 rounds
"Participants" win 8 round
"Want-to-know-only" never win
*/