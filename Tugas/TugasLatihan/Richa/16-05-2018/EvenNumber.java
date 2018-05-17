/* 
Created by  		: Richa Fitria
Date/hour			: 16 Mei 2018/ 2.01 AM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;

public class EvenNumber {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	int start, end, hasil;

	System.out.print("Enter Start: ");
	start = keyboard.nextInt ();

	System.out.print("End Start: ");
	end = keyboard.nextInt ();

	System.out.println("Result");

	for (hasil = start; hasil <= end; hasil+=1) {
		if (hasil%2 == 0)
		System.out.println(hasil);
	}
}
}