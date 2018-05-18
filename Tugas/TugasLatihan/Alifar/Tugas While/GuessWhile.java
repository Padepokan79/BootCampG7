/*
	* Created by:	Alifhar Juliansyah
	* 				17-05-2018	13.23
	* Updated by:
	*
*/
import java.util.Scanner;
import java.util.Random;

public class GuessWhile{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		int number, guess, i;
		
		System.out.println("\nI am  thinking of a number from 1 to 10");
		System.out.println("You must guess what it is in three tries");

		number=rand.nextInt(10)+1;
		i=0;
		while(i<3){
			System.out.println("Enter a guess:");
			guess=scan.nextInt();
			if(guess==number){
				System.out.println("RIGHT!");
				i=10;
			}
			else{
				if(i==2){
					System.out.println("wrong");
					System.out.println("The correct number was "+number+".");
					System.out.println("You have lost the game.");
				}
				else{
					if( (guess+1)==number || (guess-1)==number )
						System.out.println("hot");
					else if( (guess+2)==number || (guess-2)==number )
						System.out.println("warm");
					else
						System.out.println("cold");
				}
			}
		i++;
		}
	}
}