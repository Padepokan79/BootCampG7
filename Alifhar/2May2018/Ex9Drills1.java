/*
	* Created by:	Alifhar Juliansyah
	* 				02-05-2018	11.08
	* Updated by:
	*
*/

import java.util.Scanner;

public class Ex9Drills1{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		double tinggi, berat, tinggiInchi, beratPound, bmi;

		System.out.print("Your height in inches: ");
		tinggiInchi=keyboard.nextDouble();

		System.out.print("Your weight in pounds: ");
		beratPound=keyboard.nextDouble();

		tinggi=0.0254*tinggiInchi;
		berat=0.453592*beratPound;
		bmi=berat/(tinggi*tinggi);

		System.out.println("Your BMI is "+bmi);
	}
}