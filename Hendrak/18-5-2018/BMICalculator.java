//created by:Hendra Kurniawan 
//Date: 18 Mei 2018 Time:7:50 AM
//Modified by :
import java.util.Scanner;

public class BMICalculator{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi;

		System.out.print("Your height in m  : ");
		m = keyboard.nextDouble();

		System.out.print("Your weight in kg : ");
		kg = keyboard.nextDouble();

		bmi = kg / (m*m);

		System.out.print("Your BMI is " + bmi);
	}
}
