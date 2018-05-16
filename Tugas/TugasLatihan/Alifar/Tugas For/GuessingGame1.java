/*
	* Created by:	Alifhar Juliansyah
	* 				16-05-2018	14.19
	* Updated by:
	*
*/
import java.util.Scanner;
import java.util.Random;

public class GuessingGame1{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		int number, guess, i;
		
		System.out.println("\nI am  thinking of a number from 1 to 10");
		System.out.println("You must guess what it is in three tries");

		number=rand.nextInt(10)+1;
		for(i=0;i<3;i++){
			System.out.println("Enter a guess:");
			guess=scan.nextInt();
			if(guess==number){
				System.out.println("RIGHT!");
				i=10;
			}
			else
				System.out.println("wrong");
		}

		if(i==3){
			System.out.println("The correct number was "+number+".");
			System.out.println("You have lost the game.");
		}
	}
}