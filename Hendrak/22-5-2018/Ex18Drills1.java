//Created by : Hendra Kurniawan
//Date : 20 Mei 2018 Time : 1:19 PM
//Modified by :
import java.util.Scanner;

public class Ex18Drills1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String secret = "please", guess;

		System.out.print("What's the secret word? ");
		guess = keyboard.next();

		if(guess.equals(secret) || guess.equals("mogul"))
			System.out.println("Thar's correct ");
		
		else
			System.out.println("No, the secret word isn't \"" + guess + "\".");
		

		if(guess == secret){
			System.out.println("This will never show, no matter what.");
		}
	}
}