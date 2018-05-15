/*
Created by 	: Yana
Time		: 14 Mei 2018 09.17
*/

public class ClubBouncer{
	public static void main(String[] atgs){

		int age = 22;
		boolean onGuestList = false;
		double allure = 7.5;
		String gender = "F";

		if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8)) {
			System.out.println("You are allowed to enter the club");
		}
		System.out.println("I Want You");
		else{
			System.out.println("You are not allowed to enter the club");
		}
	}
}