/*
	* Created by:	Alifhar Juliansyah
	* 				02-05-2018	11.03
	* Updated by:
	*
*/

import java.util.Scanner;

public class BMICalculator{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		double tinggi, berat, bmi;

		System.out.print("Your height in m: ");
		tinggi=keyboard.nextDouble();

		System.out.print("Your weight in kg: ");
		berat=keyboard.nextDouble();

		bmi=berat/(tinggi*tinggi);

		System.out.println("Your BMI is "+bmi);
	}
}