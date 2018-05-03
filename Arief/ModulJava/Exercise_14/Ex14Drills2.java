/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Ex14Drills2{
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		double income, cute;
		boolean allowed;


		System.out.println( );
		System.out.print( "Enter your age : " );
		age = keyboard.nextInt();

		System.out.print( "Enter your yearly income : " );
		income = keyboard.nextDouble();

		System.out.print( "How cute are you, on a scale from 0.0 to 10.0? " );
		cute = keyboard.nextDouble();

		allowed = ( age >= 30 && income >= 5000000 );

		System.out.println( "Allowed to date my grandchild? " + allowed );

	}
}

	/*
	Kakek, sedang mencarikan pasangan untuk cucu perempuannya.
	Pasangannya harus berumur minimal 30 tahun, ganteng atau tidak yang penting Kaya.	

	Penampilan 8
	Penghasilan 5.000.000
	*/