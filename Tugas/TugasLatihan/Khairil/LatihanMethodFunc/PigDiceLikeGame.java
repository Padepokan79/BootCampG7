/*
	 Program     : Pig Dice Game - Using Dice Pic
     Creator     : Khairil
     Created At  : 30 Mei 2018 00:55 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;
import java.util.Random;

class PigDiceLikeGame {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		Random numRan = new Random();
		String choose;
		int diceNum, diceCom, diceSelf, point, points, choose2, fairCom, fairSelf, pointSelf, pointCom, round, rolls;
		Boolean play, match, com;

		play = true;
		match = true;
		com = true;
		point = 0;
		pointSelf = 0;
		pointCom = 0;
		points = 100;
		round = 1;
		rolls = 3;
		choose = "";
		diceSelf = 0;

		while(pointCom < points && pointSelf < points && match == true) {

			choose2 = 1;

			System.out.println("Round " + round);
			diceCom = 1;
			System.out.println();			
			System.out.println("=======================");				
			System.out.println("Computer Turn");
			System.out.println("=======================");

			while(diceCom <= rolls) {
				fairCom = numRan.nextInt(6) + 1;
				System.out.println("Com Dice " + diceCom + " : ");
				showDice(fairCom);
				System.out.println("=======================");
				pointCom = pointCom + fairCom;
				diceCom++;

				System.out.println("Comp point " + pointCom);
				System.out.println("=======================");

				fairSelf = 0;
				diceSelf = 0;
			}

				System.out.println("Your Turn");	
				System.out.println("Roll Now !! ");
				System.out.println("==============================");
				System.out.println("Press R to Roll");
				System.out.println("==============================");
				choose = input.next();


			while(( choose.equals("R") || choose.equals("r") ) && pointCom < points && choose2 == 1 && play == true) {

				fairSelf = numRan.nextInt(6) + 1;

				if(fairSelf == 1) {
					System.out.println();
					System.out.println("HAHAHAHAHAHAHAHAHAHAHA...");
					System.out.println("Your Dice  ");
					showDice(fairSelf);
					System.out.println("Game Over !!");
					System.out.println("==============================");
					System.out.println("Your last point 0");
					System.out.println("==============================");
					pointSelf = 0;
					diceSelf = 0;
					play = false;
				}
				else {
					System.out.println();
					System.out.println("Your Dice  ");
					showDice(fairSelf);					
					pointSelf = pointSelf + fairSelf;					
					play = true;
					System.out.println();
					System.out.println();
					System.out.println("Your point in round " + round++ + " : " + fairSelf);
					System.out.println("==============================");
					System.out.println("Total point " + pointSelf);
					System.out.println("==============================");
					System.out.println("Try Again ?? \n1. Yes\n2. No\n");
					System.out.println("==============================");
					System.out.println();
					System.out.println();
					choose2 = input.nextInt();
					if(choose2 == 1) {
						play = true;
					}
					else {
						play = false;
						match = true;
					}
				}
			}

			round++;

			diceSelf = diceSelf + pointSelf;
			System.out.println("Summary Total point " + diceSelf);

			System.out.println("==============================");
		}
	}

	public static void showDice( int roll ) {

		System.out.println("+---+");
		if ( roll == 1 ) {
			System.out.println("|   |");
			System.out.println("| o |");
			System.out.println("|   |");
		}
		else if ( roll == 2 ) {
			System.out.println("| o |");
			System.out.println("|   |");
			System.out.println("| o |");
		}
		else if ( roll == 3 ) {
			System.out.println("| o |");
			System.out.println("| o |");
			System.out.println("| o |");
		}
		else if ( roll == 4 ) {
			System.out.println("|o o|");
			System.out.println("|   |");
			System.out.println("|o o|");
		}
		else if ( roll == 5 ) {
			System.out.println("|o o|");
			System.out.println("| o |");
			System.out.println("|o o|");
		}
		else if ( roll == 6 ) {
			System.out.println("|o o|");
			System.out.println("|o o|");
			System.out.println("|o o|");
		}
		System.out.println("+---+");
	}	
}
/*
Pig-like Dice Game
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

-If the player stops rolling before a 1 occurs, then the working sum is added to the player's score.
*/