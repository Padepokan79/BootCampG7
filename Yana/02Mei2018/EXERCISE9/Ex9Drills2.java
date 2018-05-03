/*
Create by	: Yana
Time 		: 2 Mei 2018 11.27
Update by	:
*/

import java.util.Scanner;

public class Ex9Drills2{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		double tinggiBadan, tinggiBadanFeet, tinggiBadanInch, beratBadan, bmi, kakiKeMeter, inchiKeMeter, poundToKg;

		kakiKeMeter	= 0.3048;
		inchiKeMeter= 0.0254;
		poundToKg	= 0.453592;

		System.out.print("Your height in feet: ");
		tinggiBadanFeet = keyboard.nextDouble();

		tinggiBadanFeet = tinggiBadanFeet * kakiKeMeter;


		System.out.print("Your height in inch: ");
		tinggiBadanInch = keyboard.nextDouble();

		tinggiBadanInch = tinggiBadanInch * inchiKeMeter;

		tinggiBadan 	= tinggiBadanFeet + tinggiBadanInch;


		System.out.print("Your weight in Pound: ");
		beratBadan 	= keyboard.nextDouble();		

		beratBadan	= beratBadan * poundToKg;

		bmi = beratBadan / (tinggiBadan*tinggiBadan);
		

		System.out.print("Your BMI is: " +bmi);	
	}
}