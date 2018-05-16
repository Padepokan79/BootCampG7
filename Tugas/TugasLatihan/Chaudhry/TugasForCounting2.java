/*
	DATE CREATED : 16 MEI 2018
	AUTHOR       : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;

public class TugasForCounting2 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int jmlKue, awal, jmlTerjual, menitAwal, jmlMenit;
		
		menitAwal  	= 15;
		jmlMenit 	= (8*60)+30;
		jmlKue 		= 200;
		jmlTerjual 	= 3;
		

		for ( awal = jmlMenit; awal >= 0;  awal -= menitAwal ) {
			jmlKue = jmlKue - jmlTerjual;
		}
			System.out.println(" sisa kue "+jmlKue);
	}
}