/*
Created by	: Yana
Time		: 14 Mei 2018 11.03
*/

import java.util.Scanner;

public class Ex19Drills2{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		double tinggiBadan, beratBadan, bmi;

		System.out.print("Masukkan Tinggi Badan: ");
		tinggiBadan = keyboard.nextDouble();
		System.out.print("Masukkan Berat Badan: ");
		beratBadan = keyboard.nextDouble();

		bmi = beratBadan / (tinggiBadan*tinggiBadan);

		System.out.print("BMI Catergy:");

		if (bmi < 15.0) {
			System.out.println("very severely underweight");
		}
		else if (bmi <= 16.0) {
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
		else if (bmi <40.0) {
			System.out.println("severely obese");
		}
		else {
			System.out.println("very severely/\"morbidly\" obese");
		}
	}
}