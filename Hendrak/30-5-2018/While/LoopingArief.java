//Created by : Hendra Kurniawan
//Date : 29 Mei 2018 Time : 7:56 AM
//Modified :
import java.util.Scanner;
import java.util.Random;

public class LoopingArief{
	public static void main(String[] args) {

		int win,game=0, round=0, winRound=0,winGame=0, simbolP=0, simbolC=0,allRoundWin=0;
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		do{
		game++;
		round=0;
		winRound=0;
			while(round <5){
			round++;

			System.out.println("\n\nGame " + game );
			System.out.println("Round " + round);
			System.out.println("==================");
			System.out.println("1.Rock ");
			System.out.println("2.Paper");
			System.out.println("3.Scissors");
			System.out.println("4.Spock");
			System.out.println("5.Lizard");
			System.out.print("Plih simbol : ");
			simbolP = keyboard.nextInt();
			simbolC = rand.nextInt(5)+1;

				if(simbolP == simbolC){
					System.out.println("Round "+ round+" : Draw");
				}
				else if(simbolP == 1 && ( simbolC == 3 || simbolC == 5)){
					winRound += 1;
					System.out.println("Round "+ round+" : Kamu Menang");
				}
				else if(simbolP == 2 && ( simbolC == 1 || simbolC == 4)){
					winRound += 1;
					System.out.println("Round "+ round+" : Kamu Menang");
				}
				else if(simbolP == 3 && ( simbolC == 2 || simbolC == 5)){
					winRound += 1;
					System.out.println("Round "+ round+" : Kamu Menang");
				}
				else if(simbolP == 4 && ( simbolC == 1 || simbolC == 3)){
					winRound += 1;
					System.out.println("Round "+ round+" : Kamu Menang");
				}
				else if(simbolP == 5 && ( simbolC == 4 || simbolC == 2)){
					winRound += 1;
					System.out.println("Round "+ round+" : Kamu Menang");
				}
				else{
					System.out.println("Round "+ round+" : Kamu Kalah");
				}
			
				
				
			}
			allRoundWin += winRound;	
			System.out.println("================================");
			System.out.println("Round Menang       " + winRound);
			System.out.println("Total Round menang " + allRoundWin);
					
			if(winRound>=4){

					System.out.println("Game "+game+" : Kamu Menang!!!!");
					winGame +=1;
			}
			else{
					System.out.println("Game "+game+" : Kamu Kalah!!!!");		
			}
		}while(game<3);

		if(winGame == 3){
			System.out.println("Catatan : GODSPEED!!!");
		}
		else if(winGame == 2){
			System.out.println("Catatan : Palladins!!!");
		}
		else if(winGame == 1){
			System.out.println("Catatan : Knight!!!");
		}
		else if(allRoundWin == 10){
			System.out.println("Catatan : Enthusiast!!!");
		}
		else if(allRoundWin == 8){
			System.out.println("Catatan : Participants!!!");
		}
		else if(allRoundWin == 0){
			System.out.println("Catatan : Want to know Only!!!");
		}
	}
}