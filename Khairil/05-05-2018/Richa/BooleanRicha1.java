/*
	 Program     : Boolean Richa 1 / Allowing to Lombok
     Creator     : Khairil
     Created At  : 3 Mei 2018 19:25 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class BooleanRicha1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String inputName;
		int inputBudget, budgetMin, inputDay, mon, tue, wed, thu, fri, sat, sun;
		boolean allowLombok;

		System.out.println( "=============== WELCOME TO TRAVEL CHOICE CLUB ===================" );
		System.out.println( "Are you able to go Lombok this week? Please fill our form below! " );
		System.out.print( "What's your name ?  " );
		inputName = keyboard.next();

		System.out.print( "How much budget do you have, " + inputName + "?  $" );
		inputBudget = keyboard.nextInt();

		System.out.print( "Enter available date you have! (you may only choose 1 day, in number)  " );
		inputDay = keyboard.nextInt();

		System.out.println( "=================================================================" );

		budgetMin = 520;
		mon = 1;
		tue = 2;
		wed = 3;
		thu = 4;
		fri = 5;
		sat = 6;
		sun = 7;

		allowLombok = ( inputBudget >= budgetMin && ( inputDay == mon || inputDay == tue || inputDay == wed || inputDay == thu || inputDay == fri ) && (inputDay != sat || inputDay != sun ) );

		System.out.println( "This is your result, " + inputName + "...." );
		System.out.println( "Are you allowed go to lombok? " + allowLombok );		
	}
}