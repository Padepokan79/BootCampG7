/*
     Creator     : Khairil
     Created At  : 2 Mei 2018 11:05 AM     
     Updated By  : 
     Update Date : 
*/

import java.util.Scanner;

public class Drills2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double bmi, height, weight, inches, pounds, feets;

		System.out.println("Your height in feets: ");
		feets = keyboard.nextDouble();

		System.out.println("Your height in inches: ");
		inches = keyboard.nextDouble();

		System.out.println("Your weight in pounds: ");
		pounds = keyboard.nextDouble();

		weight = pounds * 0.453592;
		height = (feets * 0.3048) + (inches * 0.0254);

		bmi = weight / (height*height);

		System.out.println("Your BMI is " + bmi);
	}
}