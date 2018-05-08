/*
	Data Created 	= 07 Mei 2018
	Author			= Nurdhiat Chaudhary Malik
*/
public class SoalCerita02{
	public static void main(String[] args){
		int jmlToko, jmlHelmTerjual, jmlHari, helmA, helmB, helmC, operasi;

		jmlToko 	= 5;
		jmlHelmTerjual = 3; // setiap toko dalam sehari
		jmlHari 	= 7;
		helmA 	= 250000;
		helmB 	= 50000;
		helmC 	= 650000;

		operasi 	= (helmA + helmB + helmC)*jmlToko*jmlHari;
		System.out.println("Hasil penjualan Helm dalam 1 minggu Rp " + operasi);
	}
}


