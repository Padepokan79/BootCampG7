/*
Create by	: Yana
Time 		: 2 Mei 2018 18.25
Update by	:
*/

import java.util.Scanner;

public class Ex12Drills1{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		boolean a, b, c, d, e, f;
		double	x, y;

		System.out.print("Give me twonumbers. First: ");
		x = keyboard.nextDouble();

		System.out.print("Second: ");
		y = keyboard.nextDouble();

		a = (x < y);
		b = (x <= y);
		c = (x == y);
		d = (x != y);
		e = (x > y);
		f = (x >= y);

		System.out.println( x+ " is LESS THAN " +y+ ": " +a);
		System.out.println( x+ " is LESS THAN / EQUAL TO " +y+ ": " +b);
		System.out.println( x+ " is EQUAL TO " +y+ ": " +c);
		System.out.println( x+ " is NOT EQUAL TO " +y+ ": " +d);
		System.out.println( x+ " is GREATER THAN " +y+ ": " +e);
		System.out.println( x+ " is GREATER THAN / EQUAL TO " +y+ ": " +f);
		System.out.println();

		System.out.println( !(x < y) +" "+ (x >= y));
		System.out.println( !(x <= y) +" "+ (x > y));
		System.out.println( !(x == y) +" "+ (x != y));
		System.out.println( !(x != y) +" "+ (x == y));
		System.out.println( !(x > y) +" "+ (x <= y));
		System.out.println( !(x > y) +" "+ (x < y));

		// < 	: LESS THAN
		// >	: GREATER THAN
		// <= 	: LESS THAN / EQUAL TO
		// >= 	: GREATER THAN / EQUAL TO
		// ==	: EQUAL TO
		// != 	: NOT EQUAL TO
	}
}