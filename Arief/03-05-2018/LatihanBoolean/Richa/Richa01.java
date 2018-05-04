/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Richa01{
	public static void main( String[] args ){
		Scanner inputKey = new Scanner(System.in);
		
		int minBudget, budget, day, minDay, maxDay;
		String name;
		boolean allowed;

		minBudget = 520;
		minDay = 1;
		maxDay = 5;

		
		System.out.println("=============== WELCOME TO TRAVEL CHOICE CLUB ===================");
		System.out.println("Are you able to go Lombok this week? Please fill our form below!");
		System.out.println();

		System.out.print( "What's your name? " );
		name = inputKey.next();

		System.out.print( "How much budget do you have, " + name + "? (in dollar) " );
		budget = inputKey.nextInt();

		System.out.print( "Enter available date you have! (you may only choose 1 day, in number) " );
		day = inputKey.nextInt();

		allowed = (budget >= minBudget && (day >= minDay && day <= maxDay));

		System.out.println("==================================================================");
		System.out.println( "This is your result, " + name + "...." );
		System.out.println( "Are you allowed go to lombok? " + allowed );

	}
}
