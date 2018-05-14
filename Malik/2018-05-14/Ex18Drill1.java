/*

created by : Malik Chaudhary
time : 14-05-2018 9:30AM

*/

public class Ex18Drill1{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String secret = "please", guess;

		System.out.print("What's the secret word ? ");
		guess = keyboard.next();

		if ( guess.equals(secret) ) {
			System.out.println( "That's correct!" );
		}else{
			System.out.println("No, the secret word isn't \"" + guess + "\"." );
		}if ( guess == secret ) {
			System.out.println( "(This will never ever show, no matter what.)" );
		}if ( guess.equals(secret) || guess.equals("hello") ) {
			System.out.println( "(This will never ever show, no matter what.)" );
		}
	}
}