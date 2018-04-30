/* 	Date 		: 27/4/2018    
	Time 		: 11:05:39
	Create by 	: Muhamad Rifan Adrian
	Edited by 	: 
				
	*/
public class Ex6Drills1 {
	public static void main(String[] args) {
		int a, b, c, d, e, f, g, h;
		double x, y, z, w;
		String one, two, both;

		a = 10;
		b = 27;
		System.out.println( "a is " + a + ", b is "+ b );

		c = a + b;
		System.out.println( "a+b is " + c );
		d = a - b;
		System.out.println( "a-b is " + d );
		e = a+b*3;
		System.out.println( "a+b*3 is " + e );
		f = b/2;
		System.out.println( "b/2 is " + f );
		g = b % 10;
		System.out.println( "b%10 is " + g );
		h = g*f;
		System.out.println( "(b%10)*(b/2) is " + h );

		x = 1.1;
		System.out.println( "\nx is " + x );
		y = x*x;
		System.out.println( "x*x is " + y );
		z = b/2;
		System.out.println( "b/2 is " + z );
		w = z%2;
		System.out.println( "z%2 is " + w );
		System.out.println();

		one = "dog";
		two = "house";
		both = one + two;
		System.out.println( both );
	}
}