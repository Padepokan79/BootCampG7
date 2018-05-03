/*
Date Created	: 2 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Ex9Drills1{
	public static void main ( String[] args ){
		Scanner keyboard = new Scanner(System.in);
		double inch, pound, bmi, kg, m;

		// 1 inch = 0.0254 meter, 1 meter = 39.37007874015748 inch
		// 1 pound = 0.45359237 kg, 1 kg = 2.204622621848776 pound

		System.out.println("Your height in inches: ");
		inch = keyboard.nextDouble();

		System.out.println("Your Weight in pounds: ");
		pound = keyboard.nextDouble();

		kg = pound * 0.45359237;
		m = inch * 0.0254;

		bmi = kg / (m * m);

		System.out.println("Your BMI is: " + bmi);
	}
}