/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 9.13 AM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class Ex14Drills3 {
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

		allowed = age < 30 && age >= 17 && income >5000000 && cute >= 8.0;

		System.out.println ("Allowed to date my grandchild? " + allowed);
	}
}