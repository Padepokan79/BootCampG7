/*
	 Program     : Exercise 19 - Drills2
     Creator     : Khairil
     Created At  : 14 Mei 2018 10:40 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class Drills2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double weight, height, bmi, inCm;

		System.out.print( "Enter your Weight in kg: " );
		weight = keyboard.nextDouble();
		System.out.print( "Enter your Height in cm: " );
		height = keyboard.nextDouble();

		inCm = height / 100;

		bmi = weight / ( Math.pow(inCm, 2) );

		System.out.printf( "Your BMI is: %.2f", bmi );
		System.out.println();

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