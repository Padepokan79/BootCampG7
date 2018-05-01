/*
	* Created by:	Alifhar Juliansyah
	* 				01-05-2018	11.49
	* Updated by:
	*
*/

public class Rizaldi3{
	public static void main(String[] args){
		System.out.println("boni mendapat gajian perbulan sebesar 5000.000 rupiah,");
		System.out.println("dia hendak membeli sebuah mobil antik seharga 60.000.000 rupiah.");
		System.out.println("Setiap bulan boni menghabiskan 500.000 untuk bayar kost,");
		System.out.println("1000.000 untuk  makan dan transport, serta keamanan setiap 6 bulan sekali 100.000 rupah.");
		System.out.println("berapa tahun boni bisa membeli mobil antik");

		double gaji, mobil, kost, makan, keamanan, pertahun, sisa;
		gaji=5000000; mobil=60000000;
		kost=500000; makan= 1000000; keamanan=100000;
		pertahun=(gaji-kost-makan)*12-keamanan*2;
		sisa=mobil/pertahun;
		System.out.println("\nBoni dapat membeli mobil antik dalam  "+sisa+" tahun lagi");
	}
}