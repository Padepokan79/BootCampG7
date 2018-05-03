/*
     Creator     : Khairil
     Created At  : 3 Mei 2018 08:45 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class ShallowGrandMother {
	public static void main(String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int age;
		double income, cute, happiness;
		boolean allowed, allowed2;

		System.out.println( "Enter your age" );
		age = keyboard.nextInt();

		System.out.println( "Enter your yearly income" );
		income = keyboard.nextDouble();

		System.out.println( "How Cute Are you, on a scale from 0.0 to 10.0? " );
		cute = keyboard.nextDouble();

		System.out.println( "How happy do you make them, on a scale from 0.0 to 10.0? " );
		happiness = keyboard.nextDouble();

		allowed = ( age > 25 && age < 40 && (income > 50000 || cute >= 8.5 ) );
		allowed2 = ( age > 25 && age < 40 && (happiness > 7) );

		System.out.println( "Allowed to date my grandchild? " + allowed );
		System.out.println( "Allowed to date my grandchild as my affair? " + allowed2 );
		
	}
}