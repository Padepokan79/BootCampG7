/*
	 Program     : Tugas For While - Arief
     Creator     : Khairil
     Created At  : 19 Mei 2018 11:46 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;
import java.util.Random;

public class AriefForWhileApps {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random randomNum = new Random();
		String rock, paper, scissors, spock, lizard, computerMind, playerMind;
		int round, maxRound, playerScore, computerScore, totalComputerScore, totalPlayerScore, computerPlay, games, maxGames, mySymbols, playerPoint, computerPoint, choice;
		boolean rockCrushLizard, rockCrushScissors, paperCoversRock, paperDisprovesSpock, scissorsCutPaper, scissorsDecapitateLizard, spockVaporizeRock, spockSmashesScissors, lizardPoisonsSpock, lizardEatsPaper, win, lose;

		choice = 0;
		maxRound = 5;
		maxGames = 3;
		mySymbols = 0;
		computerScore = 0;
		playerScore = 0;
		totalComputerScore = 0;
		totalPlayerScore = 0;
		playerPoint = 0;
		computerPoint = 0;
		computerMind = "";
		playerMind = "";

		rock = "O";
		paper = "/=/";
		scissors = "XO";
		spock = "\\o/";
		lizard = "(n-)/";


		for(games=1; games <= maxGames; games++) {

			System.out.println("==================================");
			System.out.println("Games " + games);
			System.out.println("==================================");			
			round = 1;

			while( (computerScore <= 4 || playerScore <= 4 ) && round <= maxRound ) {

				System.out.println("\nRound " + round);
				System.out.println("Pick One ======");
				System.out.println("1. Rock " + rock);			 
				System.out.println("2. Paper " + paper);			 
				System.out.println("3. Scissors " + scissors);			 
				System.out.println("4. Spock " + spock);			 
				System.out.println("5. Lizard " + lizard);			 
				System.out.println("Enter your Symbols : ");
				mySymbols = keyboard.nextInt();

				computerPlay = randomNum.nextInt(6)+1;

				if(mySymbols == 1) {
					playerMind = rock;
				}
				else if(mySymbols == 2) {
					playerMind = paper;
				}
				else if(mySymbols == 3) {
					playerMind = scissors;
				}
				else if(mySymbols == 4) {
					playerMind = spock;
				}
				else if(mySymbols == 5) {
					playerMind = lizard;
				}

				if(computerPlay == 1) {
					computerMind = rock;
				}
				else if(computerPlay == 2) {
					computerMind = paper;
				}
				else if(computerPlay == 3) {
					computerMind = scissors;
				}
				else if(computerPlay == 4) {
					computerMind = spock;
				}
				else if(computerPlay == 5) {
					computerMind = lizard;
				}

				System.out.println(playerMind + " ATTACK " + computerMind);

				win = (playerMind == rock && computerMind == lizard) || (playerMind == rock && computerMind == scissors) || (playerMind == paper && computerMind == rock) || (playerMind == paper && computerMind == spock) || (playerMind == scissors && computerMind == paper) || (playerMind == scissors && computerMind == lizard) || (playerMind == spock && computerMind == scissors) || (playerMind == spock && computerMind == rock) || (playerMind == lizard && computerMind == spock) || (playerMind == lizard && computerMind == paper);

				lose = !win;

				if(playerMind == computerMind) {
					System.out.println("Draw. No one got point");
				}
				else {
					if(win) {
						System.out.println("You win. You got 1 point");
						playerScore++;
					}
					else if(lose) {
						System.out.println("Computer win. Computer got 1 point");
						computerScore++;
					}
				}

				System.out.println("Your Score     = " + playerScore);
				System.out.println("Computer Score = " + computerScore);	

				if(playerScore >= 4) {
					System.out.println("You win this games. You've got 1 point");
					playerPoint++;
				}
				else if(computerScore >= 4) {
					System.out.println("Computer win this games. Don't worry try again");
					computerPoint++;
				}
				else {
					System.out.println("No one got point for this games.");
				}

				round++;
			}

			System.out.println("Play for the Next Round ? : \n1. Yes \n2. No");
			choice = keyboard.nextInt();			
		}
	}
}