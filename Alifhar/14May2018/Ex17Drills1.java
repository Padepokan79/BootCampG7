/*
	* Created by:	Alifhar Juliansyah
	* 				14-05-2018	09.17
	* Updated by:
	*
*/
public class Ex17Drills1{
	public static void main(String[] args){
		int age=22;
		boolean onGuestList=false;
		double allure=7.5;
		String gender="F";
		if(onGuestList || age>=21 || (gender.equals("F") && allure>=8)){
			System.out.println("You are allowed to enter the club.");
		}
		System.out.println("C-C-C-COMBO BREAKER");
		//it'll make the program error, because "else" program is the part of "if" program that can't be separated
		else{
			System.out.println("You are not allowed to enter the club.");
		}
	}
}