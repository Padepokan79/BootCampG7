/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Yana02{
	public static void main( String[] args ){
		Scanner inputKey = new Scanner(System.in);
		
		double ipk, defIpk, ipkS1, ipkS2;
		String gender, degree;
		boolean allowed, laki, perm, s1, s2, s3;

		defIpk = 3.25;

		System.out.println( "Beasiswa bidikmisi s3" );
		System.out.println();

		System.out.print( "Jenis Kelamin ( \"Laki-laki\" / \"Perempuan\" ) : " );
		gender = inputKey.next();
		laki  = gender.equals("Laki-laki");
		perm  = gender.equals("Perempuan");

		System.out.print( "IPK Pendidikan S1: " );
		ipkS1 = inputKey.nextDouble();

		System.out.print( "IPK Pendidikan S2: " );
		ipkS2 = inputKey.nextDouble();

		ipk = (ipkS1 + ipkS2) / 2;

		System.out.print( "Akreditasi (A/B/C): " );
		degree = inputKey.next();
		s1 = degree.equals("A");
		s2 = degree.equals("B");
		s3 = degree.equals("C");

		allowed = (laki == true || perm == true) && (ipk == defIpk) && (s2 == true || s1 == true);

		System.out.println( "Memenuhi Syarat? " + allowed );

	}
}