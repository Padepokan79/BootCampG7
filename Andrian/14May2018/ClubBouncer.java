/* 	Date 		: 4/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	public class ClubBouncer {
		public static void main(String[] args){
			int age = 22;
			boolean onGuestList = false;
			double allure=7.5;
			String gender = "F";

			if ( onGuestList || age >= 21 || (gender.equals("F")) allure>=8 ) {
				System.out.println("You are allowed to endter the club");
			}
			else {
				System.out.println("You're not allowed to enter the club");
			}
		}
	}