/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Rizaldi03{
	public static void main ( String[]args ){
		double bulanan, tahun, tahunan, mobil, kost, makan, keamanan, sisa, target;

		bulanan = 5000000;
		tahun = 12;
		mobil = 60000000;
		kost = 500000;
		makan = 1000000;
		keamanan = 100000 / 6;
		sisa = bulanan - (kost + makan + keamanan);
		tahunan = sisa * tahun;
		target = (mobil - tahunan) / tahunan;

		System.out.println("boni mendapat gajian perbulan sebesar 5000.000 rupiah, \n" +
							"dia hendak membeli sebuah mobil antik seharga 60.000.000 \n" +
							"rupiah. setiap bulan boni bisa menyisihkan uang hasil gajian \n" +
							"setelah dipakai 500.000 untuk bayar kost, 1000.000 untuk \n" +
							"keperluan makan dan transport, serta ada uang keamanan setiap \n" +
							"6 bulan sekali sebesar 100.000 rupah. berapa tahun boni bisa \n" +
							"membeli mobil antik tersebut dengan uang hasil gajian tersebut ?\n");
		
		System.out.printf("Total tahun hingga Boni dapat membeli Mobil antik adalah %.1f tahun", target);
	}
}