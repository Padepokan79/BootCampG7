/*  Created By: Vikri 
	07/05/2018
	14:45
*/ 
public class Ex5Drills3{
	public static void main(String[] args) {
		int a, b, c, d;
		a=1;
		b=2;
		c=4;
		System.out.println("a = " + a + " b = " + b + " c = " + c);
		d = a;
		a = c;
		c = b;
		b = d;
		System.out.println("a = " + a + " b = " + b + " c = " + c);
		d=a;
		a=c;
		c=b;
		b=d;
		System.out.println("a = " + a + " b = " + b + " c = " + c);
	}
}