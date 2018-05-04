/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 10.52 AM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class RichaBoolean1 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);
		String name;
		double budget, date;
		boolean destination;

  		System.out.println ();
		System.out.println ("=============== WELCOME TO TRAVEL CHOICE CLUB ===================");
		System.out.println (" Are you able to go Lombok this week? Please fill our form below!");
		System.out.println ();
		System.out.println ();

		System.out.print ("What's your name? ");
		name = keyboard.next ();

		System.out.println ("How much budget do you have " + name + " ? (in dollar)");
		budget = keyboard.nextDouble ();

		System.out.println ("Enter available date you have! (you may only choose 1 day, in number)");
		date = keyboard.nextDouble ();

		destination = (budget>520 && (date >= 1 && date <= 5));
		System.out.println ();
		System.out.println ("==================================================================");
		System.out.println ("This is your result, " + name + "....");
		System.out.println ("Are you allowed go to lombok? " + destination);
	}
}