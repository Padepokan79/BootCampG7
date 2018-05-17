/*
Creted by	: Yana
Time		: 16 Mei 2018
*/

import java.util.Scanner;

public class PrintedOddNumber{
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		int start, end, angkaAwal;

		System.out.println("Enter Start :");
		start = keyboard.nextInt();
		System.out.println("End Start :");
		end = keyboard.nextInt();
		
		for (angkaAwal = start ; angkaAwal < end ; angkaAwal++) {
			if ( angkaAwal%2==1 ) {
				System.out.println("\n" +angkaAwal);
			}
		}
	}
}

/*
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