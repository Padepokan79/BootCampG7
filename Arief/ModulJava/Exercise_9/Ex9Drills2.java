/*
Date Created	: 2 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Ex9Drills2{
	public static void main ( String[] args ){
		Scanner keyboard = new Scanner(System.in);
		double inch, feet, pound, bmi, kg, m;

		// 1 feet = 0.3048 meter, 1 meter = 3.280839895013123
		// 1 inch = 0.0254, 1 meter = 39.37007874015748
		// 1 pound = 0.45359237, 1 kg = 2.204622621848776

		System.out.println("Your height in (feet only): ");
		feet = keyboard.nextDouble();

		System.out.println("Your height in (inches only): ");
		inch = keyboard.nextDouble();

		System.out.println("Your Weight in pounds: ");
		pound = keyboard.nextDouble();

		kg = pound * 0.45359237;
		m = (inch * 0.0254) + (feet * 0.3048) ;

		bmi = kg / (m * m);

		System.out.println("Your BMI is: " + bmi);
	}
}