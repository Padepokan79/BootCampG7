/*
Date Created	: 08 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Ex19Drills2{
	public static void main(String[] argd){
		Scanner keyboard = new Scanner(System.in);
		double inch, feet, pound, bmi, kg, m;

		System.out.println("BMI Category");

		// System.out.println("Your height in inches: ");
		System.out.println("Your height in meter: ");
		// inch = keyboard.nextDouble();
		m = keyboard.nextDouble();

		// System.out.println("Your Weight in pounds: ");
		System.out.println("Your Weight in kg: ");
		// pound = keyboard.nextDouble();
		kg = keyboard.nextDouble();

		// kg = pound * 0.45359237;
		// m = inch * 0.0254;

		bmi = kg / (m * m);

		System.out.println("BMI Category: ");
		System.out.printf("Your BMI is: %.2f, and it's categorized as ", bmi);
		if ( bmi < 15.0 ) {
			System.out.print("\"very severly underweight\"");
		}
		else if ( bmi <= 16.0 ) {
			System.out.print("\"severly underweight\"");
		}
		else if ( bmi < 18.5 ) {
			System.out.print("\"underweight\"");
		}
		else if ( bmi < 25.0 ) {
			System.out.print("\"normal weight\"");
		}
		else if ( bmi < 30.0 ) {
			System.out.print("\"overweight\"");
		}
		else if ( bmi < 35.0 ) {
			System.out.print("\"moderatly obese\"");
		}
		else if ( bmi < 40.0 ) {
			System.out.print("\"severly obese\"");
		}
		else {
			System.out.print("\"very severly/\"morbidly\" obese\"");
		}
	}
}