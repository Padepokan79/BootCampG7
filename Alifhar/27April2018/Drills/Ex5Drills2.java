//a=20, b=50. tuker nilai variabel
public class Ex5Drills2{
	public static void main(String[] args){
		int a,b,temp;
		a=20;
		b=50;
		System.out.println("the start of the value");
		System.out.println("the value of a is "+a);
		System.out.println("the value of b is "+b+"\n");
		temp=a;
		a=b;
		b=temp;
		System.out.println("after the swap");
		System.out.println("the value of a is "+a);
		System.out.println("the value of b is "+b);
	}
}