/*
	Created By vikri
	09/05/2018
	10:11
*/

import java.util.Scanner;

public class Ex8D1{
	public static void main(String[] args) {
		String name;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hello, what is your name?");
		name = keyboard.next();

		System.out.println("Hi, " + name + "! How old are you? ");
		age = keyboard.nextInt();

		/*
			2. jika dimasukan string, akan bermasalah
			3. jikan dimasukan inputan selain angka akan bermasalah. contoh karakter huruf dan symbol.
		*/

		System.out.println("So you are" +age+ ", eh? that's not very old");
		System.out.println("how much do you weight,"+name+"?");
		weight = keyboard.nextDouble();

		/*
			1. tidak apa-apa karena double dan integer, sama sama bilangan angka.
			2. jika dimasukan string, akan bermasalah
			3. akan bermasalah jika dimasukan inputan selain bilangan angka, contohnya huruf dan symbol.
		*/

		System.out.println(weight +"! Better keep that quiet!!");
		System.out.print("Finally, what's your income, "+name+"?");
		income = keyboard.nextDouble();

			/*
				3. akan bermasalah jika di inputkan selain bilangan angka, seperti huruf dan angka
			*/

		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );
	}
}