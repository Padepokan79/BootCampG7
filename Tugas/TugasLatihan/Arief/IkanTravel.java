/*
Date Created	: 14 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class IkanTravel {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int		passenger, totHarga, harga60, harga45, harga32, harga18, harga12, harga6, bis1, bis2,
				kursi6, kursi12, kursi18, kursi32, kursi45, kursi60, rekomBis, maxPass, rekomendasi, rekomendasi2;

		harga60 = 2300000;
		harga45 = 2000000;
		harga32 = 1800000;
		harga18 = 1500000;
		harga12 = 1300000;
		harga6 = 2000000;

		kursi6 	= 6;
		kursi12	= 12;
		kursi18	= 18;
		kursi32	= 32;
		kursi45	= 45;
		kursi60	= 60;

		maxPass = 120;
		bis1 = 1;
		bis2 = 2;


		// rekomBis = 0;
		// z = 0;
		// totHarga = 0;
		// kursi = 0;

		System.out.println("=============================");
		System.out.println("Selamat Datang di ikan Travel");

		System.out.print("Masukan Jumlah Penumpang: ");
		passenger = keyboard.nextInt();

		/*if (passenger >= 60) {
			kursi = 60;
		}else if (passenger >= 45) {
			kursi = 45;
		}else if (passenger >= 32) {
			kursi = 32;
		}else if (passenger >= 18) {
			kursi = 18;
		}else if (passenger >= 12) {
			kursi = 12;
		}else if (passenger > 0 ) {
			kursi = 6;
		}*/

		System.out.println("Bis yang tersedia: ");

		if ( passenger <= maxPass) {
			
			if (passenger >= kursi60) {
				System.out.println("\n\tBis Dengan Kursi " + kursi60 + " memiliki harga Rp " + harga60);
			}
			if (passenger >= kursi45) {
				System.out.println("\tBis Dengan Kursi " + kursi45 + " memiliki harga Rp " + harga45);
			}
			if (passenger >= kursi32) {
				System.out.println("\tBis Dengan Kursi " + kursi32 + " memiliki harga Rp " + harga32);
			}
			if (passenger >= kursi18) {
				System.out.println("\tBis Dengan Kursi " + kursi18 + " memiliki harga Rp " + harga18);
			}
			if (passenger >= kursi12) {
				System.out.println("\tBis Dengan Kursi " + kursi12 + " memiliki harga Rp " + harga12);
			}
			if (passenger >= kursi6) {
				System.out.println("\tBis Dengan Kursi " + kursi6 + "  memiliki harga Rp " + harga6);
			}
			if (passenger < kursi6) {
				System.out.println("\tBis Dengan Kursi " + kursi6 + "  memiliki harga Rp " + harga6);
			}


			System.out.println("\n* Rekomendasi Bis Untuk anda: ");


			if ( passenger <= kursi6 ) {
				rekomendasi = bis1 * harga6;
				System.out.println("1 Bis dengan jumlah kursi " +kursi6+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger > kursi6 && passenger < kursi12 ) {
				rekomendasi = bis2 * harga6;
				System.out.println("2 Bis dengan jumlah kursi " +kursi6+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger == kursi12 ) {
				rekomendasi = bis1 * harga12;
				System.out.println("1 Bis dengan jumlah kursi " +kursi12+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger > kursi12 && passenger < kursi18) {
				rekomendasi = bis2 * harga12;
				System.out.println("2 Bis dengan jumlah kursi " +kursi12+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger == kursi18) {
				rekomendasi = bis1 * harga18;
				System.out.println("1 Bis dengan jumlah kursi " +kursi18+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger > kursi18 && passenger <= (kursi12+kursi12)) {
				rekomendasi = bis2 * harga12;
				System.out.println("2 Bis dengan jumlah kursi " +kursi12+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger > (kursi12+kursi12) && passenger <= (kursi18+kursi12)) {
				rekomendasi = (bis1 * harga12) + (bis1 * harga18);
				System.out.println("1 Bis dengan jumlah kursi " +kursi12+ " dan 1 Bis dengan jumlah kurrsi " +kursi18+" dengan harga Rp " +rekomendasi); 
			}
			else if ( passenger > kursi18+kursi12 && passenger < kursi32) {
				rekomendasi = bis2 * harga18;
				System.out.println("2 Bis dengan jumlah kursi " +kursi18+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger == kursi32 ) {
				rekomendasi = bis1 * harga32;
				System.out.println("1 Bis dengan jumlah kursi " +kursi32+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger > kursi32 && passenger <= (kursi18+kursi18)) {
				rekomendasi = bis2 * harga18;
				System.out.println("2 Bis dengan jumlah kursi " +kursi18+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger > (kursi18+kursi18) && passenger < kursi45) {
				rekomendasi = (bis1 * harga32) + (bis1 * harga12);
				System.out.println("1 Bis dengan jumlah kursi " +kursi12+ " dan 1 Bis dengan jumlah kursi " +kursi32+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger == kursi45 ) {
				rekomendasi = bis1 * harga45;
				System.out.println("1 Bis dengan jumlah kursi " +kursi45+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger > kursi45 && passenger <= (kursi18+kursi32) ) {
				rekomendasi = (bis1 * harga32) + (bis1 * harga18);
				System.out.println("1 Bis dengan jumlah kursi " +kursi18+ " dan 1 Bis dengan jumlah kursi " +kursi32+ " dengan harga Rp " +rekomendasi);
				rekomendasi = (bis1 * harga45) + (bis1 * harga12);
				System.out.println("1 Bis dengan jumlah kursi " +kursi12+ " dan 1 Bis dengan jumlah kursi " +kursi45+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger >= (kursi45+kursi6) && passenger <= (kursi12+kursi45)) {
				rekomendasi = (bis1 * harga45) + (bis1 * harga18);
				System.out.println("1 Bis dengan jumlah kursi " +kursi18+ " dan " +kursi45+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger > (kursi12+kursi45) && passenger < kursi60 ) {
				rekomendasi = ( bis1 * harga45) + (bis1 * harga18);
				System.out.println("1 Bis dengan jumlah kursi " +kursi18+ " dan 1 Bis dengan jumlah kursi " +kursi45+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger == kursi60) {
				rekomendasi = bis1 * harga60;
				System.out.println("1 Bis dengan jumlah kursi " +kursi60+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger > kursi60 && passenger < (kursi32+kursi32) ) {
				rekomendasi = bis2 * harga32;
				System.out.println("2 Bis dengan jumlah kursi " +kursi32+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger == (kursi32+kursi32) ) {
				rekomendasi = bis2 * harga32;
				System.out.println("2 Bis dengan jumlah kursi " +kursi32+ " dengan harga Rp " +rekomendasi);
				rekomendasi = (bis1 * harga60) + (bis1 * harga12);
				System.out.println("1 Bis dengan jumlah kursi " +kursi12+ " dan 1 Bis dengan jumlah kursi " +kursi60+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger > (kursi32+kursi32) && passenger <= (kursi60+kursi12) ) {
				rekomendasi = (bis1 * harga60) + (bis1 * harga12);
				System.out.println("1 Bis dengan jumlah kursi " +kursi12+ " dan 1 Bis dengan jumlah kursi " +kursi60+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger > (kursi12+kursi60) && passenger < (kursi60+kursi18) ) {
				rekomendasi = (bis1 * harga18) + (bis1 * harga60);
				System.out.println("1 Bis dengan jumlah kursi " +kursi18+ " dan 1 Bis dengan jumlah kursi " +kursi60+ " dengan harga Rp " +rekomendasi);
				rekomendasi2= (bis1 * harga32) + (bis1 * harga45);
				System.out.println("1 Bis dengan jumlah kursi " +kursi32+ " dan 1 Bis dengan jumlah kursi " +kursi45+ " dengan harga Rp " +rekomendasi2);				
			}
			else if ( passenger == (kursi60+kursi18) ) {
				rekomendasi = (bis1 * harga60) + (bis1 * harga18);
				System.out.println("1 Bis dengan jumlah kursi " +kursi18+ " dan 1 Bis dengan jumlah kursi " +kursi60+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger > (kursi60+kursi18) && passenger <= (kursi45+kursi45) ) {
				rekomendasi = bis2 * harga45;
				System.out.println("2 Bis dengan jumlah kursi " +kursi45+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger > (kursi45+kursi45) && passenger <= (kursi32+kursi60) ) {
				rekomendasi = (bis1 * harga32) + (bis1 * harga60);
				System.out.println("1 Bis dengan jumlah kursi " +kursi32+ " dan 1 Bis dengan jumlah kursi " +kursi60+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger > (kursi32+kursi60) && passenger <= (kursi45+kursi60)) {
				rekomendasi = (bis1 * harga45) + (bis1 * harga60);
				System.out.println("1 Bis dengan jumlah kursi " +kursi45+ " dan 1 Bis dengan jumlah kursi " +kursi60+ " dengan harga Rp " +rekomendasi);
			}
			else if ( passenger > (kursi45+kursi60) && passenger <= (kursi60+kursi60)) {
				rekomendasi = bis2 * harga60;
				System.out.println("2 Bis dengan jumlah kursi " +kursi60+ " dengan harga Rp " +rekomendasi);
			}


		}else{
			System.out.println("Maksimal penumpang adalah 120 orang");
		}
		
	}
}
		/*

		IKAN Travel 6b

		Bis Dengan Kursi 60 	Rp. 2.300.000
		Bis Dengan Kursi 45		Rp. 2.000.000
		Bis Dengan Kursi 32		Rp. 1.800.000
		Bis Dengan Kursi 18		Rp. 1.500.000
		Bis Dengan Kursi 12		Rp. 1.300.000
		Bis Dengan Kursi 6 Executive	Rp. 2.000.000
		Maksimal jumlah penumpang 120 Orang

		==========================
		Selamat Datang di ikan Travel

		Masukan Jumlah Penumpang : 
		27

		Bus yang Tersedia Untuk Anda:

		Bis Dengan Kursi 18		Rp. 1.500.000
		Bis Dengan Kursi 12		Rp. 1.300.000
		Bis Dengan Kursi 6 Executive	Rp. 2.000.000

		* Rekomendasi Bis Untuk anda
		- 1 Bis Dengan 18 kursi dan 1 Bis dengan 12 Kursi dengan Harga 2.800.000

		*/
