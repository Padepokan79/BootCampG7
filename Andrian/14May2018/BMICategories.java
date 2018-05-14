/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class BMICategories {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			double bmi;

			System.out.println("Enter yor BMI: ");
			bmi = key.nextDouble();

			System.out.println("BMI categori: ");
			if ( bmi < 15.0 ){
				System.out.println("very severely underweight");
			}
			else if ( bmi <= 16.0 ) {
				System.out.println("saverely underweight");
			}
			else if ( bmi < 18.5 ) {
				System.out.println("underweight");
			}
			else if ( bmi < 25.0 ) {
				System.out.println("normal weight");
			}
			else if ( bmi < 30.0 ) {
				System.out.println("overweight");
			}
			else if ( bmi < 36.0 ) {
				System.out.println("moradately obese");
			}
			else if ( bmi < 40.0 ) {
				System.out.println("saverely obese");
			}
			else {
				System.out.println("very saverely/\"morbidy\" obese");
			}
			
		}
	}