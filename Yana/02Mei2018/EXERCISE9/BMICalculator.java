/*
Create by	: Yana
Time 		: 2 Mei 2018 11.09
Update by	:
*/

import java.util.Scanner;

public class BMICalculator{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		double tinggiBadan, beratBadan, bmi;

		System.out.print("Your height in meter: ");
		tinggiBadan = keyboard.nextDouble();

		System.out.print("Your weight in kg: ");
		beratBadan = keyboard.nextDouble();		

		bmi = beratBadan / (tinggiBadan*tinggiBadan);

		System.out.print("Your BMI is: " +bmi);	
	}
}