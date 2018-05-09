/*
created by : Malik Chaudhary
time : 09-05-2018 9:05AM
*/
import java.util.Scanner;
public class BooleanExpressions{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		boolean a,b,c,d,e,f;
		double x,y;

		System.out.print("Give me two numbers. First: ");
		x = keyboard.nextDouble();
		System.out.print("Second :");
		y =keyboard.nextDouble();

		a = (x < y); // x kurang dari y
		b = (x <= y); // x kurang dari / sama dengan y
		c = (x == y); // x sama dengan y
		d = (x != y); // x tidak sama dengan y
		e = (x > y); // x lebih besar dari y
		f = (x >= y); // x lebih besar / sama dengan y

		System.out.println(x + "is LESS THAN "+y+": "+a); 
		System.out.println(x + "is LESS THAN / EQUAL TO"+y+": "+b);
		System.out.println(x + "is EQUAL TO "+y+": "+c);
		System.out.println(x + "is NOT EQUAL TO "+y+": "+d);
		System.out.println(x + "is GREATER THAN "+y+": "+e);
		System.out.println(x + "is GREATER THAN / EQUAL TO "+y+": "+f);
		System.out.println();


		System.out.println( !(x < y) + " " + (x >= y) );
		System.out.println( !(x <= y) + " " + (x>y) );
		System.out.println( !(x == y) + " " + (x != y) );
		System.out.println( !(x != y) + " " + (x == y) );
		System.out.println( !(x > y) + " " + (x <= y) );
		System.out.println( !(x >= y) + " " + (x < y) );
	}
}