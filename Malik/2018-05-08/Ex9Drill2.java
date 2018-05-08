/*
nama : Malik Chaudhary
time : 08-05-2018 3:00PM

*/
import java.util.Scanner;

public class Ex9Drill2{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		double inch, pound, feet, bmi, m, kg, f;

		m = 0.0254;
		kg = 0.453592;
		f = 0.3048;

		System.out.print("Your height (feet) : ");
		feet = keyboard.nextDouble();
		System.out.print("Your height (inch) : ");
		inch = keyboard.nextDouble();



		System.out.print("Your weight (pounds) : ");
		pound = keyboard.nextDouble();

		kg = kg*pound;
		m = (m*inch)+(f*feet);

		bmi = kg / (m*m);

		System.out.println( "Your BMI is " + bmi ); 


	}
}