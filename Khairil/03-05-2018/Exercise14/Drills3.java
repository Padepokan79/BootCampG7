/*
     Creator     : Khairil
     Created At  : 3 Mei 2018 09:25 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class Drills3 {
	public static void main(String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int age, income;
		double cute;
		boolean allowed, cuted;

		System.out.println( "Enter your age" );
		age = keyboard.nextInt();

		System.out.println( "Enter your yearly income" );
		income = keyboard.nextInt();

		System.out.println( "How Cute Are you, on a scale from 0.0 to 10.0? " );
		cute = keyboard.nextDouble();

		allowed = ( age >= 17 && age < 30 && income >= 5000000 && cute >= 8 );

		System.out.println( "Can you marry my daughter ? " + allowed);
	}
}