/*
Created by 	: Yana
Time		: 14 Mei 2018 11.31
*/

import static java.lang.System.*;
import java.util.Scanner;

public class Ex20Drills2{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		int math;

		out.println("Welcome to the UT Austin College Admissions Interface!");
		out.print("Please enter your SAT mat score (200-800): ");
		math = keyboard.nextInt();

		out.print("Admittance status: ");

		if (math >= 790) 
			out.print("CERTAIN");

		else if (math >= 390) 
			out.print("UNLIKELY");

		else if (math >= 710) 
			out.print("SAFE");
		
		else if (math >= 580) 
			out.print("PROBABLE");	
		
		else if (math >= 500) 
			out.print("UNCERTAIN");
		
		else
			out.print("DENIED");
			out.println();
	}
}