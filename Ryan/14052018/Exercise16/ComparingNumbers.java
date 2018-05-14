/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 14 Mei 2018 08:54  
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class ComparingNumbers{
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		double first, second;

		System.out.print("Give me two numbers. First: ");
		first = keyboard.nextDouble();

		System.out.print("Second: ");
		second = keyboard.nextDouble();

		if ( first < second ) {
			System.out.println(first + " is LESS THAN "+second);
		}
		if ( first <= second ) {
			System.out.println(first + " is LESS THAN/EQUAL TO "+second);
		}
		if ( first == second ) {
			System.out.println(first + " is EQUAL TO "+second);
		}
		if ( first >= second ) {
			System.out.println(first + " is GREATHER THAN/EQUAL TO "+second);
		}
		if ( first > second ) {
			System.out.println(first + " is GREATHER THAN "+second);
		}
		if ( first != second )
			System.out.println(first + " is NOT EQUAL TO "+second);
	}
}
