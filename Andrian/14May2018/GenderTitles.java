/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class GenderTitles {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			String title;

			System.out.println("First name: ");
			String first = key.next();
			System.out.println("Last name: ");
			String last = key.next();
			System.out.println("Gender (M/F): ");
			String gender = key.next();
			System.out.println("Age: ");
			int age = key.nextInt();


			if ( age < 20 ) {
				title = first;
			}
			else {
				if (gender.equals("F")) {
					System.out.println("Are you married, "+first+"? (Y/N)");
					String married = key.next();
					if ( married.equals("Y")) {
						title = "Mrs. ";
					}
					else {
						title = "Ms. ";
					}
				}
					else {
						title = "Mr. ";
					}
				}
				System.out.println("\n "+title+" "+last);
		}
	}