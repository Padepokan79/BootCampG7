/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 17:30 PM     
     Updated By  : 
     Update Date : 
*/
class Rizaldi3 {
	public static void main(String[] args) {
		int gajiBoni, uangKost, makanTransport, keamanan, mobilAntik, totalUang, bebanUang, sisaUang, waktuTabung, waktuKonversi, waktuTahun;

		gajiBoni = 5000000;
		uangKost = 500000;
		makanTransport = 1000000;
		keamanan = 100000;
		mobilAntik = 60000000;

		System.out.println("Gaji Boni 	  : Rp " + gajiBoni);
		System.out.println("Uang Kost 	  : Rp " + uangKost);
		System.out.println("Makan & T 	  : Rp " + makanTransport);
		System.out.println("Uang keamanan : Rp " + keamanan + "/ 6 bulan");
		totalUang = 6 * gajiBoni;
		bebanUang = 6 * uangKost + 6 * makanTransport + keamanan;
		sisaUang  = totalUang - bebanUang;
		System.out.println("Total Uang Terkumpul Selama 6 bulan : Rp " + sisaUang);
		System.out.println("Harga Mobil Antik : Rp " + mobilAntik);
		sisaUang = mobilAntik - sisaUang;
		System.out.println("Butuh Uang        : Rp " + sisaUang);
		waktuTabung = (totalUang - bebanUang) / 6;
		waktuTabung = mobilAntik / waktuTabung;
		System.out.println("Waktu yang dibutuhkan untuk membeli mobil antik : " + waktuTabung + " bulan");
		waktuKonversi = waktuTabung % 12;
		waktuTahun  = (waktuTabung - waktuKonversi) / 12;
		System.out.println("Waktu yang dibutuhkan untuk membeli mobil antik : " + waktuTahun + " tahun " + waktuKonversi + " bulan");		
	}
}

/*
boni mendapat gajian perbulan sebesar 5000.000 rupiah, dia hendak membeli sebuah mobil antik seharga
60.000.000 rupiah. setiap bulan boni bisa menyisihkan uang hasil gajian setelah dipakai 500.000 untuk bayar kost,
1000.000 untuk keperluan makan dan transport, serta ada uang keamanan setiap 6 bulan sekali sebesar 100.000 rupah.
berapa tahun boni bisa membeli mobil antik tersebut dengan uang hasil gajian tersebut ?
*/