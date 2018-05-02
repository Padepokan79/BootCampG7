/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 08:50 AM     
     Updated By  : 
     Update Date : 
*/
class Rizaldi2 {
	public static void main(String[] args) {
		int tabAdi, hargaGitar, hari, praktikum, totTab, sisaUang;
		String soal;

		soal = "adi menabung perhari sebesar 2000 rupiah. dia hendak membeli gitar seharga 245.000 rupiah dari hasil tabungan nya itu. disaat hari ke 80 adi memakai uang tabungannya sebanyak 100.000 rupiah untuk mengikuti praktikum. berapa hari lagi agar adi bisa membeli gitar dari hasil tabungan dan sisa uang nya tersebut ?";

		tabAdi = 2000;
		hargaGitar = 245000;
		hari = 80;
		totTab = tabAdi * hari;
		System.out.println(soal);
		System.out.println();
		System.out.println("Tabungan adi di hari ke-80 sebelum bayar praktikum : Rp " + totTab);
		praktikum = 100000;
		sisaUang = totTab - praktikum;
		System.out.println("Tabungan adi di hari ke-80 setelah bayar praktikum : Rp " + sisaUang);
		sisaUang = hargaGitar - sisaUang;
		System.out.println("Sisa uang yang harus ditabung                      : Rp " + sisaUang);
		hari = sisaUang / tabAdi;
		System.out.println("Jumlah hari untuk menabung gitar                   : " + hari + " hari");		
	}
}