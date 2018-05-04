/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Khairil01{
	public static void main( String[] args ){
		Scanner inputKey = new Scanner(System.in);
		Scanner inputKey2 = new Scanner(System.in);
		
		String gender, seleksi, domisili;
		int nilaiMtk, semester1, semester2, totNilai;
		boolean allowed, male, female, pernah, tidak, bandung;

		nilaiMtk = 8;

		System.out.println( "Seleksi Olimpiade Matematika" );

		System.out.print( "Jenis Kelamin ( \"Laki-laki\" / \"Perempuan\" ) : " );
		gender = inputKey.next();
		male  = gender.equals("Laki-laki");
		female  = gender.equals("Perempuan");

		System.out.print( "Pernah ikut seleksi sebelumnya? (Ya/Tidak) : " );
		seleksi = inputKey.next();
		pernah  = seleksi.equals("Ya");
		tidak  = seleksi.equals("Tidak");

		System.out.print( "Domisili tempat tinggal : " );
		domisili = inputKey2.next();
		bandung = domisili.equals("Bandung");

		System.out.print( "Nilai Semester 1: " );
		semester1 = inputKey.nextInt();

		System.out.print( "Nilai Semester 2: " );
		semester2 = inputKey.nextInt();

		totNilai = (semester1 + semester2) / 2;

		allowed = ((male == true || female == true) && (tidak == true) && (totNilai >= nilaiMtk) && (bandung == true));

		System.out.println( "Memenuhi syarat Olimpiade Matematika? " + allowed );

	}
}