/*
     Creator     : Khairil
     Created At  : 3 Mei 2018 09:50 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class Drills4 {
	public static void main(String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int age, age1, ageDiff, ageDiff1;
		double income, cute;
		boolean allowed;

		System.out.println( "Enter your age" );
		age = keyboard.nextInt();

		System.out.println( "Enter your candidate age" );
		age1 = keyboard.nextInt();		

		System.out.println( "Enter your yearly income" );
		income = keyboard.nextInt();

		System.out.println( "How Cute Are you, on a scale from 0.0 to 10.0? " );
		cute = keyboard.nextDouble();

		ageDiff = age + 5;
		ageDiff1 = age1 - 5;

		allowed = ( age1 <= ageDiff && age >= ageDiff1 && income >= 5000000 && cute >= 8 );

		System.out.println( "Can you marry my daughter ? " + allowed);
	}
}