/* 
Created by  		: Richa Fitria
Date/hour			: 16 Mei 2018/ 1.47 AM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;

public class OddNumber {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	int start, end, hasil;

	System.out.print("Enter Start: ");
	start = keyboard.nextInt ();

	System.out.print("End Start: ");
	end = keyboard.nextInt ();

	System.out.println("Result");

	for (hasil = start; hasil <= end; hasil+=1) {
		if (hasil%2 == 1)
		System.out.println(hasil);
	}
}
}

/*

SOAL!!!!!!!!!!
Make a program for user who want printed odd number.

Enter Start :
2

End Start :
10

Result 
3
5
7
9 
*/