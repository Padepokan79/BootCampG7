/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class BrondongNight{
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);
		
		int age, daughterAge, minAge, minAge2, maxAge, maxAge2;
		String gender;
		double income, cute, cuteness;
		boolean allowed, yep, nope;

		cuteness = 8;
		minAge = 30;
		maxAge = 45;
		minAge2 = 20;
		maxAge2 = 25;

		System.out.println( "Hari Selasa, Brondong Night" );
		System.out.println();

		System.out.print( "Jenis Kelamin ( \"Cewek\" / \"Cowok\" ) : " );
		gender = keyboard.next();
		yep  = "Cewek".equals(gender);
		nope  = "Cowok".equals(gender);

		System.out.print( "Masukan usia : " );
		age = keyboard.nextInt();

		System.out.print( "Penampilan, dalam skala 0 sampai 10? " );
		cute = keyboard.nextDouble();

		allowed = ((yep == true && (age >= minAge && age <= maxAge) && cute >= cuteness) || (nope == true && (age >= minAge2 && age <= maxAge2) && cute < cuteness));

		System.out.println( "Boleh masuk? " + allowed );

	}
}

	/*
	Hari Selasa, Brondong Night 
	-Cewek Cakep usia 30 sampai 45 tahun
	-Cowok gk Ganteng usia 20 sampai 25 tahun
	Note: *Penampilan 8
	*/