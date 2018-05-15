public class Ex17Drills1 {
	public static void main( String[] args ) {
	int age = 22;
	boolean onGuestList = false;
	double allure = 7.5;
	String gender = "F";

	if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ) {
	System.out.println("You are allowed to enter the club.");
	 }
	System.out.println ("it doesn’t matter what, but I put "C-C-C-COMBO BREAKER" because I’m weird");
	
	else {
	System.out.println("You are not allowed to enter the club.");
		}
	}
}