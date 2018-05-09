/*
     * BMI Calculator
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At : 09 May 2018 08:56
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex9Drill1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double i, pounds, m, kg, bmi;

		System.out.print("Your height in Inches :");
		i = keyboard.nextDouble();

		//1 inches 0,0254m

		m= i*0.0254;

		System.out.print("Your weight in pounds :");
		pounds = keyboard.nextDouble();

		//1 Pound 0,45359237kg
		kg = pounds*0.45359237;

		bmi = kg/(m*m);


		System.out.printf("\nYour BMI is %.5f",bmi);
	}
}