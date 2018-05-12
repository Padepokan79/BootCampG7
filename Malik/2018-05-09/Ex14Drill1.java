/*
created by : Malik Chaudhary
time : 09-05-2018 9:37AM
*/
import java.util.Scanner;
public class Ex14Drill1{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		int age;
		double happy;
		boolean allowed2;

		System.out.print("Enter your age : ");
		age = keyboard.nextInt();

		System.out.print("How happy do you make them, on a scale from 7.0 to 10.0 ? ");
		happy = keyboard.nextDouble();

		allowed2 = ( age > 25 && age < 40 && (happy > 7.0 ));

		System.out.println(" Grandmother2 : "+allowed2);


	}
}