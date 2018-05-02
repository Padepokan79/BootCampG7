/*
created by 	: Yana
time		: 1 Mei 2018

2. adi menabung perhari sebesar 2000 rupiah. dia hendak membeli gitar seharga 245.000 rupiah
dari hasil tabungan nya itu. disaat hari ke 80 adi memakai uang tabungannya sebanyak 100.000 rupiah
untuk mengikuti praktikum.
berapa hari lagi agar adi bisa membeli gitar dari hasil tabungan dan sisa uang nya tersebut ?
*/

public class Rizaldi2{
	public static void main(String[] args){
		double simpanHarian, hargaGitar, hariPenganmbilan, jumlahPengambilan, sisaHari, jumlahSimpanan;

		simpanHarian		= 2000;
		hargaGitar			= 245000;
		hariPenganmbilan	= 80;
		jumlahPengambilan	= 100000;
		sisaHari			= 0;
		jumlahSimpanan		= 0;

		jumlahSimpanan		= hariPenganmbilan * simpanHarian - jumlahPengambilan;
		sisaHari			= hargaGitar - jumlahSimpanan;
		sisaHari			= sisaHari / simpanHarian;

		System.out.printf(" Jumlah %.1f\n" ,jumlahSimpanan);
		System.out.printf(" Jumlah %.1f\n" ,sisaHari);

	}
}