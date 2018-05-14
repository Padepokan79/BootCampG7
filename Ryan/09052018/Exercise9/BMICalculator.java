/*
     * BMI Calculator
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At : 09 May 2018 08:49
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class BMICalculator{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double m, kg, bmi;

		System.out.print("Your height in m :");
		m = keyboard.nextDouble();

		System.out.print("Your weight in kg :");
		kg = keyboard.nextDouble();

		bmi = kg/(m*m);

		System.out.println("Your BMI is "+bmi);
	}
}