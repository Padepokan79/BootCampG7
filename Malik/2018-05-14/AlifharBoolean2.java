/*
created by : malik chaudhary
time : 10-05-2018 6:58AM 
soal :

Deo sedang mencari mobil baru. Mobil lamanya sudah hampir rusak dan hanya mampu berjalan 20 km dalam 30 menit. 
Syarat yang dimilikinya untuk mobil  baru tersebut adalah: berwarna biru, memiliki kecepatan 30km/jam lebih cepat dari mobil lamanya, 
dan keluaran tahun 2016 atau 2017.

*/
import java.util.Scanner;
public class AlifharBoolean2{
	public static void main(String[] args){
		String warna;
		int kecepatan, keluaran, kecepatanAkhir, kecepatanMula, waktuAwal, kecepatanAwal, waktuJam, minKecepatan, kecepatanDimiliki,
		minTahun, maxTahun;
		boolean hasil;

		kecepatanMula = 20;
		waktuAwal = 30;
		waktuJam = 60;
		kecepatanDimiliki = 30;
		minTahun = 2016;
		maxTahun = 2017;

		Scanner deo = new Scanner(System.in);

		System.out.print("Warna mobil : ");
 		warna = deo.next();

		System.out.print("kecepatan mobil (Km/jam) : ");
 		kecepatan = deo.nextInt();


		System.out.print("Tahun rilis mobil : ");
 		keluaran = deo.nextInt();

 		kecepatanAwal  = (waktuJam/waktuAwal) * kecepatanMula;
 		minKecepatan   = kecepatanAwal + kecepatanDimiliki; 
 		kecepatanAkhir = kecepatanAwal + kecepatan;

 		hasil = ( warna.equals("biru") && kecepatan == minKecepatan && ( keluaran == minTahun || keluaran == maxTahun ) );

 		System.out.print("Apakah mobil sesuai ? : "+hasil);

	}
}