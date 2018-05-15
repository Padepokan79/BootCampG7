/*
	* Created by:	Alifhar Juliansyah
	* 				14-05-2018	11.22
	* Updated by:
	*
*/
import static java .lang.System.*;
import java.util.Scanner;

public class Ex20Drills1{
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int math;

		out.println("Welcome to the AT Austin College Admission Interface!");
		out.print("Please enter your SAT math score (200-800): ");
		math=keyboard.nextInt();

		out.print("Admittance status: ");

		if(math>=790)
			out.print("CERTAIN");
		else if(math>=710)
			out.print("SAFE");
		else if(math>=580)
			out.print("PROBABLE");
		else if(math>=500)
			out.print("UNCERTAIN");
		else if(math>=390)
			out.print("UNLIKELY");
		else
			out.print("DENIED");
		out.println();
	}
}
//when there are no elses, so the program will check all the condition wether it has been true or not
//but when  there are elses, the program will stop check the next condition when it's true in one if