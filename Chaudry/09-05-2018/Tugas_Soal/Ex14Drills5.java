/*
	DATA CREATED 	: 09 Mei 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Ex14Drills5{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int age;
		String gender;
		double cute;
		boolean status;

		System.out.print("Enter your age: " );
		age 	= keyboard.nextInt();

		System.out.print("Enter your gender: " );
		gender 	= keyboard.next();

		System.out.print("How cute are you, on a scale from 0.0 to 10.0?: " );
		cute 	= keyboard.nextDouble();

		System.out.println();
		System.out.println("Hari Sabtu, Jomblo Night");

		status 	= ( (gender.equals("cewek") || gender.equals("cowok") ) && age >= 21 && age <= 30 && cute >= 8.0);
		System.out.println("Anda boleh masuk " + status);

	}
}