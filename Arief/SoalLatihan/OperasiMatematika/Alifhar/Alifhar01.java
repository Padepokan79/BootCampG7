/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Alifhar01 {
	public static void main( String[] args ){
		double pipaS, pipaL, spdPipaS, spdPipaL, spdPipaSEnd, spdPipaLEnd, mnt, literPipaL;

		// spd = Speed
		// S = Small
		// L = Large

		mnt = 60; // daLam detik
		spdPipaL = 15 / mnt; // kecepatan per detik
		spdPipaS = 10 / mnt; // kecepatan per detik

		pipaL = 0.8;
		spdPipaLEnd = pipaL * mnt;
		literPipaL = spdPipaL * spdPipaLEnd;
		spdPipaSEnd = literPipaL / spdPipaS;
		spdPipaSEnd = spdPipaSEnd / mnt;

		System.out.println("1. Sebuah kamar mandi memiliki 2 pipa yang berbeda ukuran.\nPipa kecil dapat mengalirkan air 10 liter/menit,\nsedangkan pipa besar 15 liter/menit. Waktu yang dibutuhkan\nuntuk mengisi bak menggunakan pipa besar adalah 0,8 menit.\nBerapa menit yang dibutuhkan untuk mengisi bak menggunakan\npipa kecil?");
		System.out.println( );
		System.out.println("Kecepatan pipa besar per detik = " + spdPipaL);
		System.out.printf("Kecepatan pipa kecil per detik = %.2f", spdPipaS);
		System.out.println( );
		System.out.println("Jumlah liter yang dialirkan pipa besar = " + literPipaL);
		System.out.println( );
		System.out.println("Waktu yang dibutuhkan pipa besar untuk mengisi bak = " + pipaL + " menit");
		System.out.println("Waktu yang dibutuhkan pipa kecil untuk mengisi bak = " + spdPipaSEnd + " menit");

		System.out.println();

	}
}