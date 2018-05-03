/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Ex14Drills4{
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);
		
		int age, daughterAge, x;
		double income, cute;
		boolean allowed;


		System.out.print( "Set Daughter age : " );
		daughterAge = keyboard.nextInt();

		System.out.println( );
		System.out.print( "Enter your age : " );
		age = keyboard.nextInt();

		System.out.print( "Enter your yearly income : " );
		income = keyboard.nextDouble();

		System.out.print( "How cute are you, on a scale from 0.0 to 10.0? " );
		cute = keyboard.nextDouble();

		allowed = ( ( (age <= (daughterAge + 5)) && (age >= (daughterAge - 5)) ) && ( income >= 5000000 && cute >= 8 ) );
		System.out.println( age );
		System.out.println( daughterAge );


		System.out.println( "Allowed to date my grandchild? " + allowed );

	}
}

		/*
		Ayah, sedang mencarikan pasangan untuk anak perempuannya.
		Perbedaan umur pasangannya maksimal 5 tahun, 
		harus kaya atau ganteng.

		Penampilan 8
		Penghasilan 5.000.000
		*/