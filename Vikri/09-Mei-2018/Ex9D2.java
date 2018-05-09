/*
	Created By vikri
	09/05/2018
	11:10
*/
import java.util.Scanner;

public class Ex9D2 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double tinggiBadan, beratBadan, bmi, inchies, pounds, feet, tinggiBadan2, tinggiBadan3;

		System.out.print( "Your height in feet: " );
		feet = keyboard.nextDouble();
		tinggiBadan = feet*0.3048;

		System.out.print( "Your height in inchies: " );
		inchies = keyboard.nextDouble();
		tinggiBadan2 = inchies*0.0254;

		System.out.print( "Your weight in pounds: " );
 		pounds = keyboard.nextDouble();
 		beratBadan = pounds*0.453592;

 		tinggiBadan3 = tinggiBadan+tinggiBadan2;
		bmi = beratBadan / (tinggiBadan3*tinggiBadan3);

		System.out.printf( "Your BMI is " + bmi );
	 }
}