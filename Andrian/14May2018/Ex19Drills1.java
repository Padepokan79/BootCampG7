/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class Ex19Drills1 {
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
			// if you remove the "else" then computer will print 2 condition if the bmi under <25, it's like that line no longer care about the line before it, but if you put bmi>25 the result will be normal again..
			if ( bmi < 25.0 ) {
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