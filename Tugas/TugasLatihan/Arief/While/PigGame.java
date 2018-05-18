/*
Date Created	: 16 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;
import java.util.Random;

public class PigGame {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		Random rand = new Random();

		int index, randomDice, pointMax, pointComp, pointPlayer, nol, cold, warm, hot, random, randomPlay, round, win, maxRound, com, temp;
		String rolling;
		boolean rollChoice;

		win = nol = 0;
		round = hot = 1;
		warm = 2;
		cold = 3;
		maxRound = random = 10;
		randomPlay = 6;
		pointPlayer = pointComp = 0;
		pointMax = 100;

		while (pointPlayer < pointMax && pointComp < pointMax) {
			System.out.println("Round " + round);
			System.out.println("============================");
			for (com = hot; com <= cold ; com++ ) {
				System.out.print("Computer throwing dice " + com + ": ");
				randomDice = rand.nextInt(randomPlay) + hot;
				System.out.println(randomDice);
				pointComp+=randomDice;
			}

			System.out.println("============================");
			System.out.println("Computer Score\t: " + pointComp);

			if (pointComp < pointMax) {
				temp = nol;
				System.out.println("============================");
				System.out.println("Your pick");
				System.out.println("Roll the dice mate");
				randomDice = rand.nextInt(randomPlay) + hot;
				System.out.print("Your throwed dice\t: ");
				System.out.println(randomDice);
				temp+=randomDice;
				if (randomDice != hot) {
					index = nol;
					while (index < hot) {
						System.out.print("Continue or stop to roll mate: (Y/T)");
						rolling = inputKey.next();
						rollChoice = rolling.equals("Y");
						if (rollChoice) {
							randomDice = rand.nextInt(randomPlay) + hot;
							System.out.print("Your throwed dice\t: ");
							System.out.println(randomDice);
							index = nol;
							temp+=randomDice;
							if (randomDice == hot) {
								index = hot;
								temp = nol;
							}
						}else {
							index = hot;
						}	
							
					}
					// System.out.println("temporary " + temp);
				}else{
					temp = nol;
				}
				System.out.println("\nPlayer Score " + (pointPlayer+=temp));
				System.out.println("============================");
				System.out.println();
				round++;
			}		

		}
		if (pointPlayer>=100) {
			System.out.println("============================");
			System.out.println("Player Win the game");
		}else{
			System.out.println("============================");
			System.out.println("Computer Win the game");
		}

	}
}



