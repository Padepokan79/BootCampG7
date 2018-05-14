/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 14 May 2018 11:55
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex21Drill1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String title;

		System.out.print("First name : ");
		String first = keyboard.next();
		System.out.print("Last Name : ");
		String last = keyboard.next();
		System.out.print("Gender (M/F) : ");
		String gender = keyboard.next();
		System.out.print("Age : ");
		int age = keyboard.nextInt();

		if(age < 20){
			title = first;
		}
		else {
			if (gender.equals("F")) {
				System.out.print("Are you married, "+first+"? (Y/N): ");
				String married = keyboard.next();
				if (married.equals("Y")) {
					title = "Mrs.";
				}
				else {
					title = "Ms.";
				}
			}
			if (gender.equals("M")) {
				
			}
		}

		System.out.println("\n"+title+" "+last);
	}
}

//Karna title harus bervalue oleh karena itu jika ingin memfixkan program ini kita hanya perlu mendeklarasikan title ini