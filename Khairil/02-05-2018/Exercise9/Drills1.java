/*
     Creator     : Khairil
     Created At  : 2 Mei 2018 11:05 AM     
     Updated By  : 
     Update Date : 
*/

import java.util.Scanner;

public class Drills1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double height, weight, bmi, inches, pounds;

		System.out.println("Your height in inches: ");
		inches = keyboard.nextDouble();

		System.out.println("Your weight in pounds: ");
		pounds = keyboard.nextDouble();

		height = inches * 0.0254;
		weight = pounds * 0.453592;

		bmi = weight / (height*height);

		System.out.println("Your BMI is " + bmi);
	}
}