/*
variable
a = 50
b = 20

tampilkan a = b , b = a

title : change value variable
name  : Malik Chaudhary
Time  : 07-05-2018 1138AM
*/

public class Ex5Drill3{
	public static void main(String[] args){
		int a, b, c;

		a = 50;
		b = 20;

		
		c = a;
		a = b;

		b = c;



		System.out.println("a"+a);
		System.out.println("b"+b);
	}
}