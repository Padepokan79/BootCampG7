/*
	* Created by:	Alifhar Juliansyah
	* 				01-05-2018	12.59
	* Updated by:
	*
*/

public class Alifhar1{
	public static void main(String[] args){
		System.out.println("Sebuah kamar mandi memiliki 2 pipa yang berbeda ukuran.");
		System.out.println("Pipa kecil mengalirkan air 10 liter/menit, pipa besar 15 liter/menit.");
		System.out.println("Waktu untuk mengisi bak menggunakan pipa besar adalah 0,8 menit.");
		System.out.println("Berapa menit yang dibutuhkan untuk mengisi bak menggunakan pipa kecil?");

		double kecil, besar, bak, waktu1, waktu2;
		kecil=10; besar=15;
		waktu1=0.8;
		bak=waktu1*besar;
		waktu2=bak/kecil;
		System.out.println("\nWaktu yang dibutuhkan menggunakan pipa kecil adalah "+waktu2+" menit");
	}
}