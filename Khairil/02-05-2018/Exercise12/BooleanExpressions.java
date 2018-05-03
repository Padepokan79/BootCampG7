/*
     Creator     : Khairil
     Created At  : 2 Mei 2018 15:55 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class BooleanExpressions {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean a, b, c, d, e, f;
		double x, y;

		System.out.println( "Give me two numbers. First: " );
		x = keyboard.nextDouble();
		System.out.println( "Second:" );
		y = keyboard.nextDouble();

		a = (x <  y);
		// x is LESS THAN y
		b = (x <= y);
		// x is LESS THAN / EQUAL TO y		
		c = (x == y);
		// x is EQUAL TO y
		d = (x != y);
		// x is NOT EQUAL TO y
		e = (x >  y);
		// x is GREATER THAN y
		f = (x >= y);
		// x is GREATER THAN / EQUAL TO y

		System.out.println( x + " is LESS THAN " +  y + ": " + a);
		System.out.println( x + " is LESS THAN / EQUAL TO " + y + ": " + b);
		System.out.println( x + " is EQUAL TO " +  y + ": " + c);
		System.out.println( x + " is NOT EQUAL TO " + y + ": " + d);		
		System.out.println( x + " is GREATER THAN " + y + ": " + e);		
		System.out.println( x + " is GREATER THAN / EQUAL TO " + y + ": " + f);
		System.out.println();

		System.out.println( !(x < y) + " " + (x >= y) );		
		System.out.println( !(x <= y) + " " + (x > y) );		
		System.out.println( !(x == y) + " " + (x != y) );		
		System.out.println( !(x != y) + " " + (x == y) );		
		System.out.println( !(x > y) + " " + (x <= y) );		
		System.out.println( !(x >= y) + " " + (x < y) );		
	}
}