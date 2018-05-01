/*
created by 	: Yana
time		: 1 Mei 2018 15.06

Sebuah kamar mandi memiliki 2 pipa yang berbeda ukuran. 
Pipa kecil dapat mengalirkan air 10 liter/menit, sedangkan pipa besar 15 liter/menit. 
Waktu yang dibutuhkan untuk mengisi bak menggunakan pipa besar adalah 0,8 menit. 
Berapa menit yang dibutuhkan untuk mengisi bak menggunakan pipa kecil?
*/

public class Alifhar1{
	public static void main(String[] args){

		double aliranPipaKecil, aliranPipaBesar, waktuPipaBesar, waktuPipaKecil, jumlahLiter;

		aliranPipaKecil	= 10.0;
		aliranPipaBesar	= 15.0;
		waktuPipaBesar	= 0.8;
		jumlahLiter		= aliranPipaBesar * waktuPipaBesar / 1;
		waktuPipaKecil	= jumlahLiter / aliranPipaKecil;
		// waktuPipaKecil	= waktuPipaBesar * aliranPipaKecil / aliranPipaBesar;

		System.out.println("Waktu yang dibutuhkan adalah "+waktuPipaKecil+" menit");
	}
}