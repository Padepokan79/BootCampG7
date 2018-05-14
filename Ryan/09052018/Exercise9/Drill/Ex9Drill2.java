/*
     * BMI Calculator
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At : 09 May 2018 09:10
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex9Drill2{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double inches, feet, pounds, m, kg, bmi;

		System.out.print("Your height (Feet Only) :");
		feet = keyboard.nextDouble();
		System.out.print("Your height (Inches Only) :");
		inches = keyboard.nextDouble();

		//1 inches 0,0254m
		//1 feet 0,3048m

		m= (inches*0.0254) + (feet*0.3048);

		System.out.print("Your weight in pounds :");
		pounds = keyboard.nextDouble();

		//1 Pound 0,45359237kg
		kg = pounds*0.45359237;

		bmi = kg/(m*m);


		System.out.printf("\nYour BMI is %.5f",bmi);
	}
}