/*
	DATA CREATED 	: 14 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;

public class Ex19Drills2 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double bmi, tinggi, berat, convertMeter, convertKG;

		System.out.print( "Berapa tinggi badan anda? (dalam cm) " );
		tinggi = keyboard.nextDouble();

		System.out.print( "Berapa berat badan anda? (dalam pound) " );
		berat = keyboard.nextDouble();

		convertMeter = tinggi/100;
		convertKG 	 = berat/2.2046;
		bmi 	= convertKG/(convertMeter*convertMeter);

		System.out.print( "BMI category: " );
		if ( bmi < 15.0 ) {
			System.out.println( "very severely underweight" );
		}else if ( bmi <= 16.0 ) {
			System.out.println( "severely underweight" );
		}else if ( bmi < 18.5 ) {
			System.out.println( "underweight" );
		}else if ( bmi < 25.0 ) {
			System.out.println( "normal weight" );
		}
		else if ( bmi < 30.0 ) {
			System.out.println( "overweight" );
		}else if ( bmi < 35.0 ) {
			System.out.println( "moderately obese" );
		}else if ( bmi < 40.0 ) {
			System.out.println( "severely obese" );
		}else {
			System.out.println( "very severely/\"morbidly\" obese" );
		}
	}
}