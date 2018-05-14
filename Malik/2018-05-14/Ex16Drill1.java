/*
create by : Malik Chaudhary
time : 14-05-2018 8:59AM
*/

import java.util.Scanner;
public class Ex16Drill1{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double first, second;

		System.out.print("Give me two numbers. First : ");
		first = keyboard.nextDouble();

		System.out.print( "Second: " );
		second = keyboard.nextDouble();

		if ( first < second ) {
			System.out.println( first + " is LESS THAN " + second );
		}
		if ( first <= second ) {
			System.out.println( first + " is LESS THAN/EQUAL TO " + second );
		}
		if ( first == second ) {
			System.out.println( first + " is EQUAL TO " + second );
		}
		if ( first >= second ) {
			System.out.println( first + " is GREATER THAN/EQUAL TO " + second );
		}
		if ( first > second ) {
			System.out.println( first + " is GREATER THAN " + second );
		}
		if ( first != second )
			System.out.println( first + " is NOT EQUAL TO " + second ); // tanpa braces bisa muncul tetapi hanya line pertama
			System.out.println( "Hey." ); // akan muncul walau kondisi terpenuhi, tetap muncul walau kondisi salah
		
	}
}