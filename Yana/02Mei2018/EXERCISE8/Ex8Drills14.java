/*
Create by	: Yana
Time 		: 2 Mei 2018 10.55
Update by	:
*/

import java.util.Scanner;

public class Ex8Drills14{
	public static void main(String[] args){

		String	name, address;
		int		age;
		double	weight, income;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Hello. what is your nama? ");
		name = keyboard.next();

		// Jika kita memasukkan angka (int, double) atau huruf (string) maka tidak masalah

		System.out.print("Hi " +name+ "! How old are you? ");
		age = keyboard.nextInt();

		// Jika kita memasukkan angka tidak bulat (double) dan atau karakter/huruf (string) maka akan error

		System.out.println("So you're " +age+ ", eh? That's not very old.");
		System.out.print("How much do you weight, " +name+ " ? ");
		weight = keyboard.nextDouble();

		// Jika kita inputkan type int maka tidak masalah

		System.out.println(weight+ " ! Better keep that quiet!!" );
		System.out.print("Finally, what's your income, " +name+ "? ");
		income = keyboard.nextDouble();

		System.out.print("Hopefully that is " +income+ " per hour");
		System.out.println(" and not pet year!");
		System.out.print("Well, thanks for answering my rude questions, ");
		System.out.println(name+ ".");

		System.out.print("Where do you live " +name+ "? ");
		address = keyboard.next();

		System.out.print("Owh " +address+ " is soo far from here");
	}
}