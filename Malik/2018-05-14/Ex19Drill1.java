/*
created by : Malik Chaudhary
time : 14-05-2018 10:29AM
*/

import java.util.Scanner;
	
public class Ex19Drill1 {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	double bmi;
	
	System.out.print( "Enter your BMI: " );
	bmi = keyboard.nextDouble();
	
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
	if ( bmi < 25.0 ) { // bila else dihilangkan maka if tersebut akan membuat kondisi baru dan akan menampilkan 2 kondisi / statement dengan if yang diatas tadi
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