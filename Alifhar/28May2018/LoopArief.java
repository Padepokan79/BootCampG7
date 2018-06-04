/*
	* Created by:	Alifhar Juliansyah
	* 				20-05-2018	21.45
	* Updated by:
	*
*/
import java.util.Scanner;
import java.util.Random;

public class LoopArief{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		String rest1="error", rest2="error";
		int round, game=0, totalGame=3, totalRound=5, playerWin, winRound=0, playerGame=0, weapon, enemy, count=0;

		while(game<totalGame){
			game++;
			round=0;
			playerWin=0;
			System.out.println("===========================");
			System.out.println("       GAME "+game);
			System.out.println("===========================");
			do{
				round++;
				enemy=rand.nextInt(5)+1;
				System.out.println("\n-------------------");
				System.out.println("Round "+round);
				System.out.println("1. Rock\n2. Paper\n3. Scissors\n4. Spock\n5. Lizard");
				System.out.print("Pick Your Weapon: ");
				weapon=scan.nextInt();

				if(weapon==enemy)
					System.out.println("Draw");
				else if( (weapon==1 && (enemy==5 || enemy==3)) || (weapon==2 && (enemy==1 || enemy==4)) || (weapon==3 && (enemy==2 || enemy==5)) || (weapon==4 && (enemy==1 || enemy==3)) || (weapon==5 && (enemy==4 || enemy==2)) ){
					playerWin++; winRound++;
					rest1="Your"; rest2="Enemy";
				}else{
					rest1="Enemy"; rest2="Your";
				}
	
				if( (weapon==1 && enemy==5) || (weapon==5 && enemy==1) )
					System.out.println(rest1+" Rock crush "+rest2+" Lizard");
				if( (weapon==1 && enemy==3) || (weapon==3 && enemy==1) )
					System.out.println(rest1+" Rock crush "+rest2+" Scissors");
				if( (weapon==2 && enemy==1) || (weapon==1 && enemy==2) )
					System.out.println(rest1+" Paper cover "+rest2+" Rock");
				if( (weapon==2 && enemy==4) || (weapon==4 && enemy==2) )
					System.out.println(rest1+" Paper disproves "+rest2+" Spock");
				if( (weapon==3 && enemy==2) || (weapon==2 && enemy==3) )
					System.out.println(rest1+" Scissors cut "+rest2+" Paper");
				if( (weapon==3 && enemy==5) || (weapon==5 && enemy==3) )
					System.out.println(rest1+" Scissors decapitate "+rest2+" Lizard");
				if( (weapon==4 && enemy==1) || (weapon==1 && enemy==4) )
					System.out.println(rest1+" Spock vaporizes "+rest2+" Rock");
				if( (weapon==4 && enemy==3) || (weapon==3 && enemy==4) )
					System.out.println(rest1+" Spock Smashes "+rest2+" Scissors");
				if( (weapon==5 && enemy==4) || (weapon==4 && enemy==5) )
					System.out.println(rest1+" Lizard poisons "+rest2+" Spock");
				if( (weapon==5 && enemy==2) || (weapon==2 && enemy==5) )
					System.out.println(rest1+" Lizard eats "+rest2+" Paper");
			}while(round<totalRound);

			System.out.println("\n");
			if(playerWin>=4){
				System.out.println("-------------------------");
				System.out.println("YEAYYYY, You WIN Game "+game);
				System.out.println("-------------------------");
				playerGame++;
			}
		}
		System.out.println("======================");
		System.out.println("YOUR TITTLE:");
		if(playerGame==3)
			System.out.println("GODSPEED");
		else if(playerGame==2)
			System.out.println("Palladins");
		else if(playerGame==1)
			System.out.println("Knight");
		else
			count++;
		if(winRound>=10)
			System.out.println("Enthusiast");
		else if(winRound>=8)
			System.out.println("Participants");
		else if(winRound==0)
			System.out.println("Want-to-know-only");
		else
			count++;
		if(count==2)
			System.out.println("No title");
		System.out.println("======================");
	}
}