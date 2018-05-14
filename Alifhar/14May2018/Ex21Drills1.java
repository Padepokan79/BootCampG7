/*
	* Created by:	Alifhar Juliansyah
	* 				14-05-2018	11.41
	* Updated by:
	*
*/
import java.util.Scanner;

public class Ex21Drills1{
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		String title;

		System.out.print("First name: ");
		String first=keyboard.next();
		System.out.print("Last name: ");
		String last=keyboard.next();
		System.out.print("Gender (M/F): ");
		String gender=keyboard.next();
		System.out.print("Age: ");
		int age=keyboard.nextInt();

		if(age<20){
			title=first;
		}
		else{
			if(gender.equals("F")){
				System.out.print("Are you married, "+first+"? (Y/N): ");
				String married=keyboard.next();
				if(married.equals("Y")){
					title="Mrs.";
				}
				else {
					title="Ms.";
				}
			}
			else{
				title="Mr.";
			}
		}
		System.out.println("\n"+title+" "+last);
	}
}
//it's error because the title variable won't have any values when its gender neither M or F