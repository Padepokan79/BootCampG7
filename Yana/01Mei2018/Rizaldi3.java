/*
created by : Yana
*/
/*
3. boni mendapat gajian perbulan sebesar 5000.000 rupiah, dia hendak membeli sebuah mobil antik seharga
60.000.000 rupiah. setiap bulan boni bisa menyisihkan uang hasil gajian setelah dipakai 500.000 untuk bayar kost,
1000.000 untuk keperluan makan dan transport, serta ada uang keamanan setiap 6 bulan sekali sebesar 100.000 rupah.
berapa tahun boni bisa membeli mobil antik tersebut dengan uang hasil gajian tersebut ?
*/

public class Rizaldi3{
	public static void main(String[] args){

		double gajiBulanan, hargaMobil, bayarKos, biayaMakan, uangKeamanan, lamaMenabung;

		gajiBulanan		= 5000000;
		hargaMobil		= 60000000;
		bayarKos		= 500000;
		biayaMakan		= 1000000;
		uangKeamanan	= 100000 /6;
		lamaMenabung	= 0;

		gajiBulanan		= gajiBulanan - bayarKos - biayaMakan - uangKeamanan;
		lamaMenabung	= (hargaMobil / gajiBulanan) / 12;

		// System.out.println(" simpan perbulan " +gajiBulanan);
		System.out.printf(" Lama Boni untuk membeli mobil adalah %.1f " ,lamaMenabung);

	}
}