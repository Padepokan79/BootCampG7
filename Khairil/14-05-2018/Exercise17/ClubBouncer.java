/*
	 Program     : Exercise 17 - ClubBouncer
     Creator     : Khairil
     Created At  : 14 Mei 2018 09:00 AM     
     Updated By  : 
     Update Date : 
*/
public class ClubBouncer {
	public static void main(String[] args) {
		int age = 22;
		boolean onGuestList = false;
		double allure = 7.5;
		String gender = "F";

		if ( onGuestList || age >= 21 || gender.equals("F") && allure >= 8 ) {
			System.out.println("You are allowed to enter the club.");
		}
		//drills 1
		// System.out.println("C-C-C-COMBO BREAKER"); 
		// Cannot compile because it cuts iteration if else statement
		// Cannot separate else without if
		else {
			System.out.println("You are not allowed to enter the club.");
		}
	}
}
