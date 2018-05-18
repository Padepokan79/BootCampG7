//created by:Hendra Kurniawan 
//Date: 18 Mei 2018 Time:7:50 AM
//Modified by :
import java.util.Scanner;

public class Ex9Drills1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi, inches, pounds;

		System.out.print("Your height in inches  : ");
		inches = keyboard.nextDouble();

		System.out.print("Your weight in pounds  : ");
		pounds = keyboard.nextDouble();

		m = inches /39.3701;
		kg = pounds /2.20462;

		bmi = kg / (m*m);



		System.out.print("Your BMI is " + bmi);
	}
}
