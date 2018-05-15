/*
Date Created	: 04 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Ex15Drills2 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int age;

		System.out.print("How old are you? ");
		age = keyboard.nextInt();

		System.out.println("You are: ");
		if ( age < 13 ) {
			System.out.println("\ttoo young to create a facebook account");
		}
		if ( age < 16 ) {
			System.out.println("\ttoo young to get a driver license's");
		}
		if ( age < 18 ) {
			System.out.println("\ttoo young to get a tatoo");
		}
		if ( age < 21 ) {
			System.out.println("\ttoo young to drink alcohol");
		}
		if ( age < 35 ) {
			System.out.println("\ttoo young to run for President of the U.S.");
			System.out.println("\t\t(How Sad!)");
		}
		if ( age >= 65 ) {
			System.out.println("\tYou are old enough to retire.");
		}

	}
}