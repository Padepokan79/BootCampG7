/* 
Created by  		: Richa Fitria
Date/hour			: 2 Mei 2018/ 10.19 AM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;

public class ExDrills1dan2 {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner (System.in);

		System.out.println (" What city is the capital of France?");
		keyboard.next ();

		System.out.println ("What is 6 multipled by 7?");
		keyboard.nextInt ();

		System.out.println ("Enter a number between 0.00 and 1.0.");
		keyboard.nextDouble ();

		System.out.println ("is there anything else would like to say?");
		keyboard.next ();
	}
}
