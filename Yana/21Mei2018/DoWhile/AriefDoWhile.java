/*
Creted by	: Yana
Time		: 19 Mei 2018 17.21
*/

import java.util.Scanner;
import java.util.Random;

public class AriefDoWhile{
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();

		int game=0, round, options, yourChoise, enemyChoice, pointRound, pointAllRound=0, 
			pointGame=0, pointAllGame=0;


		do{
			game++;
			System.out.println("Game "+game);

			round = 0;
			pointRound = 0;
			while(round < 5){
				round++;
				System.out.println("Round "+round);
				System.out.println();
				System.out.println("Options: [1] Rock, [2] Paper, [3] Scissors, [4] Spock, [5] Lizard");
				System.out.print("You\t: ");
				yourChoise = keyboard.nextInt();
				enemyChoice = random.nextInt(5)+1; 
				System.out.println("Enemy\t: " +enemyChoice);

				if (yourChoise == enemyChoice) {
					pointRound = pointRound;
					System.out.println("Status\t: draw\n\n");
				}
				else if (yourChoise == 1 && (enemyChoice == 5 || enemyChoice==3)) {
					pointRound = pointRound + 1;
					System.out.println("Status\t: win\n\n");
				}
				else if (yourChoise == 2 && (enemyChoice == 1 || enemyChoice == 4)) {
					pointRound = pointRound + 1;
					System.out.println("Status\t: win\n\n");
				}
				else if (yourChoise == 3 && (enemyChoice == 2 || enemyChoice == 5)) {
					pointRound = pointRound + 1;
					System.out.println("Status\t: win\n\n");
				}
				else if (yourChoise == 4 && (enemyChoice == 1 || enemyChoice == 5)) {
					pointRound = pointRound + 1;
					System.out.println("Status\t: win\n\n");
				}
				else if (yourChoise == 5 && (enemyChoice == 2 || enemyChoice == 4)) {
					pointRound = pointRound + 1;
					System.out.println("Status\t: win\n\n");
				}
				else{
					pointRound = pointRound;
					System.out.println("Status\t: lose\n\n");
				}
			}

			if (pointRound >= 4) {
				System.out.println("Game " +game+ " you WIN\n");
				pointGame = pointGame + 1;
			}else{
				System.out.println("Game " +game+ " you LOSE\n");
				pointGame = pointGame;
			}

			pointAllRound = pointAllRound + pointRound;

		}while(game < 3);

		System.out.println("Win All Rounds : "+pointAllRound);
		pointAllGame = pointAllGame + pointGame;
		System.out.println("Win All Games : "+pointAllGame);

		if (pointAllGame == 1) {
			System.out.println("\nYou are Knight");
		}
		else if (pointAllGame == 2) {
			System.out.println("\nYou are Palladins");
		}
		else if (pointAllGame == 1) {
			System.out.println("\nYou are GODSPEED");
		}
		else if (pointAllRound <= 8) {
			System.out.println("\nYou are Enthusiast");
		}
		else if (pointAllRound <= 10) {
			System.out.println("\nYou are Participants");
		}
		else if (pointAllGame < 1) {
			System.out.println("\nYou are Want-to-know-only");
		}

	}
}
/*
		Rock, Paper, Scissors, Lizards, Spock.

This is just another version of Rock Paper Scissors Game, the diffrence is that there are 
another 2 symbol to play with, its called "Lizard", and "Spock".
There are TWO ways to USE a symbol as a weapon, and there are TWO ways to be DEFEATED 
by other symbols. You can read the rules below. Two player is enough (Player & Enemy).
Game, play for 3 games, each game has 5 rounds, player could win 1 Game if player win 
at least (>=) 4 round.

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