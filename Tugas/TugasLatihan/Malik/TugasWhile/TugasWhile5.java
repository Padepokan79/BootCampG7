/*
created by 	: Malik Chaudhary
time 		: 17-05-2018 2:27PM

Soal :
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

import java.util.Random;
import java.util.Scanner;
public class TugasWhile5{
	public static void main(String[] args){
		Random random = new Random();
		Scanner user = new Scanner(System.in);

		int maxPoint, point, ronde, maxRonde, pointCom, pointUser, randomCom, randomUser, totalPointCom, totalPointUser, com1, com2, com3;
		int pointPermanen;
		String lanjut;
		boolean userLanjut, valuePoint;

		maxPoint		= 100;
		pointCom 		= 0;
		pointUser		= 0;
		ronde			= 1;
		maxRonde		= 1000;
		totalPointCom 	= 0;
		pointPermanen = 0;

		totalPointUser = 0;
		
		
		// || !(totalPointUser >= maxPoint)
		
		while( totalPointCom < maxPoint && totalPointUser < maxPoint ){
				
			   totalPointUser = 0; 
			   int comDadu = 1;
			   randomCom = 0;
			   System.out.println();
			   System.out.print("Bagian Kumputer!\n");
			   while( comDadu <= 3 ){
				   	randomCom 		= random.nextInt(6)+1;
				   	pointCom		= randomCom;
				   	totalPointCom   += pointCom; 
				   	System.out.print("Dadu Komputer : "+pointCom+"\n");
				   	comDadu += 1;
			   }
				
				System.out.print("Total Point Komputer: "+totalPointCom+"\n");
				lanjut = "Y";
				randomUser = 0;
				while( randomUser != 1 && totalPointUser < 100 && lanjut.equals("Y") ){
						randomUser 	= random.nextInt(6)+1;
						  	if ( randomUser != 1 ) {
						  			System.out.println();
									System.out.print("Bagian Anda!\n");
						  			System.out.print("Dadu anda : "+randomUser+"\n");
						  			pointUser = randomUser;
						  			totalPointUser += pointUser;
						  			System.out.println();
						  			System.out.print("Point User: "+(totalPointUser)+"\n");
						  			System.out.print("Total Score User: "+(pointPermanen)+"\n");
						  			System.out.print("=======================================");

								  	System.out.println();
								  	System.out.print("Lakukan Roll ? (Y/N) : ");
								  	lanjut = user.next();
						  		
						  	}else if ( randomUser == 1 ) {
								totalPointUser = 0;
						  		System.out.println();
								System.out.print("Dadu anda : "+randomUser+"\n");
								System.out.print("Total Point User: "+(totalPointUser)+"\n");
							}
				}
				
				if ( lanjut.equals("N") ) {
					randomUser = 0;
					pointPermanen += totalPointUser;
					System.out.print("Total Point Disimpan: "+(pointPermanen)+"\n");
				}  
				
				if ( totalPointCom >= maxPoint ) {
					System.out.print("Pemenangnya adalah Komputer dengan point : "+totalPointCom);
				}else if(pointPermanen >= maxPoint){
					System.out.print("Pemenangnya adalah Komputer dengan point : "+pointPermanen);
				}else{

				}
		}
		
	}
}