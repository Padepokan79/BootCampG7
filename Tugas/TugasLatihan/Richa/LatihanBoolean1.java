/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 9.37 AM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class LatihanBoolean1 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);
		int age;
		String gender;
		boolean allowed, yep;

  		System.out.println ();
		System.out.println ("======== WELCOME TO TUJUH SEMBILAN CLUB =======");
		System.out.println ("  Today is Thursday, that means Ladies Night   ");
		System.out.println ();
		System.out.println ("To enter the club please answer these questions!");
		System.out.println ();

		System.out.println ("What's your gender? (W/M) ");
		gender = keyboard.next ();

		System.out.println ("What's your age? ");
		age = keyboard.nextInt ();

		yep = gender.equals("W");

		allowed = (age >= 21 && age <=30) && yep;

		System.out.println ("You're allowed to enter the club? " + allowed);

	}
}
