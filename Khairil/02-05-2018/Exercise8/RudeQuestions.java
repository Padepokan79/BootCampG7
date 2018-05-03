/*
     Creator     : Khairil
     Created At  : 2 Mei 2018 10:15 AM     
     Updated By  : 
     Update Date : 
*/

import java.util.Scanner;

public class RudeQuestions {
	public static void main(String[] args) {
		String name;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hello. What is your name? ");
		name = keyboard.next();
		//cannot type 2 words

		System.out.println("Hi, " + name + "! How old are you?");
		age = keyboard.nextInt();
		//cannot type double 

		System.out.println("So you're " + age + ", eh? That's not very old.");
		System.out.println("How much do you weigh, " + name + "? ");
		weight = keyboard.nextDouble();
		//cannot type text
		//cannot type special character

		System.out.println( weight + "! Better keep that quiet!!");
		System.out.println("Finally, what's your income, " + name + "? ");
		income = keyboard.nextDouble();
		//cannot type text
		//cannot type special character

		System.out.print("Hopefully that is " + income + " per hour");
		System.out.println(" and not per year!");
		//cannot type text
		System.out.println(" Well, thanks for answering my rude questions, ");
		System.out.println(name + ".");
		
	}
}

/*
1. No. It nothing happened and could input using integer because that code will convert to double instantly

2. No. Either integer or double will not affect any statement. String can summon any type of variables

3. 
*/