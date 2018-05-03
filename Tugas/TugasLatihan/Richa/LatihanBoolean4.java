/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 10.18 AM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class LatihanBoolean4 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);
		int age;
		Double apparence;
		String gender;
		boolean allowed, woman, man;

  		System.out.println ();
		System.out.println ("======== WELCOME TO TUJUH SEMBILAN CLUB =======");
		System.out.println ("  Today is Tuesday, that means Brondong Night  ");
		System.out.println ();
		System.out.println ("To enter the club please answer these questions!");
		System.out.println ();

		System.out.println ("What's your gender? (W/M) ");
		gender = keyboard.next ();

		System.out.println ("What's your age? ");
		age = keyboard.nextInt ();

		System.out.println ("What do you think about your apparence? scale 0.0 until 10.0");
		apparence = keyboard.nextDouble ();

		woman = gender.equals ("W");
		man = gender.equals ("M");

		allowed = (woman && (age >= 30 && age <=45) && (apparence>=8)) || (man && (age >= 20 && age <=25) && (apparence <8));

		System.out.println ("You're allowed to enter the club? " + allowed);
	}
}