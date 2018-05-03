/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Ex14Drills3{
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

		allowed = ( (age >= 17 && age < 30) && ( income >= 5000000 && cute >= 8 ) );

		System.out.println( "Allowed to date my grandchild? " + allowed );

	}
}

		/*
		Ibu, sedang mencarikan pasangan untuk anak perempuannya.
		Pasangannya harus berumur mulai dari 17 tahun dan dibawah 30 tahun,
		harus kaya dan ganteng

		Penampilan 8
		Penghasilan 5.000.000
		*/