/* 
Created by  		: Richa Fitria
Date/hour			: 2 Mei 2018/ 10.51 AM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;

public class Ex8Drills123dan4{
	public static void main (String [] args){
		String name, lastname;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner (System.in);

		System.out.print ("Hello. What is your name? " );
		name = keyboard.next (); //error ketika input lebih dari 1 kata karena bukan nextln
								//tidak error ketika input double lebih dari 1 kata karena pertanyaan selanjutnya yang menerima tipe data double/integer
								// tidak error ketika input double dalam 1 kata karena tidak dibatasi jenis tipe datanya

		System.out.print ("Hi, " + name + "! How old are you? ");
		age = keyboard.nextInt (); //error ketika input string karena harus integer
									//error ketika input double
									//

		System.out.println ("So you're " + age + ", eh? That's not very old.");
		System.out.print ("How much do you weight, " + name + "? ");
		weight = keyboard.nextDouble(); //tidak error ketika input integer karena integer termasuk double
										//ERROR ketika input string

		System.out.println (weight + "! better keep that quiet!!");
		System.out.print ("Finally, what's your income, " + name + " ?");
		income = keyboard.nextDouble ();

		System.out.print ("Hopefully that is " + income + " per hour");
		System.out.println (" and not per year!");

		System.out.println ("Oh, sorry! Last question");
		System.out.print ("What's your last name? ");
		lastname = keyboard.next ();


		System.out.print ("Well, thanks for answering my rude questions, ");
		System.out.println (name + " " + lastname + ".");
	}

}