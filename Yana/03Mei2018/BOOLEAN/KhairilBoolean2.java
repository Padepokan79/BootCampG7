/*
Create by	: Yana
Time 		: 3 Mei 2018 18.36
Update by	:
*/

import java.util.Scanner;

public class KhairilBoolean2{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		double	hargaRoti, hargaSelai, hargaKismis, hargaMentega, 
				totalRoti, totalSelai, totalKismis, totalMentega, totalBelanja;
		int		jumlahRoti, jumlahSelai, jumlahKismis, jumlahMentega;
		boolean hasil;


		System.out.print("Jumlah Roti: ");
		jumlahRoti	= keyboard.nextInt();
		System.out.print("Jumlah Selai: ");
		jumlahSelai	= keyboard.nextInt();
		System.out.print("Jumlah Kismis: ");
		jumlahKismis	= keyboard.nextInt();
		System.out.print("Jumlah Mentega: ");
		jumlahMentega	= keyboard.nextInt();


		hargaRoti		= 15000;
		hargaSelai		= 8500;
		hargaKismis		= 7500;
		hargaMentega	= 3500;
		totalRoti		= hargaRoti * jumlahRoti;
		totalSelai		= hargaSelai * jumlahSelai;
		totalKismis		= hargaKismis * jumlahKismis;
		totalMentega	= hargaMentega * jumlahMentega;
		totalBelanja	= totalRoti + totalSelai + totalKismis + totalMentega;
		hasil 			= ( jumlahRoti <= 1 && jumlahRoti == 1 && jumlahMentega <= 1 && jumlahMentega == 1 && 
						  jumlahKismis >= 1 && jumlahSelai >= 1 && totalBelanja <= 100000 );

		
		System.out.println("Belanja bulanan sesuai " +hasil);
	}
}