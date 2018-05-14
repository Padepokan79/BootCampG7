/*
	* Created by:	Alifhar Juliansyah
	* 				14-05-2018	11.26
	* Updated by:
	*
*/
import static java .lang.System.*;
import java.util.Scanner;

public class Ex20Drills2{
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int math;

		out.println("Welcome to the AT Austin College Admission Interface!");
		out.print("Please enter your SAT math score (200-800): ");
		math=keyboard.nextInt();

		out.print("Admittance status: ");

		if(math>=790)
			out.print("CERTAIN");
		else if(math>=390)
			out.print("UNLIKELY");		
		else if(math>=710)
			out.print("SAFE");
		else if(math>=580)
			out.print("PROBABLE");
		else if(math>=500)
			out.print("UNCERTAIN");
		else
			out.print("DENIED");
		out.println();
	}
}
//so the program will never print "SAFE", "PROBABLE", and "UNCERTAIN"
//it's because when we type between 390 and 789, the condition math>=390 will always be true and won't check the condtion after that