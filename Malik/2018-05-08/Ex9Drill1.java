/*
nama : Malik Chaudhary
time : 08-05-2018 2:46PM

*/
import java.util.Scanner;

public class Ex9Drill1{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		double inch, pound, bmi, m, kg;

		m = 0.0254;
		kg = 0.453592;

		System.out.print("Your height (inches) : ");
		inch = keyboard.nextDouble();


		System.out.print("Your weight (pounds) : ");
		pound = keyboard.nextDouble();

		kg = kg*pound;
		m = m*inch;

		bmi = kg / (m*m);

		System.out.println( "Your BMI is " + bmi ); 


	}
}