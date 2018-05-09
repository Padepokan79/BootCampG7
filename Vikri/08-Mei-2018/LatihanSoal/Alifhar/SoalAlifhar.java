/*  Created By Vikri
	08/05/2018

	1. Sebuah kamar mandi memiliki 2 pipa yang berbeda ukuran.
	   Pipa kecil dapat mengalirkan air 10 liter/menit,
	   sedangkan pipa besar 15 liter/menit. 
	   Waktu yang dibutuhkan untuk mengisi bak menggunakan pipa besar 
	   adalah 0,8 menit. Berapa menit yang dibutuhkan untuk mengisi 
	   bak menggunakan pipa kecil?
*/
public class SoalAlifhar{
	public static void main(String[] args) {
		double pipaBesar, pipaKecil, bakPb, hasil, jmlLiterBak;
		
		pipaBesar = 15;
		pipaKecil = 10;
		bakPb = 0.8;
		jmlLiterBak = pipaBesar/1*bakPb;

		hasil = jmlLiterBak/pipaKecil;
		

		System.out.println("Bak dengan diisi dengan pipa kecil dibutuhkan "+hasil+" Menit");
	}
}