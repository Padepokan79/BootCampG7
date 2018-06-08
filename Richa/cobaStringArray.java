/* 
Created by  		: Richa Fitria
Date/hour			: 23 Mei 2018/ 11.11 AM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class cobaStringArray {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Scanner keyboard2 = new Scanner(System.in);

		String guess;

		String [] jenisGolongan = {"IA", "IB", "IC", "ID", "IIA", "IIB", "IIC", "IID", "IIIA", "IIIB", "IIIC", "IIID", "IVA", "IVB", "IVC", "IVD", "IVD", "IVE"};

		System.out.print( "Name any *mortal* hero from Greek mythology: " );
		guess = keyboard.next();

		boolean found = false;
		for ( String golongan : jenisGolongan ) {
			if ( guess.equals(golongan) ) {
			System.out.println( "That's one of them!" );
			found = true;
			}
		}

		if ( found == false ) {
			System.out.println("No, " + guess + " wasn't a Greek mortal hero.");
		}
	}
}