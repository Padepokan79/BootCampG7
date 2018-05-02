/*
	* Created by:	Alifhar Juliansyah
	* 				01-05-2018	08:37
	* Updated by:
	*
*/

public class Arief2{
	public static void main(String[] args){
		System.out.println("Ucup memiliki 5 buah toko helm,");
		System.out.println("dalam sehari setiap toko helmnya berhasil menjual sebanyak 3 buah helm");
		System.out.println("dengan masing-masing harga helmnya,");
		System.out.println("Rp. 250.000 Helm A, Rp. 50.000 Helm B, Rp. 650.000 Helm C.");
		System.out.println("Berapa hasil penjualan Helm dalam 1 minggu?");

		int toko, helmA, helmB, helmC, penjualan;
		toko=5; helmA=250000; helmB=50000; helmC=650000;
		penjualan=(helmA+helmB+helmC)*toko*7;
		System.out.println("\nRp "+penjualan);
	}
}