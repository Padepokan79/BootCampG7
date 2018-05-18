//created by:Hendra Kurniawan 
//Date: 18 Mei 2018 Time:8:20 AM
//Modified by :
import java.util.Scanner;

public class Ex9Drills2{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double mInchies,mFeet,mTotal, kg, bmi, inches, pounds,feet;

		System.out.print("Your height (feet only):");
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


		System.out.print("Your BMI is " + bmi);
	}
}
