/*
	DATA CREATED 	: 09 Mei 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;	
public class Ex9Drills1{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		double inch, pound, convertMeter, convertKg, rumusInch, rumusPound, bmi;

		System.out.print("Your height in inchies: ");
		inch = keyboard.nextDouble();

		System.out.print("Your weight in pounds: ");
		pound = keyboard.nextDouble();

		rumusInch 	= 39.370;
		rumusPound 	= 2.2046;
		convertMeter = inch/rumusInch;
		convertKg 	= pound/rumusPound;

		bmi 	= convertKg/(convertMeter*convertMeter);
		System.out.println("Your BMI is " + bmi);
	}
}