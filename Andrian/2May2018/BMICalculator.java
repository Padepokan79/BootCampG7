/* 	Date 		: 2/5/2018    
	Time 		: 10:56:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class BMICalculator {
		public static void main( String[] args ) {
			Scanner keyboard = new Scanner(System.in);
			double tinggi,berat,bmi;

			System.out.print("Your height in m: ");
			tinggi = keyboard.nextDouble();

			System.out.print("Your Weight in kg: ");
			berat = keyboard.nextDouble();

			bmi = berat / (tinggi*tinggi);

			System.out.print("Your BMI is " + bmi);

		}
	}