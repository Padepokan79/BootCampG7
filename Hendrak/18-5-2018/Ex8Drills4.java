//createdby:Hendra Kurniawan 
//Date:18 Mei 2018 Time:3:29 AM
//Modified by :
import java.util.Scanner;

public class Ex8Drills4{
	public static void main(String[] args) {
		String name,hobby;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Hello. What is your name ?");
		name = keyboard.next();

		System.out.print("Hi ," + name + "! How old are you?");
		age = keyboard.nextInt();

		System.out.println("So you're " + age + ", eh? That's not very old.");
		System.out.print("How much do you weight, " + name + "?");
		weight = keyboard.nextDouble();

		System.out.println(weight + " ! Better keep that quiet!!");
		System.out.print("Finally, what's your income, " + name + "?");
		income = keyboard.nextDouble();


		System.out.print("Hopefully that is " + income + " per hour");
		System.out.println(" And not per year! ");
		System.out.print("Well, thanks for answearing my rude question,");
		System.out.println(name + ".");
	
		System.out.print("What is your Hobby ?");
		hobby= keyboard.next();

		System.out.println("So, " + hobby + " is your hobby, nice hobby.");
	}
}