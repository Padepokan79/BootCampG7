/*
Date Created	: 2 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class BMICalculator{
	public static void main ( String[] args ){
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi;

		System.out.println("Your height in meter: ");
		m = keyboard.nextDouble();

		System.out.println("Your Weight in kg: ");
		kg = keyboard.nextDouble();

		bmi = kg / (m * m);

		System.out.println("Your BMI is: " + bmi);
	}
}