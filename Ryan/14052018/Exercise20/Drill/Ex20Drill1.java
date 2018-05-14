/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 14 May 2018 11:33
     * Updated By : 
     * Updated At : 
*/

import static java.lang.System.*;
import java.util.Scanner;

public class Ex20Drill1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int math;

		out.println("Welcome to the UT Austin College Admissions Interface!");
		out.print("Please enter your SAT math score (200-500) : ");
		math = keyboard.nextInt();

		out.print("Admittance status : ");

		if (math >= 790)
			out.print("CERTAIN");
		if (math >= 710)
			out.print("SAFE");
		if (math >= 580)
			out.print("PROBBALE");
		if (math >= 500)
			out.print("UNCERTAIN");
		if (math >= 390)
			out.print("UNLIKELY");
		else
			out.print("DENIED");
		out.println();
	}
}

//Ini akan terbawa dari nilai kebawah