/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	14.40
	* Updated by:
	*
*/

import java.util.Scanner;

public class BoolRicha1{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		int budget, hari;
		String nama;
		boolean boleh;

		System.out.println("\n=============== WELCOME TO TRAVEL CHOICE CLUB =================== ");
		System.out.println("Are you able to go Lombok this week? Please fill our form below!");
		System.out.print("\nWhat's your name? ");
		nama=keyboard.next();
		System.out.println("How much budget do you have, "+nama+"? (in dollar)");
		budget=keyboard.nextInt();
		System.out.println("Enter available date you have! (you may only choose 1 day, in number)");
		hari=keyboard.nextInt();
		
		boleh=( budget>520 && hari>=1 && hari<=5 );
		System.out.println("==================================================================");
		System.out.println("This is your result, "+nama+"....");
		System.out.println("Are you allowed go to lombok? "+boleh);
	}
}