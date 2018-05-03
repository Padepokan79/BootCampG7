/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class LadiesNight{
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);
		
		int age, daughterAge, minAge, maxAge;
		String gender;
		double income, cute, cuteness;
		boolean allowed, yep;

		cuteness = 8;
		minAge = 21;
		maxAge = 30;

		System.out.println( "Hari Kamis, Ladies Nigth" );
		System.out.println();

		System.out.print( "Jenis Kelamin ( \"Cewek\" / \"Cowok\" ) : " );
		gender = keyboard.next();
		yep  = "Cewek".equals(gender);

		System.out.print( "Masukan usia : " );
		age = keyboard.nextInt();

		System.out.print( "Penampilan, dalam skala 0 sampai 10? " );
		cute = keyboard.nextDouble();

		allowed = ( yep == true && (age >= minAge && age <= maxAge) && cute >= cuteness );

		System.out.println( "Boleh masuk? " + allowed );

	}
}

	/*
	Hari Kamis, Ladies Night
	-Cewek Cantik berusia 21 tahun sampai 30 Tahun
	-Selain Itu tidak Boleh Masuk
	Note: *Penampilan 8
	*/