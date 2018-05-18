/*
Creted by	: Yana
Time		: 17 Mei 2018 14.34
*/

import java.util.Scanner;
import java.util.Random;

public class DiceGame{
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		int poin=0, poinMin=0, poinMax=100, randomKomputer1, randomKomputer2, randomKomputer3, randomPlayer,
			poinKomputer=0, poinPlayer=0, poinPlayerSementara=0;
		int berhenti;
		String lanjut;

		while(poinKomputer < poinMax && poinPlayer < poinMax){

			randomKomputer1 = rand.nextInt(6)+1;
			randomKomputer2 = rand.nextInt(6)+1;
			randomKomputer3 = rand.nextInt(6)+1;
			poinKomputer = poinKomputer + randomKomputer1+randomKomputer2+randomKomputer3;

			System.out.println("========================================================");
			System.out.println();
			System.out.println("KOMPUTER");
			System.out.println();
			System.out.println("Dadu 1 : " +randomKomputer1);
			System.out.println("Dadu 2 : " +randomKomputer2);
			System.out.println("Dadu 3 : " +randomKomputer3);
			System.out.println("Total  : " +poinKomputer);
			System.out.println();

			if(poinKomputer < poinMax){

				randomPlayer		= rand.nextInt(6)+1;
				poinPlayer 			= poinPlayer+randomPlayer;

				if (poinPlayer > poinMin && randomPlayer == 1) {
					poinPlayer = poinPlayer-1;
				}

				System.out.println();
				System.out.println("PLAYER");
				System.out.println();
				System.out.println("Dadu Player 	: " +randomPlayer);
				System.out.println("Total       	: " +poinPlayer);
				System.out.println();

				if (randomPlayer != 1) {
					berhenti = 0;
					while(berhenti <= 0){
						System.out.println();

						System.out.print("Apakah mau lanjut? (Y/N) ");
						lanjut  = keyboard.next();

						if (lanjut.equals("Y")) {
							System.out.println();
							berhenti = 0;

							randomPlayer		= rand.nextInt(6)+1;
							poinPlayer 			= poinPlayer;
							poinPlayerSementara = poinPlayerSementara + randomPlayer;

							if (randomPlayer == 1) {
								poinPlayerSementara = poinMin;
								berhenti   = 1;
							}

							System.out.println();
							System.out.println("PLAYER");
							System.out.println();
							System.out.println("Dadu Player 	: " +randomPlayer);
							System.out.println("Total       	: " +poinPlayer);
							System.out.println("Total Sementara : " +poinPlayerSementara);
						}else{
							berhenti = 1;
							poinPlayer = poinPlayer + poinPlayerSementara;
							poinPlayerSementara = 0;
						}
					}
				}				
			}
			if (poinKomputer >= poinMax) {
				System.out.println("=========================");	
				System.out.println("POIN KOMPUTER : " +poinKomputer);
				System.out.println("POIN PLAYER   : " +poinPlayer);		
				System.out.println("=========================");				
				poinPlayer = 100;
				System.out.println();
				System.out.println("Komputer menang");
			}
			else if (poinPlayer >= poinMax) {
				System.out.println("=========================");	
				System.out.println("POIN KOMPUTER : " +poinKomputer);
				System.out.println("POIN PLAYER   : " +poinPlayer);		
				System.out.println("=========================");				
				poinKomputer = 100;
				System.out.println();
				System.out.println("Player menang");
			}
		}
	}
}