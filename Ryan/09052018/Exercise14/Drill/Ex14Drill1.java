/*
     * Shallow Grandmother
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At : 09 May 2018 10:51
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex14Drill1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		double income, cute, happy;
		boolean allowed, allowed2;

		System.out.println("Enter your age: ");
		age = keyboard.nextInt();

		System.out.println("Enter your yearly income: ");
		income = keyboard.nextDouble();

		System.out.println("How cute are you, on a scale from 0.0 to 10.0? ");
		cute = keyboard.nextDouble();

		allowed = (age>25 && age<40 && (income > 50000 || cute >= 8.5));
		System.out.println("Grandmother1 : Allowed to date my grandchild? "+allowed);

		System.out.println("How happy do you make them from 0.0 to 10.0? ");
		happy = keyboard.nextDouble();
		allowed2 = (happy >= 7.0);

		System.out.println("Grandmother2 : Allowed to date my grandchild? "+allowed2);
	}
}