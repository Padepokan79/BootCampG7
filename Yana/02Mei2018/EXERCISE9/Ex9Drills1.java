/*
Create by	: Yana
Time 		: 2 Mei 2018 11.09
Update by	:
*/

import java.util.Scanner;

public class Ex9Drills1{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		double tinggiBadan, beratBadan, bmi, inchToMeter, poundToKg;

		inchToMeter	= 0.0254;
		poundToKg	= 0.453592;

		System.out.print("Your height in inch: ");
		tinggiBadan = keyboard.nextDouble();

		tinggiBadan = tinggiBadan * inchToMeter;

		System.out.print("Your weight in Pound: ");
		beratBadan 	= keyboard.nextDouble();		

		beratBadan	= beratBadan * poundToKg;

		bmi = beratBadan / (tinggiBadan*tinggiBadan);

		System.out.print("Your BMI is: " +bmi);	
	}
}