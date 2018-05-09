/*
	Created By vikri
	09/05/2018
	10:54
*/
import java.util.Scanner;

public class Ex9D1 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double tinggiBadan, beratBadan, bmi, inchies, pounds;

		System.out.print( "Your height in inchies: " );
		inchies = keyboard.nextDouble();
		tinggiBadan = inchies*0.0254;

		System.out.print( "Your weight in pounds: " );
 		pounds = keyboard.nextDouble();
 		beratBadan = pounds*0.453592;

		bmi = beratBadan / (tinggiBadan*tinggiBadan);

		System.out.printf( "Your BMI is " + bmi );
	 }
}