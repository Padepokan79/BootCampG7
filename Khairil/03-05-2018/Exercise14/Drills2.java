/*
     Creator     : Khairil
     Created At  : 3 Mei 2018 09:07 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class Drills2 {
	public static void main(String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int age, income;
		double cute;
		boolean allowed, cuted, agree;

		System.out.println( "Enter your age" );
		age = keyboard.nextInt();

		System.out.println( "Enter your yearly income" );
		income = keyboard.nextInt();

		System.out.println( "How Cute Are you, on a scale from 0.0 to 10.0? " );
		cute = keyboard.nextDouble();

		allowed = ( age >= 30 && income >= 5000000 );
		cuted   = cute >= 8;

		System.out.println( "Are you cute ? " + cuted);
		System.out.println( "Hired? " + allowed);
	}
}