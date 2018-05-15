/*
created by : Malik Chaudhary
time : 14-05-2018 10:54AM
*/

import java.util.Scanner;
	
public class Ex19Drill2 {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	double bmi, tinggi, berat;
	
	System.out.print( "Masukan tinggi anda (M) : " );
	tinggi = keyboard.nextDouble();

	System.out.print( "Masukan berat anda (KG) : " );
	berat = keyboard.nextDouble();
	
	bmi = berat / ( tinggi*tinggi );

	System.out.print( "BMI category: " );
	if ( bmi < 15.0 ) {
		System.out.println( "very severely underweight" );
	}
	else if ( bmi <= 16.0 ) {
		System.out.println( "severely underweight" );
	}
	else if ( bmi < 18.5 ) {
		System.out.println( "underweight" );
	}
	else if ( bmi < 25.0 ) {
		System.out.println( "normal weight" );
	}
	else if ( bmi < 30.0 ) {
		System.out.println( "overweight" );
	}
	else if ( bmi < 35.0 ) {
		System.out.println( "moderately obese" );
	}
	else if ( bmi < 40.0 ) {
		System.out.println( "severely obese" );
	}
	else {
		System.out.println( "very severely/\"morbidly\" obese" );
	}
  }
}