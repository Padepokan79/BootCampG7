/* 
Created by  		: Richa Fitria
Date/hour			: 2 Mei 2018/ 11.20 AM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;

public class Ex9Drills2 {
	public static void main (String [] args){
		Scanner keyboard = new Scanner(System.in);

		double height, weight, bmi, inches, pounds, feet;

		System.out.print ("Your height in feet only: " );
		feet = keyboard.nextDouble ();

		System.out.print ("Your height in inches: " );
		inches = keyboard.nextDouble ();
		System.out.print ("Your weight in pounds: " );
		pounds = keyboard.nextDouble ();

		height = 0.0254*inches + 0.3048* feet;

		weight = 0.453592*pounds;

		bmi = weight / (height*height);

		System.out.println ("Your BMI is " + bmi);
	}
}