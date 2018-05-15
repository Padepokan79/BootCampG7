/*
Date Created	: 15 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Arief01 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		int noPlat, noPlatUjung, mod, tanggal, tanggalUjung, ganjil, genap, mesin, r2, r2Def, mogeMin;
		String tglLibur, jenisKendaraan, perizinan, kawalan;
		boolean allAllowed, moge, ganjilAllowed, genapAllowed, libur, liburAllowed, izin, kawal, allowed, touring;

		mod = 2;
		ganjil = 1;
		r2Def = 2;
		mogeMin = 1000;

		System.out.println( "Jalan tol ganjil genap" );
		System.out.println();

		System.out.print( "Masukan angka pada plat nomor kendaraan anda: " );
		noPlat = inputKey.nextInt();

		System.out.print( "Masukan Tanggal hari ini (tanpa bulan & tahun): " );
		tanggal = inputKey.nextInt();

		System.out.print( "Jenis kendaraan (Roda): " );
		r2 = inputKey.nextInt();

		System.out.print( "Hari libur (Y/T): " );
		tglLibur = inputKey.next();
		libur = tglLibur.equals("Y");

		System.out.print( "Kapasitas mesin kendaraan anda (dalam CC): " );
		mesin = inputKey.nextInt();

		System.out.print( "Memiliki izin khusus dari kepolisian (Y/T): " );
		perizinan = inputKey.next();
		izin = perizinan.equals("Y");

		System.out.print( "Dikawal pihak kepolisian (Y/T): " );
		kawalan = inputKey.next();
		kawal = kawalan.equals("Y");

		noPlatUjung = noPlat % mod;
		tanggalUjung = tanggal % mod;

		allowed = (noPlatUjung == ganjil && tanggalUjung == ganjil ) || (noPlatUjung != ganjil && tanggalUjung != ganjil);
		//	 						INI GANJIL 												INI GENAP
		liburAllowed = allowed;

		moge = (r2 >= r2Def && mesin >= mogeMin) || (r2 > r2Def);

		touring = kawal && izin;

		if (libur) {
			System.out.println("Libur bebas masuk");
		}else if (touring) {
			System.out.println("Kawalan bebas masuk");
		}else if (moge) {
			System.out.println("Moge masuk");
		}else if (allowed) {
			System.out.println("Diijinkan masuk");
		}else if (noPlatUjung == ganjil) {
			System.out.println("Khusus genap");
		}else {
			System.out.println("Khusus ganjil");
		}
		// System.out.println( "Status " + allowed );

	}
}