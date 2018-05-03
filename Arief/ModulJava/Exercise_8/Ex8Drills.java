/*
Date Created	: 2 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Ex8Drills{
	public static void main ( String[] args ){
		String name, nations;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Hello. What is your name? " + "Hi, my name is ");
		name = keyboard.next();

		System.out.print("Hi " + name + "! How old are you? " + "I am ");
		age = keyboard.nextInt();
			// Error terjadi apabila inputan berupa,
			// - Karakter huruf
			// - Simbol (<?>!@#$%^&*, dsb diluar angka dan huruf)
			// - angka desimal

		System.out.println("So, you're " + age + ", eh? That's not very old.");
		System.out.print("How much do your weight, " + name + "? " + "its ");
		weight = keyboard.nextDouble();
			// Error terjadi apabila inputan berupa,
			// - Karakter huruf
			// - Simbol (<?>!@#$%^&*, dsb diluar angka dan huruf)

		System.out.println(weight + "! Beter keep that quiet!!");
		System.out.print("Tell me about your nationality, " + name + "? " + "I am from ");
		nations = keyboard.next();

		System.out.println("So, you live in " + nations + ", i've heard it's a nice place.");
		System.out.print("Finally, what's your income, " + name + "? ");
		income = keyboard.nextDouble();
			// Error terjadi apabila inputan berupa,
			// - Karakter huruf
			// - Simbol (<?>!@#$%^&*, dsb diluar angka dan huruf)

		System.out.print("Hopefully that is " + income + " per hour");
		System.out.println(" and not per year!");
		System.out.print("Well, thanks for answering my rude questions, ");
		System.out.println(name + ".");
		
	}
}

/*
DRILLS
1.	Error tidak terjadi, karena nilai integer juga bisa digunakan oleh double
2.	Error tidak terjadi karena nilai angka merupakan karakter yang bisa dimasukan kedalam
	tipe data string
*/