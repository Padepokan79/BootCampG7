/*
	DATA CREATED 	: 14 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Ex15Drills23{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		int age;

		System.out.println("HOW old are you? ");
		age 	= keyboard.nextInt();

		System.out.println("You are: ");
		if (age < 13) {
			System.out.println("\ttoo young to create a Facebook account");
		}
		if (age < 16) {
			System.out.println("\ttoo young to get a driver's licence");
		}
		if (age < 18) {
			System.out.println("\ttoo young to get a tattoo");
		}
		if (age < 21) {
			System.out.println("\ttoo young to drink alcohol");
		}
		if (age < 35) {
			System.out.println("\ttoo young to run for president of the U.S");
			System.out.println("\t\t(How Sad!)");
		}
		if (age >= 65) {
			System.out.println("\tYou are old enough to retire!");
		}



		if (age >= 13) {
			System.out.println("\told enough to create a Facebook account");
		}
		if (age >= 16) {
			System.out.println("\ttoo young to get a driver's licence");
		}
		if (age >= 18) {
			System.out.println("\ttoo young to get a tattoo");
		}
		if (age >= 21) {
			System.out.println("\ttoo young to drink alcohol");
		}
		if (age >= 35) {
			System.out.println("\ttoo young to run for president of the U.S");
			System.out.println("\t\t(How Sad!)");
		}
	}
}
