/*
Date Created	: 08 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class ClubBouncer{
	public static void main(String[] args){
		int age = 22;
		boolean onGuestList = false;
		double allure = 7.5;
		String gender = "F";

		if (onGuestList || age >= 21 ||(gender.equals("F") && allure >= 8)) {
			System.out.println("You are allowed to enter the club.");
		}
		// System.out.println("HOAEA"); >> akan error
		/*
		Error karena kondisi else memerlukan kondisi if sebelum else
		*/
		else {
			System.out.println("You are not allowed to enter the club.");
		}
	}
}