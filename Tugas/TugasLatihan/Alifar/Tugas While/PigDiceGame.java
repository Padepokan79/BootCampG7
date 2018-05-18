/*
	* Created by:	Alifhar Juliansyah
	* 				17-05-2018	14.26
	* Updated by:
	*
*/
import java.util.Scanner;
import java.util.Random;

public class PigDiceGame{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		int dadu, playerScore=0, compScore=0, playerTurn, temp, round=1;
		String cont;

		while(playerScore<100 && compScore<100){
			System.out.println("\n=========================");
			System.out.println("Round "+round);
			System.out.println("=========================");

			System.out.println("Computer turn");
			for(int chance=1; chance<=3; chance++){
				dadu=rand.nextInt(6)+1;
				System.out.println("Computer got "+dadu);
				compScore+=dadu;
			}

			if(compScore<100){
				System.out.println("\nPlayer turn");
				playerTurn=0;
				dadu=rand.nextInt(6)+1;
				System.out.println("Player got "+dadu);
				playerTurn+=dadu;
				while(dadu>1){ //&& (playerTurn+playerScore<100)
					System.out.print("Do you want to continue? (y/n) ");
					cont=scan.next();
					if(cont.equals("y")){
						dadu=rand.nextInt(6)+1;
						System.out.println("Player got "+dadu);
						playerTurn+=dadu;
					}
					else
						dadu=-1;
				}
				if(dadu!=1)
					playerScore+=playerTurn;
			}
			System.out.println("\nComputer Score : "+compScore);
			System.out.println("Player Score   : "+playerScore);
			round++;
		}

		System.out.println("===================================");
		if(playerScore>=100)
			System.out.println("HURRAY, YOU WON THE GAME");
		else
			System.out.println("Sorry, You Lose the game");
		System.out.println("===================================");
	}
}