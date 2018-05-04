/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Khairil02{
	public static void main( String[] args ){
		Scanner inputKey = new Scanner(System.in);
		
		int bulanan, minItemBulanan, hargaMentega, hargaRoti, hargaSlay, hargaKismis, maxMentega, maxRoti, totItem, totHarga, maxHarga, mentega, roti, slay, kismis;
		boolean allowed;

		minItemBulanan = 4; //tidak perlu ada minimal item
		hargaMentega = 3500;
		hargaRoti = 15000;
		hargaSlay = 8500;
		hargaKismis = 7500;
		maxMentega = 1;
		maxRoti = 1;
		maxHarga = 100000;

		System.out.println( "Daftar Belanja Bulanan" );

		System.out.print( "Jumlah Mentega : " );
		mentega = inputKey.nextInt();

		System.out.print( "Jumlah Roti : " );
		roti = inputKey.nextInt();

		System.out.print( "Jumlah Selai : " );
		slay = inputKey.nextInt();

		System.out.print( "Jumlah Kismis : " );
		kismis = inputKey.nextInt();

		totHarga = (mentega * hargaMentega) + (roti * hargaRoti) + (slay * hargaSlay) + (kismis * hargaKismis);
		totItem = mentega + roti + slay + kismis;

		allowed = (totItem >= minItemBulanan) && (mentega <= maxMentega && roti <= maxRoti) && (totHarga <= maxHarga);

		System.out.println();
		System.out.println( "Total Harga Belanja " + totHarga );
		System.out.println( "Bolehkah belanja? " + allowed );

	}
}