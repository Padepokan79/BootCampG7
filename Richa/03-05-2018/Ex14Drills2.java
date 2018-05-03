/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 9.09 AM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class Ex14Drills2 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);

		int age;
		double income, cute;
		boolean allowed;

		System.out.print ("Enter your age: ");
		age = keyboard.nextInt ();

		System.out.print ("How cute are you, on a scale from 0.0 to 10.0? ");
		cute = keyboard.nextDouble ();

		System.out.print ("Enter your yearly income: ");
		income = keyboard.nextDouble ();

		allowed = (age > 30 && income >5000000);

		System.out.println ("Allowed to date my grandchild? " + allowed);
	}
}