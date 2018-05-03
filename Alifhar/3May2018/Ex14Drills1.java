/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	08.58
	* Updated by:
	*
*/

import java.util.Scanner;

public class Ex14Drills1{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		int age;
		double income, cute, happy;
		boolean allowed, allowed2;

		System.out.print("Enter your age: ");
		age=keyboard.nextInt();

		System.out.print("Enter your yearly income: ");
		income=keyboard.nextDouble();

		System.out.print("How cute are you, on a scale from 0.0 to 10.0? ");
		cute=keyboard.nextDouble();

		System.out.print("How happy do you make her? ");
		happy=keyboard.nextDouble();

		allowed=(age>25 && age<40 && ( income>50000 || cute>=8.5 ));
		allowed2=(age>25 && age<40 && ( happy>7.0 ));

		System.out.println("Allowed to date my grandchild (1)? "+allowed);
		System.out.println("Allowed to date my grandchild (2)? "+allowed2);
	}
}
