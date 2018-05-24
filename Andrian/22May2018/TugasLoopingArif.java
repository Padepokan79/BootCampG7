/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
	

			Rock, Paper, Scissors, Lizards, Spock.

This is just another version of Rock Paper Scissors Game, the diffrence is that there are another 2 symbol to play with, its called "Lizard", and "Spock".
There are TWO ways to USE a symbol as a weapon, and there are TWO ways to be DEFEATED by other symbols. You can read the rules below. Two player is enough (Player & Enemy).
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
	
	import java.util.Scanner;
	import java.util.Random;


	public class TugasLoopingArif {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			Random rand = new Random();
			int game=1, gameMax=3, roundMax=5, roundEnemy, playerWinTemp=0,
				gameEnemy, enemyTurn, playerWin=0, playerWinTotal=0, 
				playerWinGame=0, playerWinRound=0, playerWinGameTemp=0;
			String rock="rock",
					paper="paper",
					scissor="scissor",
					lizard="lizard",
					spock="spock",
					enemyPlay="", playerTurn;


				System.out.println("====================================================");
				System.out.println("                WELCOME TO THE GAME                 ");
				System.out.println("====================================================");

			while (game<=gameMax) {
				System.out.println("====================================================");
				System.out.println("                      Game "+game);
				System.out.println("====================================================");

				
				int round=1;

				while (round<=roundMax) {
					System.out.println("====================================================");
					System.out.println("                      Round "+round);
					System.out.println("====================================================");
					enemyTurn = rand.nextInt(5)+1;
					System.out.println(enemyTurn); //cheat
		
					if (enemyTurn==1) {
						enemyPlay=rock;
					}
					else if (enemyTurn==2) {
						enemyPlay=paper;
					}
					else if (enemyTurn==3) {
						enemyPlay=scissor;
					}
					else if (enemyTurn==4) {
						enemyPlay=spock;
					}
					else if (enemyTurn==5) {
						enemyPlay=lizard;
					}

					System.out.println("So enemy has been pick the symbol");
					System.out.println("====================================================");
					System.out.print("and your guess :");
					playerTurn = key.nextLine();

					if (playerTurn.equals(enemyPlay)) {
						System.out.println("Oops its'a tie");
					}
					else if (playerTurn.equals(rock)){
						if (enemyPlay.equals(scissor)) {
							System.out.println("Rock crush Scissors, you win");
							playerWinTemp++;
							playerWinGameTemp++;
						}
						else if (enemyPlay.equals(lizard)) {
							System.out.println("Rock crush Lizard, you win");
							playerWinTemp++;
							playerWinGameTemp++;
						}
						else {
							System.out.println("ypu lose!!");
						}
					}
					else if (playerTurn.equals(paper)){
						if (enemyPlay.equals(rock)) {
							System.out.println("Paper covers Rock, you win");
							playerWinTemp++;
							playerWinGameTemp++;
						}
						else if (enemyPlay.equals(spock)) {
							System.out.println("Paper disproves Spock, you win");
							playerWinTemp++;
							playerWinGameTemp++;
						}
						else {
							System.out.println("ypu lose!!");
						}
					}
					else if (playerTurn.equals(scissor)){
						if (enemyPlay.equals(paper)) {
							System.out.println("Scissors cut paper, you win");
							playerWinTemp++;
							playerWinGameTemp++;
						}
						else if (enemyPlay.equals(lizard)) {
							System.out.println("Scissor decapitate Lizard, you win");
							playerWinTemp++;
							playerWinGameTemp++;
						}
						else {
							System.out.println("ypu lose!!");
						}
					}
					else if (playerTurn.equals(spock)){
						if (enemyPlay.equals(rock)) {
							System.out.println("Spock vaporizes Rock, you win");
							playerWinTemp++;
							playerWinGameTemp++;
						}
						else if (enemyPlay.equals(scissor)) {
							System.out.println("Spock smashes Scissors, you win");
							playerWinTemp++;
							playerWinGameTemp++;
						}
						else {
							System.out.println("ypu lose!!");
						}
					}
					else if (playerTurn.equals(lizard)){
						if (enemyPlay.equals(spock)) {
							System.out.println("Lizard poisons Spock, you win");
							playerWinTemp++;
							playerWinGameTemp++;
						}
						else if (enemyPlay.equals(paper)) {
							System.out.println("Lizard eats Paper, you win");
							playerWinTemp++;
							playerWinGameTemp++;
						}
						else {
							System.out.println("ypu lose!!");
						}
					}
					else {
						System.out.println("Invalid input");
					}
					System.out.println();
					System.out.println("Your score is "+playerWinTemp);
					//playerWin+=playerWinTemp;
					System.out.println("Your total win score "+playerWin);
					System.out.println();


					round++;
				}

				System.out.println("Game "+game+" You've got "+playerWinGameTemp);
				playerWin = playerWin + playerWinTemp;
				System.out.println("Player total score "+playerWin);
				System.out.println();


					if (playerWinTemp>2) {
						playerWinGame+=1;
					}

				playerWinTemp=0;
				playerWinGame += playerWinTemp;
				System.out.println("in this round you won "+playerWinGame+" from computer");


				
				game++;
			}
			System.out.println();
			System.out.println("from all round you won "+playerWinGame+" from computer");

			System.out.println("Your total win score "+playerWin);

			if (playerWinGame>=3) {
				System.out.println("Achievement you,ve got GODSPEED");
			}
			else if (playerWinGame>1 && playerWinGame<3) {
				System.out.println("Achievement you,ve got Palladins");
			}
			else if (playerWinGame<2) {
				System.out.println("Achievement you,ve got Knight");
			}
			else if (playerWinGame==0) {
				System.out.println("Achievement you,ve got Want-to-know-only");
			}

			if (playerWin>7) {
				System.out.println("Achievement you,ve got Participants");
			}
			else if (playerWin>9) {
				System.out.println("Achievement you,ve got Enthusiast");
			}
			else if (playerWin==0) {
				System.out.println("Achievement you,ve got Want-to-know-only");
			}

		}
	}