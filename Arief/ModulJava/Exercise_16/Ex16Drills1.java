/*
Date Created	: 04 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Ex16Drills1 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double first, second;

		System.out.print("Give me two numbers. First: ");
		first = keyboard.nextDouble();

		System.out.print("Second: ");
		second = keyboard.nextDouble();

		if ( first < second ) {
			System.out.println(first + " is LESS THAN " + second);
		}
		if ( first <= second ) {
			System.out.println(first + " is LESS THAN / EQUAL TO " + second);
		}
		if ( first == second ) {
			System.out.println(first + " is EQUAL TO " + second);
		}
		if ( first >= second ) {
			System.out.println(first + " is GREATER THAN / EQUAL TO " + second);
		}
		if ( first > second ) {
			System.out.println(first + " is GREATER THAN " + second);
		}
		if ( first != second ) 
			System.out.println(first + " is NOT EQUAL TO " + second);
			System.out.print("Hey.");
	}
}