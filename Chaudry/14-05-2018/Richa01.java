/*
	DATA CREATED 	: 13 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Richa01{
	public static void main(String[] args){
		
		String name;
		int budget, dayFree, dayInput;
		boolean hasil;
		Scanner key = new Scanner(System.in);
		Scanner key2 = new Scanner(System.in);

		System.out.println("=============== WELCOME TO TRAVEL CHOICE CLUB ===========================");
		System.out.println("Are you able to go Lombok this week? Please fill our form below!");
		System.out.println();
		System.out.print("What's your name? ");
		name 	= key2.nextLine();

		System.out.print("How much budget do you have, " + name + "? $");
		budget 	= key.nextInt();

		System.out.print("Enter available date you have! (you may only choose 1 day, in number) ");
		dayInput 	= key.nextInt();
		System.out.println();
		System.out.println("=========================================================================");
		System.out.println("This is your result, " + name + "....");
		
		dayFree = 5; // senin - jumat
		hasil 	= ( budget > 520 && dayInput >= dayFree );

		System.out.println("Are you allowed go to lombok? " + hasil);
		 
	}
}