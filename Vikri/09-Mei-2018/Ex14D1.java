// Vikri Ramdhani
// 09/05/2018
// 13:48
import java.util.Scanner;

public class Ex14D1{
	public static void main(String[] args) {
		int age;
		double income, cute, happy;
		boolean allowed, allowed2;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter your age: ");
		age = keyboard.nextInt();

		System.out.println("Enter your yearly income: ");
		income = keyboard.nextInt();

		System.out.println("How cute are you, on a scale from 0.0 to 10.0: ");
		cute = keyboard.nextDouble();

		System.out.println("How happy do you make them? ");
		happy = keyboard.nextDouble();

		allowed2 = (happy > 7.5);
		System.out.println("Are they happy? "+allowed2);

		allowed = ( age > 25 && age < 40 && ( income > 50000 || cute >= 8.5));
		System.out.println("Allowed to date my grandchild? "+allowed);


	}
}