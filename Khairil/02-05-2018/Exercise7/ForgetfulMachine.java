/*
     Creator     : Khairil
     Created At  : 2 Mei 2018 10:15 AM     
     Updated By  : 
     Update Date : 
*/

import java.util.Scanner;

public class ForgetfulMachine {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What city is the capital city of France?");
		keyboard.next();
		//type 2 words occurs error

		System.out.println("What is 6 multiplied by 7");
		keyboard.nextInt();
		//type text occurs error
		//type decimal number occurs error
		//type special character occurs error

		System.out.println("Enter a number between 0.0 and 1.0.");
		keyboard.nextDouble();
		//type text occurs error
		//type special character occurs error

		System.out.println("Is there anything else you would like to say?");
		keyboard.next();
	}
}