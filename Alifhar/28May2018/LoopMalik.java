/*
	* Created by:	Alifhar Juliansyah
	* 				20-05-2018	22.59
	* Updated by:
	*
*/
import java.util.Scanner;
import java.util.Random;
public class LoopMalik{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		String choice;
		int pencil, randomizer, chance=5, guess, score=0;
		boolean loop;

		System.out.print("Input your pencil : ");
		pencil=scan.nextInt();

		do{
			loop=true;
			randomizer=rand.nextInt(pencil+1);
			System.out.println("\nSCORE : "+score+"\n");
			System.out.println("--------------------------");
			while(loop && chance>0){
				System.out.println("you're chance : "+chance);
				System.out.print("Put your guess : ");
				guess=scan.nextInt();
				chance--;
				if(guess==randomizer){
					System.out.println("right");
					loop=false;
					chance++;
					score+=10;
				}
				else{
					System.out.println("wrong");
					if(score>0 && chance==0){
						System.out.print("\nDo you want to sacrifice your score with chance? ");
						choice=scan.next();
						if(choice.equals("yes")){
							chance++;
							score-=10;
							System.out.println("\nSCORE : "+score);
						}
					}
				}
				System.out.println("--------------------------");
			}
		}while(chance>0);

		System.out.println("\nSCORE : "+score);
	}
}