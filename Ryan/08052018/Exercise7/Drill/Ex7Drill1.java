/*
     * Forgetfulmachine.
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At : 08 May 2018 15:56  
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex7Drill1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What city is the capital of France?");
		keyboard.next();

		System.out.println("What is 6 multiplied by 7?");
		keyboard.nextInt();
		// Perintah masukan 2 akan error jika kita menginputkan
		// contohnya char,sting,varchar,boolean,doble,float,date

		System.out.println("Enter a number between 0.0 and 1.0.");
		keyboard.nextDouble();

		System.out.println("Is there anything else you would like to say?");
		keyboard.next();
	}
}