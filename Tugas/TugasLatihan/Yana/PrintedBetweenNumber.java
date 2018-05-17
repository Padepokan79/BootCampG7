/*
Creted by	: Yana
Time		: 16 Mei 2018
*/

import java.util.Scanner;

public class PrintedBetweenNumber{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int start, end, angkaAwal;

		System.out.println("Enter Start :");
		start = keyboard.nextInt();
		System.out.println("End Start :");
		end = keyboard.nextInt();
		
		for (angkaAwal = start ; angkaAwal <= end ; angkaAwal++) {
				System.out.print("\n" +angkaAwal);
		}
	}
}
/*
Write a program that asks the user for a starting value and an ending value and then writes all the integers (inclusive) between those two values.

Enter Start:
5
Enter End:
9

5
6
7
8
9
*/