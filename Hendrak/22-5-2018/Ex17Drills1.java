//Created by : Hendra Kurniawan
//Date : 20 Mei 2018 Time : 12:50 PM
//Modified by :
public class Ex17Drills1{
	public static void main(String[] args) {
		int age = 22;
		boolean onGuestList = false;
		double allure = 7.5;
		String gender = "F";

		if( onGuestList || age >= 25 || (gender.equals("F") && allure >= 8)){
			System.out.println("You are allowed to enter the club.");
		}
		System.out.println("CCCCCC-COMBO BREAKER");
		else {
			System.out.println("You are not allowed to enter the club.");
		}
	}
}
//program menjadi error, karena statement yang ditambahkan memotong fungsi if else 
//sehingga program membaca bahwa else tidak memiliki if di atasnya akibatnya program error 