/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Alifhar02{
	public static void main( String[] args ){
		Scanner inputKey = new Scanner(System.in);
		
		String color;
		double speed, speedMobilLama, speedMobilBaru, speedMobilTarget, menit, jam, selisihWaktu;
		int year, yearX, yearY;
		boolean allowed, biru;

		yearX = 2016;
		yearY = 2017;
		speedMobilLama = 20;
		menit = 30;
		jam = 60;
		selisihWaktu = jam / menit;
		speedMobilLama = speedMobilLama * selisihWaktu;
		speedMobilBaru = 30;
		speedMobilTarget = speedMobilLama + speedMobilBaru;

		System.out.println( "Pencarian Mobil" );
		System.out.println();

		System.out.print( "Warna: " );
		color = inputKey.next();
		biru = color.equals("Biru");

		System.out.print( "Kecepatan maksimal (dalam KM/jam) : " );
		speed = inputKey.nextDouble();

		System.out.print( "Tahun Keluaran : " );
		year = inputKey.nextInt();

		allowed = biru == true && (speed >= speedMobilTarget) && (year == yearX || year == yearY);

		System.out.println();
		System.out.println( "Memenuhi syarat untuk dibeli? " + allowed );

	}
}
