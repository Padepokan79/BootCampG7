// Vikri Ramdhani
// 09/05/2018
// 13:37
import java.util.Scanner;

public class ShallowGrandmother{
	public static void main(String[] args) {
		int age;
		double income, cute;
		boolean allowed;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter your age: ");
		age = keyboard.nextInt();

		System.out.println("Enter your yearly income: ");
		income = keyboard.nextInt();

		System.out.println("How cute are you, on a scale from 0.0 to 10.0: ");
		cute = keyboard.nextDouble();

		allowed = ( age > 25 && age < 40 && ( income > 50000 || cute >= 8.5));
		System.out.println("Allowed to date my grandchild? "+allowed);
	}
}