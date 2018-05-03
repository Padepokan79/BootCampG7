/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class JombloNight{
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);
		
		int age, daughterAge, minAge, maxAge;
		String gender;
		double income, cute, cuteness;
		boolean allowed, yep, nope;

		cuteness = 8;
		minAge = 21;
		maxAge = 30;

		System.out.println( "Hari Sabtu, Jomblo Night" );
		System.out.println();

		System.out.print( "Jenis Kelamin ( \"Cewek\" / \"Cowok\" ) : " );
		gender = keyboard.next();
		yep  = "Cewek".equals(gender);
		nope  = "Cowok".equals(gender);

		System.out.print( "Masukan usia : " );
		age = keyboard.nextInt();

		System.out.print( "Penampilan, dalam skala 0 sampai 10? " );
		cute = keyboard.nextDouble();

		allowed = ( (yep == true || nope == true) && (age >= minAge && age <= maxAge) && (cute >= cuteness) );

		System.out.println( "Boleh masuk? " + allowed );

	}
}

	/*
	Hari Sabtu, Jomblo Night
	-Cewek atau Cowok yang berusia 21 tahun sampai 30 tahun
	 Penampilan Menarik
	Selain itu Tidak boleh masuk
	Note: *Penampilan 8
	*/