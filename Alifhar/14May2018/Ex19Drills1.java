/*
	* Created by:	Alifhar Juliansyah
	* 				14-05-2018	11.02
	* Updated by:
	*
*/
import java.util.Scanner;

public class Ex19Drills1{
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		double bmi;

		System.out.println("Enter your BMI: ");
		bmi=keyboard.nextDouble();

		System.out.println("BMI Category: ");
		if(bmi<15.0){
			System.out.println("very severely underweight");
		}
		else if(bmi<=16.0){
			System.out.println("severely underweight");
		}
		else if(bmi<18.5){
			System.out.println("underweight");
		}
		if(bmi<25.0){
			System.out.println("normal weight");
		}
		else if(bmi<30.0){
			System.out.println("overweight");
		}
		else if(bmi<35.0){
			System.out.println("moderately obese");
		}
		else if(bmi<40.0){
			System.out.println("severely obese");
		}
		else{
			System.out.println("very severely/\"morbidly\" obese");
		}
	}
}
//it's mean "if(bmi<25.0)" will be stand-alone.
//so when we type 15.5, it means  bmi < 25.0 will be true and print "normal weight"
//however it is also print underweight, because bmi <= 16 is true