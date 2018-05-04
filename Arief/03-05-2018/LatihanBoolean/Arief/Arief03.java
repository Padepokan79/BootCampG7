/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Arief03{
	public static void main( String[] args ){
		Scanner inputKey = new Scanner(System.in);
		
		double ram, hdd, procie, defRam, defHdd, minProcie, maxProcie;
		boolean allowed, yep, nope;

		defRam = 8;
		defHdd = 1;
		minProcie = 3.0;
		maxProcie = 4.5;


		System.out.println( "Spesifikasi Laptop" );
		System.out.println();

		System.out.print( "Masukan Kapasitas Ram: " );
		ram = inputKey.nextDouble();

		System.out.print( "Masukan Kapasitas HDD: " );
		hdd = inputKey.nextDouble();

		System.out.print( "Masukan Kecepatan Processor: " );
		procie = inputKey.nextDouble();

		allowed = (ram >= defRam && hdd >= defHdd && (procie >= minProcie && procie <= maxProcie));

		System.out.println();
		System.out.println( "Apakah Spesifikasi Mumpuni? " + allowed );

	}
}

	/*
	3. Spesifikasi laptop
	Jumlah Ram setidaknya 8GB.
	Kapasitas Penyimpanan HDD minimal 1TB.
	Kecepatan processor tidak boleh kurang dari 3.0 Ghz dan tidak boleh lebih dari 4.5 Ghz
	*/