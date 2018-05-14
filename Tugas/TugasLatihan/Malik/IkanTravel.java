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
		int ratusEnam =	106;
		int ratusLima =	105;
		int bilanTiga =	93;
		int bilanDua = 92;
		int bilanSatu =	91;
		int bilanPuluh = 90;
		int lapanBilan = 89;
		int juhBilan = 79;
		int juhLapan = 78;
		int juJuh =	77;
		int juhTiga = 73;
		int juhDua = 72;
		int namLima = 65;
		int namEmpat = 64;
		int namTiga = 63;
		int maLapan = 58;
		int maJuh =	57;
		int maSatu = 51;
		int maPuluh = 50;
		int tigaJuh = 37;
		int tigaNam = 36;
		int tigaSatu = 31;
		int tigaPuluh =	30;
		int duaMa = 25;
		int duaPat = 24;

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
			if ( penumpang < maxKursi && penumpang >= ratusEnam ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("2 Bis Dengan Kursi 60 dengan harga Rp."+(hargaSatu+hargaSatu));
			}
			else if ( penumpang <= ratusLima && penumpang >= bilanTiga) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 60 dan 1 bis dengan 45 kursi dengan harga Rp."+(hargaSatu+hargaDua));
			}
			else if ( penumpang <= bilanDua && penumpang >= bilanSatu ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 60 dan 1 bis dengan 32 kursi dengan harga Rp."+(hargaSatu+hargaTiga));
			}
			else if ( penumpang == bilanPuluh ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("2 Bis Dengan Kursi 45 dengan harga Rp."+(hargaDua+hargaDua));
			}else if ( penumpang <= lapanBilan && penumpang >= juhBilan ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("2 Bis dengan 45 kursi dengan harga Rp."+(hargaDua+hargaDua));
			}
			else if (penumpang == juhLapan) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 60 dan 1 Bis dengan kursi 18 dengan harga Rp."+(hargaSatu+hargaEmpat));
			}
			else if (penumpang <= juJuh && penumpang >= juhTiga) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 60 dan 1 Bis dengan kursi 18 dengan harga Rp."+(hargaSatu+hargaEmpat));
				System.out.println("1 Bis Dengan Kursi 45 dan 1 Bis dengan kursi 32 dengan harga Rp."+(hargaDua+hargaTiga));
			}
			else if ( penumpang <= juhDua && penumpang >= namLima ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 60 dan 1 bis dengan kursi 12 dengan harga Rp."+(hargaSatu+hargaLima));
			}
			else if (penumpang == namEmpat) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("2 Bis Dengan Kursi 32 dengan harga Rp."+(hargaTiga+hargaTiga) );
			}
			else if ( penumpang <= namTiga && penumpang > kursiSatu ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 45 dan 1 Bis dengan kursi 18 dengan harga Rp."+(hargaLima+hargaEmpat) );
			}
			else if (penumpang == kursiSatu ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 60 dengan harga Rp."+hargaSatu );
			}
			else if ( penumpang < kursiSatu && penumpang >= maLapan ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 45 dan 1 Bis dengan kursi 18 dengan harga Rp."+(hargaLima+hargaEmpat) );
			}
			else if (penumpang <= maJuh && penumpang >= maSatu) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 45 dan 1 Bis dengan kursi 12 dengan harga Rp."+(hargaDua+hargaLima) );
			}
			else if (penumpang <= maPuluh && penumpang > kursiDua) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 32 dan 1 Bis dengan kursi 18 dengan harga Rp."+(hargaTiga+hargaEmpat) );
			}
			else if (penumpang == kursiDua ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 45 dengan harga Rp."+hargaDua );
			}
			else if ( penumpang < kursiDua && penumpang >= tigaJuh ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 32 dan 1 Bis dengan kursi 12 dengan harga Rp."+(hargaTiga+hargaLima) );
			}
			else if ( penumpang <= tigaNam && penumpang > kursiTiga ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("2 Bis Dengan Kursi 18 dengan harga Rp."+(hargaEmpat+hargaEmpat) );
			}
			else if (penumpang == kursiTiga ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 32 dengan harga Rp."+hargaTiga );
			}
			else if ( penumpang == tigaSatu ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("2 Bis Dengan Kursi 18 dengan harga Rp."+(hargaEmpat+hargaEmpat) );
			}
			else if ( penumpang <= tigaPuluh && penumpang >= duaMa ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 12 dan 1 bis dengan kursi 18 dengan harga Rp."+(hargaLima+hargaEmpat) );
			}
			else if ( penumpang <= duaPat && penumpang > kursiEmpat ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("2 Bis Dengan Kursi 12 dengan harga Rp."+(hargaLima+hargaLima) );
			}
			else if (penumpang == kursiEmpat) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 18 dengan harga Rp."+hargaEmpat );
			}
			else if ( penumpang < kursiEmpat && penumpang > kursiLima ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("2 Bis Dengan Kursi 12 dengan harga Rp."+(hargaLima+hargaLima) );
			}
			else if (penumpang == kursiLima) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 12 dengan harga Rp."+hargaLima);
			}
			else if ( penumpang < kursiLima && penumpang > kursiEnam ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("2 Bis Dengan Kursi 6 Executive dengan harga Rp."+(hargaEnam+hargaEnam));
			}
			else if ( penumpang <= kursiEnam ) {
				System.out.println("*Rekomendasi Bis Untuk anda");
				System.out.println("1 Bis Dengan Kursi 6 Executive dengan harga Rp."+(hargaEnam) );
			}

		}


		
	}
}