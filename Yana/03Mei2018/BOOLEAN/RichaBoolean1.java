/*
Create by	: Yana
Time 		: 3 Mei 2018 13.22
Update by	:
*/

import java.util.Scanner;

public class RichaBoolean1{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		int		hari;
		String	nama;
		double	uang;
		boolean hasil;


		System.out.println("================ WELCOME TO TRAVEL CHOICE CLUB ==================");
		System.out.println("Are you able to go Lombok this week? Please fill our from below!");
		System.out.println();
		System.out.print("What's your name?");
		nama	= keyboard.next();
		System.out.print("How much budget do you have, " +nama+"? ");
		uang	= keyboard.nextDouble();
		System.out.print("Enter available day you have!");
		hari	= keyboard.nextInt();
		System.out.println();

		hasil	= ( uang > 520 && hari >= 1 && hari <= 5 );

		System.out.println("=================================================================");
		System.out.println("This you result, " +nama);
		System.out.println("Are you allowed go to Lombok? " +hasil);

	}
}