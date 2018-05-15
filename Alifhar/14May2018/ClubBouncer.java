/*
	* Created by:	Alifhar Juliansyah
	* 				14-05-2018	09.11
	* Updated by:
	*
*/
public class ClubBouncer{
	public static void main(String[] args){
		int age=22;
		boolean onGuestList=false;
		double allure=7.5;
		String gender="F";
		if(onGuestList || age>=21 || (gender.equals("F") && allure>=8)){
			System.out.println("You are allowed to enter the club.");
		}
		else{
			System.out.println("You are not allowed to enter the club.");
		}
	}
}