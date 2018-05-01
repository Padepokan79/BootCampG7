public class Rizaldi3 {
	public static void main (String[] args) {

		double gaji, mobil, kost, akomod, keamanan, sisa, tahun;

		gaji = 5000000;
		mobil = 60000000;
		kost = 500000;
		akomod = 1000000;
		keamanan = 100000; // 6 bulan sekali

		sisa = ((12*gaji)-(12*(kost+akomod))-(2*keamanan)); // sisa gaji per tahun
		tahun = mobil /sisa;


		System.out.println ("boni mendapat gajian perbulan sebesar 5000.000 rupiah,\ndia hendak membeli sebuah mobil antik seharga\n60.000.000 rupiah.\nsetiap bulan boni bisa menyisihkan uang hasil gajian setelah dipakai 500.000 untuk bayar kost,\n1000.000 untuk keperluan makan dan transport, serta ada uang keamanan setiap 6 bulan sekali sebesar 100.000 rupah.\nberapa tahun boni bisa membeli mobil antik tersebut dengan uang hasil gajian tersebut ?");
		System.out.println ("Jadi, Boni akan dapat membeli mobil antik " + tahun + " tahun lagi");
	}
}

