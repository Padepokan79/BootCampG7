/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Arief02{
	public static void main( String[] args){
	int toko, helmA, helmB, helmC, totalHargaHelm, satuMinggu;

	toko = 5;
	helmA = 250000;
	helmB = 50000;
	helmC = 650000;
	satuMinggu = 7;
	totalHargaHelm = ((helmA * toko) + (helmB * toko) + (helmC * toko)) * satuMinggu;


	System.out.println("Ucup memiliki 5 buah toko helm, dalam sehari setiap toko helmnya berhasil \n" + 
						"menjual sebanyak 3 buah helm dengan masing-masing harga helmnya, \n" +
						"Rp. 250.000 Helm A, Rp. 50.000 Helm B, Rp. 650.000 Helm C. \n" +
						"Berapa hasil penjualan Helm dalam 1 minggu?\n");

	System.out.println("Hasil penjualan helm = " + totalHargaHelm);

	}
}