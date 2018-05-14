/*
created by : Malik Chaudhary
time : 14-05-2018 10:29AM
soal: 

IKAN Travel 6b

Bis Dengan Kursi 60     Rp. 2.300.000
Bis Dengan Kursi 45		Rp. 2.000.000
Bis Dengan Kursi 32		Rp. 1.800.000
Bis Dengan Kursi 18		Rp. 1.500.000
Bis Dengan Kursi 12		Rp. 1.300.000
Bis Dengan Kursi 6 Executive	Rp. 2.000.000

*/

import java.util.Scanner;
public class IkanTravel{
	public static void main(String[] args){
		Scanner bis = new Scanner(System.in);
		int penumpang, maxPenumpang, hargaSatu, hargaDua, hargaTiga, hargaEmpat, hargaLima, hargaEnam,
		kursiSatu, kursiDua, kursiTiga, kursiEmpat, kursiLima, kursiEnam, maxKursi;	
		maxPenumpang = 120;
		hargaSatu = 2300000;
		hargaDua = 2000000;
		hargaTiga = 1800000;
		hargaEmpat = 1500000;
		hargaLima = 1300000;
		hargaEnam = 2000000;

		kursiSatu = 60;
		kursiDua = 45;
		kursiTiga = 32;
		kursiEmpat = 18;
		kursiLima = 12;
		kursiEnam = 6;
		maxKursi = 120;

		System.out.println("===========================");
		System.out.println("Selamat Datang di Ikan Travel ");
		System.out.println("Masukan jumlah penumpang : ");
		penumpang = bis.nextInt();
		System.out.println("Bus yang tersedia untuk anda : ");

		if (penumpang > maxKursi) {
			System.out.println("Maaf jumlah penumpang maxximum");
		}else{

			if ( penumpang >= kursiSatu && maxPenumpang <= maxKursi) {
				System.out.println("Bis Dengan Kursi 60\t\t Rp. 2.300.000 ");
				
			}
			if ( penumpang >= kursiDua && maxPenumpang <= maxKursi) {
				System.out.println("Bis Dengan Kursi 45\t\tRp. 2.000.000");
				
			}
			if ( penumpang >= kursiTiga && maxPenumpang <= maxKursi) {
				System.out.println("Bis Dengan Kursi 32\t\tRp. 1.800.000");
				
			}
			if ( penumpang >= kursiEmpat && maxPenumpang <= maxKursi) {
				System.out.println("Bis Dengan Kursi 18\t\tRp. 1.500.000");
				
			}
			if ( penumpang >= kursiLima && maxPenumpang <= maxKursi) {
				System.out.println("Bis Dengan Kursi 12\t\tRp. 1.300.000");
				
			}
			if ( ( penumpang >= kursiEnam || penumpang < kursiEnam ) && maxPenumpang <= maxKursi )  {
				System.out.println("Bis Dengan Kursi 6 Executive\t Rp. 2.000.000");
				
			}
			if ( penumpang == maxKursi ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("2 Bis Dengan Kursi 60 dengan harga Rp."+(hargaSatu+hargaSatu));
			}
			if ( penumpang < maxKursi && penumpang >= 106 ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("2 Bis Dengan Kursi 60 dengan harga Rp."+(hargaSatu+hargaSatu));
			}
			else if ( penumpang <= 105 && penumpang >= 93) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 60 dan 1 bis dengan 45 kursi dengan harga Rp."+(hargaSatu+hargaDua));
			}
			else if ( penumpang <= 92 && penumpang >= 91 ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 60 dan 1 bis dengan 32 kursi dengan harga Rp."+(hargaSatu+hargaTiga));
			}
			else if ( penumpang == 90 ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("2 Bis Dengan Kursi 45 dengan harga Rp."+(hargaDua+hargaDua));
			}else if ( penumpang <= 89 && penumpang >= 79 ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("2 Bis dengan 45 kursi dengan harga Rp."+(hargaDua+hargaDua));
			}
			else if (penumpang == 78) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 60 dan 1 Bis dengan kursi 18 dengan harga Rp."+(hargaSatu+hargaEmpat));
			}
			else if (penumpang <= 77 && penumpang >= 73) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 60 dan 1 Bis dengan kursi 18 dengan harga Rp."+(hargaSatu+hargaEmpat));
				System.out.println("1 Bis Dengan Kursi 45 dan 1 Bis dengan kursi 32 dengan harga Rp."+(hargaDua+hargaTiga));
			}
			else if ( penumpang <= 72 && penumpang >= 65 ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 60 dan 1 bis dengan kursi 12 dengan harga Rp."+(hargaSatu+hargaLima));
			}
			else if (penumpang == 64) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("2 Bis Dengan Kursi 32 dengan harga Rp."+(hargaTiga+hargaTiga) );
			}
			else if ( penumpang <= 63 && penumpang >= 61 ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 45 dan 1 Bis dengan kursi 18 dengan harga Rp."+(hargaLima+hargaEmpat) );
			}
			else if (penumpang == kursiSatu ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 60 dengan harga Rp."+hargaSatu );
			}
			else if ( penumpang <= 59 && penumpang >= 58 ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 45 dan 1 Bis dengan kursi 18 dengan harga Rp."+(hargaLima+hargaEmpat) );
			}
			else if (penumpang <= 57 && penumpang >= 51) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 45 dan 1 Bis dengan kursi 12 dengan harga Rp."+(hargaDua+hargaLima) );
			}
			else if (penumpang <= 50 && penumpang >= 46) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 32 dan 1 Bis dengan kursi 18 dengan harga Rp."+(hargaTiga+hargaEmpat) );
			}
			else if (penumpang == 45 ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 45 dengan harga Rp."+hargaDua );
			}
			else if ( penumpang <= 44 && penumpang >= 37 ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 32 dan 1 Bis dengan kursi 12 dengan harga Rp."+(hargaTiga+hargaLima) );
			}
			else if ( penumpang <= 36 && penumpang >= 33 ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("2 Bis Dengan Kursi 18 dengan harga Rp."+(hargaEmpat+hargaEmpat) );
			}
			else if (penumpang == 32 ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 32 dengan harga Rp."+hargaTiga );
			}
			else if ( penumpang == 31 ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("2 Bis Dengan Kursi 18 dengan harga Rp."+(hargaEmpat+hargaEmpat) );
			}
			else if ( penumpang <= 30 && penumpang >= 25 ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 12 dan 1 bis dengan kursi 18 dengan harga Rp."+(hargaLima+hargaEmpat) );
			}
			else if ( penumpang <= 24 && penumpang >= 19 ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("2 Bis Dengan Kursi 12 dengan harga Rp."+(hargaLima+hargaLima) );
			}
			else if (penumpang == 18) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 18 dengan harga Rp."+hargaEmpat );
			}
			else if ( penumpang <= 17 && penumpang >= 13 ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("2 Bis Dengan Kursi 12 dengan harga Rp."+(hargaLima+hargaLima) );
			}
			else if (penumpang == 12) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 12 dengan harga Rp."+hargaLima);
			}
			else if ( penumpang < 12 && penumpang >= 7 ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("2 Bis Dengan Kursi 6 Executive dengan harga Rp."+(hargaEnam+hargaEnam));
			}
			else if ( penumpang <= 6 ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 6 Executive dengan harga Rp."+(hargaEnam) );
			}

		}


		
	}
}