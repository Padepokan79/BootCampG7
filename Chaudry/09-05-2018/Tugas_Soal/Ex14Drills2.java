/*
	DATA CREATED 	: 09 Mei 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;	
public class Ex14Drills2{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int age;
		double income, cute;
		boolean kakek, ibu, ayah;

		System.out.print("Enter your age or diff: " );
		age 	= keyboard.nextInt();

		System.out.print("Enter your yearly income: " );
		income 	= keyboard.nextDouble();

		System.out.print("How cute are you, on a scale from 0.0 to 10.0?: " );
		cute 	= keyboard.nextDouble();

		kakek 	= (age >= 30 && income >= 5000000 );
		System.out.println("Allowed to date my grandchild kakek: " + kakek );

		ibu 	= (age >= 17 && age < 30 && income >= 5000000 && cute >= 8.0 );
		System.out.println("Allowed to date my grandchild Ibu: " + ibu );

		ayah 	= (age <= 5 && (income >= 5000000 || cute >= 8.0) );
		System.out.println("Allowed to date my grandchild ayah: " + ayah );
	}
}
