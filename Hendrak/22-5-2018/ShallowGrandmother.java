//created by:Hendra Kurniawan 
//Date: 18 Mei 2018 Time:2:13 AM
//Modified by :
import java.util.Scanner;

public class ShallowGrandmother {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int age;
		double income, cute;
		boolean allowed;

		System.out.print( "Enter your age : ");
		age = keyboard.nextInt();

		System.out.print( "Enter your yearly income : ");
		income = keyboard.nextDouble();

		System.out.print( "How cute are you, on a scale from 0.0 to 10.0? " );
		cute = keyboard.nextDouble();

		allowed = (age > 25 && age < 40 && (income > 50000 || cute >= 8.5) );

		System.out.println( "Allowed to date my grandchild?" + allowed);
	}

}