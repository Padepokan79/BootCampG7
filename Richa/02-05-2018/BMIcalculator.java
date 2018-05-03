/* 
Created by  		: Richa Fitria
Date/hour			: 2 Mei 2018/ 11.05 AM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;

public class BMIcalculator{
	public static void main (String [] args){
		Scanner keyboard = new Scanner(System.in);

		double height, weight, bmi;

		System.out.print ("Your height in m: " );
		height = keyboard.nextDouble ();

		System.out.print ("Your weight in kg: " );
		weight = keyboard.nextDouble ();

		bmi = weight / (height*height);

		System.out.println ("Your BMI is " + bmi);
	}
}