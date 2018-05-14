/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 14 May 2018 11:08
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex19Drill2{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double height, weight, bmi;

		System.out.print("Enter Your Height in meter : ");
		height = keyboard.nextDouble();
		System.out.print("Enter Your Weight in kg : ");
		weight = keyboard.nextDouble();

		bmi = weight /(height*height);

		System.out.printf("Your BMI is : %.2f",bmi);
		System.out.print("\nBMI Category : ");
		if (bmi < 15.0) {
			System.out.println("very severely underweight");
		}
		else if ( bmi <= 16.0) {
			System.out.println("severely underweight");
		}
		else if (bmi < 18.5) {
			System.out.println("underweight");
		}
		else if (bmi < 25.0) {
			System.out.println("normal weight");
		}
		else if (bmi < 30.0) {
			System.out.println("overweight");
		}
		else if (bmi < 35.0) {
			System.out.println("moderately obese");
		}
		else if (bmi < 40.0) {
			System.out.println("severely obese");
		}
		else {
			System.out.println("very severely/\"morbidly\" obese");
		}
	}
}