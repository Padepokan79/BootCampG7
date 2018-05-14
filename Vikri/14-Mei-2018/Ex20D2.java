import static java.lang.System.*;
import java.util.Scanner;

public class Ex20D2 {
	 public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int math;

		out.println( "Welcome to the UT Austin College Admissions Interface!" );
		out.print( "Please enter your SAT math score (200-800): " );
		math = keyboard.nextInt();

 		out.print( "Admittance status: " );

		if ( math >= 790 )
			out.print( "CERTAIN " );
		else if ( math >= 390 )
			out.print( "UNLIKELY " ); // maka jika inputan kuran dari 790 dan lebih dari 390 akan selalu muncul Unlikely
		else if ( math >= 710 ) // Inputan yang kurang dari 790 akan "Denied"
			out.print( "SAFE " );
		else if ( math >= 580 )
			out.print( "PROBABLE " );
		else if ( math >= 500 )
			out.print( "UNCERTAIN " );
		else // below 390
			out.print( "DENIED " );
	}
}