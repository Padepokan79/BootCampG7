/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class MelodiesMemory{
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);
		
		int age, daughterAge, minAge, maxAge;
		String gender;
		double income, cute, cuteness;
		boolean allowed, yep, nope;

		cuteness = 0;
		minAge = 40;
		// maxAge = 30;

		System.out.println( "Hari Jumat, Melodies Memori" );
		System.out.println();

		System.out.print( "Jenis Kelamin ( \"Cewek\" / \"Cowok\" ) : " );
		gender = keyboard.next();
		yep  = "Cewek".equals(gender);
		nope  = "Cowok".equals(gender);

		System.out.print( "Masukan usia : " );
		age = keyboard.nextInt();

		System.out.print( "Penampilan, dalam skala 0 sampai 10? " );
		cute = keyboard.nextDouble();

		allowed = ( (yep == true || nope == true) && (age > minAge) && (cute >= cuteness || cute <= cuteness) );

		System.out.println( "Boleh masuk? " + allowed );

	}
}

	/*
	Hari Jumat, Melodies Memori
	-Cewek atau Cowok yang berusia lebih dari 40 tahun.
	-Selain Itu tidak boleh masuk
	Note: *Penampilan 8
	*/