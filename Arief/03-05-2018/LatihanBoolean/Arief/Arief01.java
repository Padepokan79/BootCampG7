/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Arief01{
	public static void main( String[] args ){
		Scanner inputKey = new Scanner(System.in);
		
		int noPlat, noPlatUjung, mod, tanggal, tanggalUjung, ganjil;
		boolean allowed, yep, nope;

		mod = 2;
		ganjil = 1;

		System.out.println( "Jalan tol ganjil genap" );
		System.out.println();

		System.out.print( "Masukan angka pada plat nomor kendaraan anda: " );
		noPlat = inputKey.nextInt();

		System.out.print( "Masukan Tanggal hari ini (tanpa bulan & tahun): " );
		tanggal = inputKey.nextInt();

		noPlatUjung = noPlat % mod;
		tanggalUjung = tanggal % mod;

		allowed = (noPlatUjung == ganjil && tanggalUjung == ganjil ) || (noPlatUjung != ganjil && tanggalUjung != ganjil);

		System.out.println();
		System.out.println( "Tanggal Hari ini : " + tanggal );
		System.out.println( "Boleh masuk? " + allowed );

	}
}

	/*
	1. Jalan tol ganjil genap.
	Jika tanggal ganjil, maka hanya Plat nomor ganjil yang boleh masuk.
	Jika tanggal genap, maka hanya Plat nomor genap yang boleh masuk.
	*/