/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
import static java.lang.System.*;
import java.util.Scanner;

public class Ex20Drills1 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int math;

		out.println("Welcome to the UT Austin College Admissions Interface!");
		out.print("Please enter your SAT math score (200-800)");
		math = key.nextInt();

		out.println("Adittance status: ");

		if (math >= 790)
			out.print("CERTAIN");
		else if(math >= 710)
			out.print("SAFE");
		else if(math >= 580)
			out.print("SAFE");
		else if(math >= 710)
			out.print("PROBABLE");
		else if(math >= 500)
			out.print("UNCERTAIN");
		else if(math >= 390)
			out.print("UNLIKELY");
		else // below 390
			out.print("DENIED");
			out.println();			
	}
}
