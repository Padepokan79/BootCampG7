/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Yana01{
	public static void main( String[] args ){
		Scanner inputKey = new Scanner(System.in);
		
		int age, minAge;
		String gender, degree, skills, exp, exp2;
		boolean allowed, laki, perm, yep3, nope, nope2, nope3, s1, s2, s3;

		minAge = 23;

		System.out.println( "Lowongan Pekerjaan" );
		System.out.println();

		System.out.print( "Jenis Kelamin ( \"Laki-laki\" / \"Perempuan\" ) : " );
		gender = inputKey.next();
		laki  = gender.equals("Laki-laki");
		perm  = gender.equals("Perempuan");

		System.out.print( "Masukan usia : " );
		age = inputKey.nextInt();

		System.out.print( "Pendidikan (S1/S2/S3): " );
		degree = inputKey.next();
		s1 = degree.equals("S1");
		s2 = degree.equals("S2");
		s3 = degree.equals("S3");

		System.out.print( "Keahlian programming (Java)? (Y/T) " );
		exp = inputKey.next();
		yep2  = exp.equals("Y");
		nope2  = exp.equals("T");

		System.out.print( "Keahlian programming (ANgularJs/PHP)? (Y/T) " );
		exp2 = inputKey.next();
		yep3  = exp2.equals("Y");
		nope3  = exp2.equals("T");


		allowed = (laki == true && age >= minAge && (s1 == true || s2 == true || s3 == true) && (yep2 == true && yep3 == true));

		System.out.println( "Memenuhi Syarat? " + allowed );

	}
}
