/*
	* Created by:	Alifhar Juliansyah
	* 				14-05-2018	09.29
	* Updated by:
	*
*/
import java.util.Scanner;

public class Ex18Drills1{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		String secret="please", guess;

		System.out.print("What's the secret word? ");
		guess=keyboard.next();

		if(guess.equals(secret) || guess.equals("heaven")){
			System.out.println("That's correct!");
		}
		else{
			System.out.println("No, the secret word isn't \""+guess+"\".");
		}

		if(guess==secret || guess.equals("heaven")){
			System.out.println("(This will never ever show, no matther what.)");
		}
	}
}