import java.util.Scanner;

public class Ex18Drills1 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner (System.in);
		String secret= "please", guess;


	System.out.println ("What's the secret word? ");
	guess = keyboard.next ();

	if (guess.equals(secret) || guess.equals("hehe")) {
	System.out.println("That's correct!");
	 }
	else {
	System.out.println("No, the secret word isn't \"" + guess + "\".");
		}

	if (guess==secret) {
	System.out.println("(This will never ever show, no matter what.)");
	 }
	}
}