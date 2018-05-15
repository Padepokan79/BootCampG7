/*
	 Program     : Exercise 16 - Comparing Numbers
     Creator     : Khairil
     Created At  : 14 Mei 2018 08:55 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class ComparingNumbers {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double first, second;

		System.out.print( "Give me to numbers. First: " );
		first = keyboard.nextDouble();
		System.out.print( "Second: " );
		second = keyboard.nextDouble();

		if( first < second ) {
			System.out.println( first + " is LESS THAN " + second );
		}
		if( first <= second ) {
			System.out.println( first + " is LESS THAN/EQUAL TO " + second );
		}
		if( first == second ) {
			System.out.println( first + " is EQUAL TO " + second );
		}
		if( first >= second ) {
			System.out.println( first + " is GREATER THAN/EQUAL TO " + second );
		}
		if( first > second ) {
			System.out.println( first + " is GREATER THAN " + second );
		}
		if( first != second ) 
			System.out.println( first + " is NOT EQUAL TO " + second );
}