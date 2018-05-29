/*
	* Created by:	Alifhar Juliansyah
	* 				20-05-2018	22.59
	* Updated by:
	*
*/
import java.util.Scanner;
import java.util.Random;

public class LoopChaudry{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		int round, maxRound=20, playerLife=1, compLife=1;
		char ch, choice;
		boolean win;

		System.out.println("Permainan Tebak Huruf");
		
		for(round=1;round<=maxRound;round++){
			win=false;
			System.out.println("\n----------------");
			System.out.println("Round "+round);
			ch=(char) (rand.nextInt(26)+'A');
			System.out.println("----------------");
			System.out.println("Input between A - Z");
				
			for(int turn=1;turn<=2;turn++){
				System.out.print("Your choice: ");
				choice=scan.next().charAt(0);
				if(choice==ch){
					System.out.println("That's RIGHT");
					turn=3;
					win=true;
				} else
					System.out.println("it's wrong");
			}

			if(win)
				playerLife+=2;
			else{
				playerLife-=1; compLife+=2;
			}

			if(playerLife>=compLife+6 || compLife>=playerLife+6 || playerLife>=16 || compLife>=16)
				maxRound=0;

			System.out.println("\nYour life     : "+playerLife);
			System.out.println("Computer life : "+compLife);
		}

		System.out.println("\n=============================");
		if(playerLife>=compLife+6 || playerLife>=16){
			System.out.println("YEAYYYY, YOU WIN");
			if(round<=8)
				System.out.println("CHEATER");
			else if(round<=11)
				System.out.println("NICE");
			else
				System.out.println("NOOB");
		}
		else if(compLife>=playerLife+6 || compLife>=16)
			System.out.println("Sorry, you lose");
		else
			System.out.println("No Winner");
		System.out.println("=============================");
	}
}