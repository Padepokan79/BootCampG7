/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Ex14Drills1{
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);
		
		int age, happiness;
		double income, cute;
		boolean allowed, allowed2;

		System.out.print( "Enter your age : " );
		age = keyboard.nextInt();

		System.out.print( "Enter your yearly income : " );
		income = keyboard.nextDouble();

		System.out.print( "How cute are you, on a scale from 0.0 to 10.0? " );
		cute = keyboard.nextDouble();

		allowed = ( age > 25 && age < 40 && ( income > 50000 || cute >= 8.5 ) );

		System.out.println( "Allowed to date my grandchild? " + allowed );

		System.out.print();
		System.out.print( "How happy do you make them, on a scale from 0 to 10? " );
		happiness = keyboard.nextInt();

		allowed2 = ( age > 23 && age < 35 && happiness >= 7 );

		System.out.println( "Allowed to made my grandchild happy? " + allowed2 );


		// if ( age > 25 && age < 40 && ( income > 50000 || cute >= 8.5 ) ) {
		// 	System.out.println( "Allowed to date my grandchild ");
		// }else{
		// 	System.out.println( "NOT Allowed to date my grandchild ");
		// }

	}
}