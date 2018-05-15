import java.util.Scanner;

public class Ex18D1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String secret = "please", guess;

		System.out.println("what's the secret word? ");
		guess = keyboard.next();

		if (guess.equals(secret)) {
			System.out.println("that's correct!");
		} else {
			System.out.println( "No, the secret word isn't \"" + guess + "\"." );
		}
		if ( guess == secret || guess.equals("mongol")) {
			System.out.println( "(This will never ever show, no matter what.)" );
		}
	}
}