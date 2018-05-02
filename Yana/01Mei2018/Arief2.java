/*
created by 	: Yana
time		: 1 Mei 2018

Ucup memiliki 5 buah toko helm, dalam sehari setiap toko helmnya 
berhasil menjual sebanyak 3 buah helm dengan masing-masing harga helmnya, 
Rp. 250.000 Helm A, Rp. 50.000 Helm B, Rp. 650.000 Helm C. 
Berapa hasil penjualan Helm dalam 1 minggu?
*/

public class Arief2{
	public static void main(String[] args){

		int jumlahToko, jumlahPenjualan, hargaHelmA, hargaHelmB, hargaHelmC, penjualan, jumlahHari;

		jumlahToko		= 5;
		jumlahPenjualan	= 3;
		hargaHelmA		= 250000;
		hargaHelmB		= 50000;
		hargaHelmC		= 650000;
		jumlahHari		= 21;

		penjualan 		= hargaHelmA + hargaHelmB + hargaHelmC;
		penjualan 		= penjualan * jumlahToko;
		penjualan 		= penjualan * jumlahHari;

		System.out.print("Jumlah penjualan helm dalam 3 minggu adalah Rp. " +penjualan);
	}
}

