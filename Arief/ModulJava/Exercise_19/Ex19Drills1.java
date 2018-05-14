/*
Date Created	: 08 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Ex19Drills1{
	public static void main(String[] argd){
		Scanner keyboard = new Scanner(System.in);
		double bmi;

		System.out.print("Enter your BMI: ");
		bmi = keyboard.nextDouble();

		System.out.print("BMI Category: ");
		if ( bmi < 15.0 ) {
			System.out.print("very severly underweight");
		}
		else if ( bmi <= 16.0 ) {
			System.out.print("severly underweight");
		}
		else if ( bmi < 18.5 ) {
			System.out.print("underweight");
		}
		if ( bmi < 25.0 ) {
			System.out.print("normal weight");
		}
		else if ( bmi < 30.0 ) {
			System.out.print("overweight");
		}
		else if ( bmi < 35.0 ) {
			System.out.print("moderatly obese");
		}
		else if ( bmi < 40.0 ) {
			System.out.print("severly obese");
		}
		else {
			System.out.print("very severly/\"morbidly\" obese");
		}
	}
}