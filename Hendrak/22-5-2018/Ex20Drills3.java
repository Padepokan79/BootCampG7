//Created by : Hendra Kurniawan
//Date : 21 Mei 2018 Time : 4:34 AM
//Modified by :
import static java.lang.System.*;
import java.util.Scanner;

public class Ex20Drills3{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int math;

		out.println("Welcome to UT Austin College Admission Interface!");
		out.print(  "Please enter your SAT math score (200-800): ");
		math = keyboard.nextInt();

		out.print("Admittance status: ");

		if(math >= 790){
			out.print("CERTAIN");
		}
		else {
			if (math >=390){
			out.print("UNLIKELY");
			}
		else {
			if (math >=710){
			out.print("SAFE");
			}
			else {
				if (math >=580){
					out.print("PROBABLE");
					}
					else {
						if (math >=500){
							out.print("UNCERTAIN");
						}
						
							else {//below 390
								out.print("DENIED");
								
							}
						}
					}
				}
			}
			out.println();
	}	
}
/*program berjalan sama seperti pada collegeadmission.java