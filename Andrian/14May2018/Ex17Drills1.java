/* 	Date 		: 14/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	public class Ex17Drills1 {
		public static void main(String[] args){
			int age = 22;
			boolean onGuestList = false;
			double allure=7.5;
			String gender = "F";

			if ( onGuestList || age >= 21 || (gender.equals("F")) && allure>=8 ) {
				System.out.println("You are allowed to endter the club");
			}
			System.out.println("C-C-C-C-Combo Breaker");
			else {
				System.out.println("You're not allowed to enter the club");
			}
			// This error happend 'cause statement "else" must followed by "if" in front off that
			// And  "if-else" is can't be splitted
		}
	}