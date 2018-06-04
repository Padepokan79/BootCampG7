//Created by : Hendra Kurniawan
//Date : 21 Mei 2018 Time : 5:03 AM
//Modified by :
import java.util.Scanner;

public class Ex21Drills1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String title="error";

		System.out.print("First name: ");
		String first = keyboard.next();
		System.out.print("Last name : ");
		String last = keyboard.next();
		System.out.print("Gender (M/F) : ");
		String gender = keyboard.next();
		System.out.print("Age : ");
		int age = keyboard.nextInt();

		if(age < 20){
			title = first;
		}
		else {
			if(gender.equals("F")){
				System.out.print("Are you married, " + first + " ? (Y/N) : ");
				String married = keyboard.next();
				if(married.equals("Y")){
					title = "Mrs.";
				}
				else{
					title = "Ms.";
				}
			}
			if(gender.equals("M")){
				title = "Mr.";
			}
		}
		System.out.println("\n" + title + " " +  last);
	}
}