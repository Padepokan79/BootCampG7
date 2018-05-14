/*
	 Program     : Exercise 20 - Drills 1
     Creator     : Khairil
     Created At  : 14 Mei 2018 10:55 AM     
     Updated By  : 
     Update Date : 
*/
import static java.lang.System.*;
import java.util.Scanner;

public class Drills1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int math;

		out.println( "Welcome to the UT Austin College Admissions Interface" );
		out.print( "Please enter your SAT math score (200-800): " );
		math = keyboard.nextInt();

		out.println( "Admitance status: " );

		if( math >= 790 )
			out.print( "CERTAIN " );
		if ( math >= 710 )
			out.print( "SAFE " );
		if ( math >= 580 )
			out.print( "PROBABLE " );
		if ( math >= 500 )
			out.print( "UNCERTAIN " );
		if ( math >= 390 )
			out.print( "UNLIKELY " );
		else //below 390 
			out.print( "DENIED " );
		out.println();
	}
}