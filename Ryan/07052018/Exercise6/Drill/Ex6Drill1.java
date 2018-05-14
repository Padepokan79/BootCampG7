public class Ex6Drill1 {
	public static void main(String[] args) {
		int a,b,c,d,e,f,g,h;
		double i,x,y,z;
		String one,two,both;

		h=27;
		i=7.5;

		a=10;
		b=27;
		System.out.println("a is "+a+", b is "+b);
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
		System.out.println("\nx is " +x);
		y=x*x;
		System.out.printf("x*x is %.2f\n", y);
		z=b/2;
		System.out.println("b/2 is "+z);
		System.out.println();

		System.out.println("h%i is "+ h%i);


		one= "dog";
		two= "house";
		both= one + two;
		System.out.println(both);

	}
}