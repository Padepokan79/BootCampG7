/* 	Date 		: 14/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class Ex18Drills1 {
		public static void main(String[]args){
			Scanner key = new Scanner(System.in);
			String secret = "please", guess;

			System.out.println("What's the secret word? ");
			guess = key.next();

			if ( guess.equals(secret) || guess.equals("mogul") ){
				System.out.println("That's correct!");
			}
			else {
				System.out.println("No, the secret word isn't\"" + guess + "\".");
			}

			if (guess == secret){
				System.out.println("(This will never ever show, no metter what.)");
			}

		}
	}