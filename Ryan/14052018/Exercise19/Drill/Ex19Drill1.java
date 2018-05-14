/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 14 May 2018 11:05 
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex19Drill1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double bmi;

		System.out.println("Enter Your BMI : ");
		bmi = keyboard.nextDouble();

		System.out.print("BMI Category : ");
		if (bmi < 15.0) {
			System.out.println("very severely underweight");
		}
		else if ( bmi <= 16.0) {
			System.out.println("severely underweight");
		}
		else if (bmi < 18.5) {
			System.out.println("underweight");
		}
		if (bmi < 25.0) {
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

//Ketika line 21 else nya dihapus otomatis akan ada 2 if nah if yang sebelumnya itu diacuhkan.