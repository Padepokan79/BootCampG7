/* 	Date 		: 18/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 


	Pig-like Dice Game
This is a dice game similar to the game Pig, but easier to implement. The player plays against the computer.

1.	Player and Computer start out with zero points.
2.	The winner is the first player to reach 100 points or more.
3.	In each round, the computer rolls first, followed by the player.
4.	The computer rolls three dice and the sum of spots is added to its score.
5.	At the start of the player's turn, a working sum is initialized to zero.
6.	The player then rolls a single die as many times as desired.
	a.	If the dies shows a 1 (on the first roll or any roll), then the player's turn is over and nothing is added to the player's score.
	b.	For rolls other than 1, the roll is added to the working sum.
	c.	If the player stops rolling before a 1 occurs, then the working sum is added to the player's score.

				
	*/
import java.util.Scanner;
import java.util.Random;

public class PigDiceGame {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Random rand = new Random();
		
		int dice, score=0, scoreMax=100, compScore=0, yourScore=0, yourScoreTemp=0, numberDiceComp1,
			numberDiceUser, numberDiceComp2, numberDiceComp3, round = 1;
		String command="";

		System.out.println("========================================");
		System.out.println("        Welcome to dice game!");
		System.out.println("            let's start");
		System.out.println("========================================");

		while (  compScore < scoreMax && yourScore < scoreMax) {
			System.out.println("\n\n========================================"); //Komputer mulai duluan
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("^^^^^^^^^^^^^^^^Round "+round+"^^^^^^^^^^^^^^^^^");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("Computer turn");
			numberDiceComp1 = rand.nextInt(6)+1;
			System.out.println("frist dice for computer "+numberDiceComp1); //nilai dadu yang didapatkan komputer
			numberDiceComp2 = rand.nextInt(6)+1;
			System.out.println("second dice for computer "+numberDiceComp2); //nilai dadu yang didapatkan komputer
			numberDiceComp3 = rand.nextInt(6)+1;
			System.out.println("third dice for computer "+numberDiceComp3); ////nilai dadu yang didapatkan komputer
			compScore = compScore + (numberDiceComp1+numberDiceComp2+numberDiceComp3); //penjumlahan dari ketiga nilai dadu yang dilempar komputer
			System.out.println("Computer score \t\t"+compScore); 
			command = "Y";  // komando ini di butuhkan untuk meneruskan menuju giliran player
			System.out.println();
			System.out.println();
			yourScore += yourScoreTemp; //score ini merupakan score yang didapat dari
			System.out.println("User score \t\t"+yourScore);
			yourScoreTemp = 0; // working sum reset untuk menjadi 0 kembali

			if (compScore >= 100) {
				System.out.println("========================================");
				System.out.println("             Game finish");
				System.out.println("Computer Will rule the world");
				System.out.println(">> Computer score "+compScore);
				System.out.println(">> User score "+yourScore);
				command = "N";
			}
			else if (yourScore >= 100) {
				System.out.println("========================================");
				System.out.println("             Game finish");
				System.out.println("Woohooo !! you're win the game");
				System.out.println(">> Computer score "+compScore);
				System.out.println(">> User score "+yourScore);
				command = "N";
			}
			

			while ( command.equals("Y")||command.equals("y") && yourScore < scoreMax) {
				numberDiceUser = rand.nextInt(6)+1;
				
				if (numberDiceUser>1) {
					System.out.println("\nYour turn: "+numberDiceUser);
					System.out.println("Lanjutkan permainan: ");
					command = key.next();
				}
				else if (numberDiceUser==1){
					yourScoreTemp = 0;
					numberDiceUser = yourScoreTemp;
					command = "N";
					System.out.println("your score is gone");
				}
				yourScoreTemp += numberDiceUser;
				System.out.println();
				System.out.println("========================================");
				System.out.println("Score user sementara adalah "+ yourScoreTemp);
				System.out.println("Score user adalah "+ yourScore);
				System.out.println("========================================");
			}
			round++;
		}

	}
}