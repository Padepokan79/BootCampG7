public class Drills1 {
	public static void main(String[] args) {
		int x, y, age, speed;
		double seconds, e, checking, phi;
		String firstName, lastName, title, city, province;

		x = 10;
		y = 400;
		age = 39;
		speed = 340;

		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		phi = 3.14;

		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		city = "Bandung";
		province ="West Java";

		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y");
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favourite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + lastName );
		System.out.println();
		System.out.println( "The Racing Car has maximum speed at " + speed + "km/h" );
		System.out.println( "If you want to count radius beside 7 use " + phi + " as phi number" );
		System.out.println( "The capital city of " + province + " is " + city );		
	}
}