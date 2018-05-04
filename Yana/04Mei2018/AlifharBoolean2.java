/*
Create by	: Yana
Time 		: 3 Mei 2018 20.21
Update by	:
*/

import java.util.Scanner;

public class AlifharBoolean2{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		String	warna;
		int		tahun, kecepatan, selisihKecepatan;
		boolean hasil;


		System.out.print("Warna: ");
		warna	= keyboard.next();
		System.out.print("Kecepatan: ");
		kecepatan	= keyboard.nextInt();
		System.out.print("Tahun Buat: ");
		tahun	= keyboard.nextInt();

		selisihKecepatan = kecepatan - 40;

		hasil	= ( warna.equals("Biru") && selisihKecepatan > 30 && ( tahun == 2016 || tahun == 2017 ) );
		
		
		System.out.println("Mobil cocok: " +hasil);
	}
}