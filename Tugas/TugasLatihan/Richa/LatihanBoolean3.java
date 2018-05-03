/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 10.10 AM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class LatihanBoolean3 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);
		int age;
		Double apparence;
		String gender;
		boolean allowed;

  		System.out.println ();
		System.out.println ("======== WELCOME TO TUJUH SEMBILAN CLUB =======");
		System.out.println ("  Today is Saturday, that means Jomblo Night   ");
		System.out.println ();
		System.out.println ("To enter the club please answer these questions!");
		System.out.println ();

		System.out.println ("What's your gender? (W/M) ");
		gender = keyboard.next ();

		System.out.println ("What's your age? ");
		age = keyboard.nextInt ();

		System.out.println ("What do you think about your apparence? scale 0.0 until 10.0");
		apparence = keyboard.nextDouble ();

		allowed = (age >= 21 && age <=30) && (apparence>=8);

		System.out.println ("You're allowed to enter the club? " + allowed);

	}
}