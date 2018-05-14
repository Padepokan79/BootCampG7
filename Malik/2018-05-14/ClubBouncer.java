/*
create by : Malik Chaudhary
time : 14-05-2018 9:17AM
*/

public class ClubBouncer {
	public static void main( String[] args ) {
		int age = 22;
		boolean onGuestList = false;
		double allure = 7.5;
		String gender = "F";
	
		if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ) {
			System.out.println("You are allowed to enter the club.");
		}
		// System.out.println("hehe"); tidak bisa di tambahkan 
		else {
			System.out.println("You are not allowed to enter the club.");
		}
	}
}