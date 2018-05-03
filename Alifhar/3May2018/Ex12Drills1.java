/*
	* Created by:	Alifhar Juliansyah
	* 				02-05-2018	21.46
	* Updated by:
	*
*/

import java.util.Scanner;

public class Ex12Drills1{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		boolean a, b, c, d, e, f;
		double x, y;

		System.out.print("Give me two numbers. Frist: ");
		x=keyboard.nextDouble();
		System.out.print("Second: ");
		y=keyboard.nextDouble();

		a=(x<y);
		b=(x<=y);
		c=(x==y);
		d=(x!=y);
		e=(x>y);
		f=(x>=y);

		System.out.println(x+" is LESS THAN "+y+": "+a);
		System.out.println(x+" is LESS THAN / EQUAL TO "+y+": "+b);
		System.out.println(x+" is EQUAL "+y+": "+c);
		System.out.println(x+" is NOT EQUAL "+y+": "+d);
		System.out.println(x+" is GREATER THAN "+y+": "+e);
		System.out.println(x+" is GREATER THAN / EQUAL TO "+y+": "+f);
		System.out.println();

		System.out.println(!(x<y)+" "+(x>=y));
		System.out.println(!(x<=y)+" "+(x>y));
		System.out.println(!(x==y)+" "+(x!=y));
		System.out.println(!(x!=y)+" "+(x==y));
		System.out.println(!(x>y)+" "+(x<=y));
		System.out.println(!(x>=y)+" "+(x<y));
	}
}

// < is LESS THAN 
// <= is LESS THAN / EQUAL TO
// == is EQUAL 
// != is NOT EQUAL 
// > is GREATER THAN 
// >= is GREATER THAN / EQUAL TO