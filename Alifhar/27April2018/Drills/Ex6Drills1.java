/*
	* Created by:	Alifhar Juliansyah
	* 				27-04-2018	11:27
	* Updated by:
	*
*/

public class Ex6Drills1{
	public static void main(String[] args){
		int a,b,c,d,e,f,g,new1;
		double x,y,z,new2;
		String one, two, both;

		a=10;
		b=27;
		System.out.println("a is "+a+", b is "+b);
		new1=(a+b)*100;
		System.out.println("(a+b)*100 is "+new1);

		c=a+b;
		System.out.println("a+b is "+c);
		d=a-b;
		System.out.println("a-b is "+d);
		e=a+b*3;
		System.out.println("a+b*3 is "+e);
		f=b/2;
		System.out.println("b/2 is "+f);
		g=b%10;
		System.out.println("b%10 is "+g);

		x=1.1;
		System.out.println("\nx is "+x);
		y=x*x;
		System.out.println("x*x is "+y);
		z=b/2;
		System.out.println("b/2 is "+z);
		new2=y+y;
		System.out.println("x*x+x*x is"+new2);
		System.out.println();

		one="dog";
		two="house";
		both=one+two;
		System.out.println(both);
	}
}