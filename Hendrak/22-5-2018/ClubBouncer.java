//Created by : Hendra Kurniawan
//Date : 20 Mei 2018 Time : 11:30 AM
//Modified by :
public class ClubBouncer{
	public static void main(String[] args) {
		int age = 22;
		boolean onGuestList = false;
		double allure = 7.5;
		String gender = "F";

		if( onGuestList || age >= 25 || (gender.equals("F") && allure >= 8)){
			System.out.println("You are allowed to enter the club.");
		}
		else {
			System.out.println("You are not allowed to enter the club.");
		}
	}
}