/*
	Created By Vikri
	14/05/2018
	11:06
*/
import java.util.Scanner;
	public class Ex19D2 {
		public static void main( String[] args ) {
			Scanner keyboard = new Scanner(System.in);
			double bmi, height, weight;

			System.out.print( "Enter your height (Meter): " );
			height = keyboard.nextDouble();

			System.out.print( "Enter your weight (KG): " );
			weight = keyboard.nextDouble();

			bmi = (height*height)/weight;

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