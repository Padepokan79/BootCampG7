/*
	DATA CREATED 	: 09 Mei 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;	
public class Ex9Drills2{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		double feet, inch, pound, convertMeter, jmlInch, convertFeet, convertKg, rumusFeet, rumusInch, rumusPound, bmi;

		System.out.print("Your height (feet only): ");
		feet = keyboard.nextDouble();

		System.out.print("Your height (inchies): ");
		inch = keyboard.nextDouble();

		System.out.print("Your weight in pounds: ");
		pound = keyboard.nextDouble();

		rumusFeet 	= 12.000;
		rumusInch 	= 39.370;
		rumusPound 	= 2.2046;

		convertFeet  = feet*rumusFeet; // konversi ke inchies 

		jmlInch 	 = convertFeet + inch; // jumlah inchies
		convertMeter = jmlInch/rumusInch;
		convertKg 	 = pound/rumusPound;

		bmi 	= convertKg/(convertMeter*convertMeter);
		System.out.println("Your BMI is " + bmi);
	}
}