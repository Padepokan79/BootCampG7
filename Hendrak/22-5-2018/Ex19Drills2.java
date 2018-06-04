//Created by : Hendra Kurniawan
//Date : 20 Mei 2018 Time : 4:20PM
//Modified by :
import java.util.Scanner;

public class Ex19Drills2{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double mInchies,mFeet,mTotal, kg, bmi, inches, pounds,feet;

		System.out.print("Your height (feet only): ");
		feet = keyboard.nextDouble();

		System.out.print("Your height in inches  : ");
		inches = keyboard.nextDouble();

		System.out.print("Your weight in pounds  : ");
		pounds = keyboard.nextDouble();

		mFeet = feet / 3.28084; 
		mInchies = inches /39.3701;
		mTotal = mFeet + mInchies;
		kg = pounds /2.20462;

		bmi = kg / (mTotal*mTotal);

		System.out.print("BMI catagory : " );
		if (bmi < 15.0){
			System.out.println("very severely underweight");
		}
		else if(bmi <= 16.0){
			System.out.println("severely underweight");
		}
		else if(bmi < 18.5){
			System.out.println("underweight");
		}
		else if(bmi < 25.0){
			System.out.println("normal weight");
		}
		else if(bmi < 30.0){
			System.out.println("overweight");
		}
		else if(bmi < 35.0){
			System.out.println("moderately obese");
		}
		else if(bmi < 40.0){
			System.out.println("severely obese");
		}
		else{
			System.out.println("very severely/\"morbidly\" obese");
		}
	}

}