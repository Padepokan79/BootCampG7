/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 14 Mei 2018 09:14  
     * Updated By : 
     * Updated At : 
*/

public class ClubBouncer{
	public static void main(String[] args) {
		int age = 23;
		boolean onGuestList = false;
		double allure = 7.5;
		String gender = "F";

		if (onGuestList || age >= 21 || (gender.equals("F") && allure >= 8)) {
		 	System.out.println("You are allowed to enter the club. ");
		 } 
		else {
			System.out.println("You are not allowed to enter the club");
		}
	}
}