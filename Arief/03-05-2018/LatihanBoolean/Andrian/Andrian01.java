/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Andrian01{
	public static void main( String[] args ){
		Scanner inputKey = new Scanner(System.in);
		
		String gender, relasi;
		int minHadiah, maxHadiah, nilaiHadiah;
		double  cute, defCute;
		boolean allowed, male, female, temanSekolah, sultan;

		minHadiah = 5000000;
		maxHadiah = 20000000;
		defCute = 8.5;

		System.out.println( "Rave party Nesa" );
		System.out.println();

		System.out.print( "Jenis Kelamin ( \"Laki-laki\" / \"Perempuan\" ) : " );
		gender = inputKey.next();
		male  = gender.equals("Laki-laki");
		female  = gender.equals("Perempuan");

		System.out.print( "Teman Sekolah? (Ya/Tidak): " );
		relasi = inputKey.next();
		temanSekolah  = relasi.equals("Ya");

		System.out.print( "Nilai Hadiah: " );
		nilaiHadiah = inputKey.nextInt();

		System.out.print( "Penampilan, skala 0.0 ~ 10.0: " );
		cute = inputKey.nextDouble();

		sultan = ((cute >= defCute) || nilaiHadiah >= maxHadiah);
		allowed = temanSekolah == true && (male == true || female == true) && (nilaiHadiah >= minHadiah) && sultan;

		System.out.println( "Bolehkah tamu mengikuti acara Rave Party? " + allowed );

	}
}