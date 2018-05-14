/*
	Created By Vikri
	14/05/2018
	11:03
*/
import java.util.Scanner;
	public class Ex19D1 {
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
			else if ( bmi < 25.0 ) { //maka bila diinput lebih dari 18.5 tidak akan keluar inputan normal weight
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
		}
	}