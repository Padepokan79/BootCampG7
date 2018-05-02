/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Rizaldi02{
	public static void main ( String[]args ){
		double harian, gitar, hariPakai, uangPakai, sisaTarget, sisaAkhir;

		harian = 2000;
		hariPakai = 80;
		gitar = 245000;
		uangPakai = (harian * hariPakai) - 100000;
		sisaTarget = gitar - uangPakai;
		sisaAkhir = sisaTarget / 2000;

		System.out.println("adi menabung perhari sebesar 2000 rupiah. dia hendak \n" +
							"membeli gitar seharga 245.000 rupiah dari hasil tabungan \n" +
							"nya itu. disaat hari ke 80 adi memakai uang tabungannya \n" +
							"sebanyak 100.000 rupiah untuk mengikuti praktikum. berapa \n" +
							"hari lagi agar adi bisa membeli gitar dari hasil tabungan \n" +
							"dan sisa uang nya tersebut ?\n");
		
		System.out.printf("Total hari hingga adi dapat membeli gitar %.1f", sisaAkhir);
	}
}