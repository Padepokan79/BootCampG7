/*
Create by 	: Yana
Time		: 11 Mei 2018 07.57
*/

import java.util.Scanner;

public class Ex21Drills1{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		String title;

		System.out.print("First name: ");
		String first = keyboard.next();
		System.out.print("Last name: ");
		String last = keyboard.next();
		System.out.print("Gender (M/F): ");
		String gender = keyboard.next();
		System.out.print("Age: ");
		int age = keyboard.nextInt();

		if (age < 20) {
			title = first;
		}
		else {
			if ( gender.equals("F")) {
				System.out.print("Are you married, " +first+ "? (Y/N): ");
				String married = keyboard.next();
				if ( married.equals("Y")) {
					title = "Mrs.";
				}
				else {
					title = "Ms.";
				}
			}
			else{
				title = "Mr.";
			}
		}

		System.out.println("\n" +title+ " " +last);
	}
}

/* 
Jika else pada line 38 diubah menjadi if (gender.equals("M")) maka program akan error karena
if statement tidak memberikan value pada title
*/