/*
Created by	: Yana
Time		: 14 Mei 2018 13.56
*/

import java.util.Scanner;

public class IkanTravel{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int 	bis6, bis12, bis18, bis32, bis45, bis60, jumlahPenumpang, maxPenumpang,
				hargaBis6, hargaBis12, hargaBis18, hargaBis32, hargaBis45, hargaBis60,
				rekomendasi, rekomendasi2;

		maxPenumpang = 120;

		bis6 	= 6;
		bis12	= 12;
		bis18	= 18;
		bis32	= 32;
		bis45	= 45;
		bis60	= 60;

		hargaBis6 	= 2000000;
		hargaBis12	= 1300000;
		hargaBis18	= 1500000;
		hargaBis32	= 1800000;
		hargaBis45	= 2000000;
		hargaBis60 	= 2300000;

		System.out.println("=======================================================");
		System.out.println("Selamat Datang di Ikan Travel\n");
		System.out.print("Masukkan jumlah penumpang (1-120): ");
		jumlahPenumpang = keyboard.nextInt();

		if ( jumlahPenumpang <= maxPenumpang) {
			
			if (jumlahPenumpang >= bis60) {
				System.out.println("\nBis yang tersedia dengan kursi " +bis60+ " dengan harga Rp " +hargaBis60);
			}
			if (jumlahPenumpang >= bis45) {
				System.out.println("Bis yang tersedia dengan kursi " +bis45+ " dengan harga Rp " +hargaBis45);			
			}
			if (jumlahPenumpang >= bis32) {
				System.out.println("Bis yang tersedia dengan kursi " + bis32+ " dengan harga Rp " +hargaBis32);			
			}
			if (jumlahPenumpang >= bis18) {
				System.out.println("Bis yang tersedia dengan kursi " + bis18+ " dengan harga Rp " +hargaBis18);			
			}
			if (jumlahPenumpang >= bis12) {
				System.out.println("Bis yang tersedia dengan kursi " + bis12+ " dengan harga Rp " +hargaBis12);			
			}
			if (jumlahPenumpang >= bis6) {
				System.out.println("Bis yang tersedia dengan kursi " + bis6+ "  dengan harga Rp " +hargaBis6);			
			}
			if (jumlahPenumpang < bis6) {
				System.out.println("Bis yang tersedia dengan kursi " + bis6+ "  dengan harga Rp " +hargaBis6);			
			}


			System.out.println("\nRekomendasi:");


			if ( jumlahPenumpang <= bis6 ) {
				rekomendasi =  hargaBis6;
				System.out.println("1 Bis dengan jumlah kursi " +bis6+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang > bis6 && jumlahPenumpang < bis12 ) {
				rekomendasi = hargaBis6 + hargaBis6;
				System.out.println("2 Bis dengan jumlah kursi " +bis6+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang == bis12 ) {
				rekomendasi = hargaBis12;
				System.out.println("1 Bis dengan jumlah kursi " +bis12+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang > bis12 && jumlahPenumpang < bis18) {
				rekomendasi = hargaBis12 + hargaBis12;
				System.out.println("2 Bis dengan jumlah kursi " +bis12+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang == bis18) {
				rekomendasi = hargaBis18;
				System.out.println("1 Bis dengan jumlah kursi " +bis18+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang > bis18 && jumlahPenumpang <= (bis12 + bis12)) {
				rekomendasi = hargaBis12 + hargaBis12;
				System.out.println("2 Bis dengan jumlah kursi " +bis12+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang > (bis12 + bis12) && jumlahPenumpang <= (bis12 + bis18)) {
				rekomendasi = hargaBis12 + hargaBis18;
				System.out.println("1 Bis dengan jumlah kursi " +bis12+ " dan 1 Bis dengan jumlah kurrsi " +bis18+" dengan harga Rp " +rekomendasi); 
			}
			else if ( jumlahPenumpang > (bis12 + bis18) && jumlahPenumpang < bis32) {
				rekomendasi = hargaBis18 + hargaBis18;
				System.out.println("2 Bis dengan jumlah kursi " +bis18+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang == bis32 ) {
				rekomendasi = hargaBis32;
				System.out.println("1 Bis dengan jumlah kursi " +bis32+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang > bis32 && jumlahPenumpang <= (bis18 + bis18)) {
				rekomendasi = hargaBis18 + hargaBis18;
				System.out.println("2 Bis dengan jumlah kursi " +bis18+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang > (bis18 + bis18) && jumlahPenumpang < bis45) {
				rekomendasi = hargaBis32 + hargaBis12;
				System.out.println("1 Bis dengan jumlah kursi " +bis12+ " dan 1 Bis dengan jumlah kursi " +bis32+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang == bis45 ) {
				rekomendasi = hargaBis45;
				System.out.println("1 Bis dengan jumlah kursi " +bis45+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang > bis45 && jumlahPenumpang <= (bis18 + bis32) ) {
				rekomendasi = hargaBis32 + hargaBis18;
				System.out.println("1 Bis dengan jumlah kursi " +bis18+ " dan 1 Bis dengan jumlah kursi " +bis32+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang > (bis18 + bis32) && jumlahPenumpang <= (bis45 + bis12)) {
				rekomendasi = hargaBis45 + hargaBis18;
				System.out.println("1 Bis dengan jumlah kursi " +bis18+ " dan " +bis45+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang > (bis45 + bis12) && jumlahPenumpang < bis60 ) {
				rekomendasi = hargaBis45 + hargaBis18;
				System.out.println("1 Bis dengan jumlah kursi " +bis18+ " dan 1 Bis dengan jumlah kursi " +bis45+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang == bis60) {
				rekomendasi = hargaBis60;
				System.out.println("1 Bis dengan jumlah kursi " +bis60+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang > bis60 && jumlahPenumpang < (bis32 + bis32) ) {
				rekomendasi = hargaBis32 + hargaBis32;
				System.out.println("2 Bis dengan jumlah kursi " +bis32+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang == (bis32 + bis32) ) {
				rekomendasi = hargaBis32 + hargaBis32;
				System.out.println("2 Bis dengan jumlah kursi " +bis32+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang > (bis32 + bis32) && jumlahPenumpang <= (bis60 + bis12) ) {
				rekomendasi = hargaBis60 + hargaBis12;
				System.out.println("1 Bis dengan jumlah kursi " +bis12+ " dan 1 Bis dengan jumlah kursi " +bis60+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang > (bis60 + bis12) && jumlahPenumpang <= (bis45 + bis32) ) {
				rekomendasi = hargaBis18 + hargaBis60;
				System.out.println("1 Bis dengan jumlah kursi " +bis18+ " dan 1 Bis dengan jumlah kursi " +bis60+ " dengan harga Rp " +rekomendasi);
				rekomendasi2= hargaBis32 + hargaBis45;
				System.out.println("1 Bis dengan jumlah kursi " +bis32+ " dan 1 Bis dengan jumlah kursi " +bis45+ " dengan harga Rp " +rekomendasi2);				
			}
			else if ( jumlahPenumpang == (bis60 + bis18) ) {
				rekomendasi = bis60 + bis18;
				System.out.println("1 Bis dengan jumlah kursi " +bis18+ " dan 1 Bis dengan jumlah kursi " +bis60+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang > (bis60 + bis18) && jumlahPenumpang <= (bis45 + bis45) ) {
				rekomendasi = hargaBis45 + hargaBis45;
				System.out.println("2 Bis dengan jumlah kursi " +bis45+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang > (bis45 + bis45) && jumlahPenumpang <= (bis60 + bis32) ) {
				rekomendasi = hargaBis32 + hargaBis60;
				System.out.println("1 Bis dengan jumlah kursi " +bis32+ " dan 1 Bis dengan jumlah kursi " +bis60+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang > (bis60 + bis32) && jumlahPenumpang <= (bis60 + bis45)) {
				rekomendasi = hargaBis45 + hargaBis60;
				System.out.println("1 Bis dengan jumlah kursi " +bis45+ " dan 1 Bis dengan jumlah kursi " +bis60+ " dengan harga Rp " +rekomendasi);
			}
			else if ( jumlahPenumpang > (bis45 + bis60) && jumlahPenumpang <= (bis60 + bis60)) {
				rekomendasi = hargaBis60 + hargaBis60;
				System.out.println("2 Bis dengan jumlah kursi " +bis60+ " dengan harga Rp " +rekomendasi);
			}


		}else{
			System.out.println("Masukkan jumlah penumpang 1-120 orang");
		}

		
	}
}

/*
IKAN Travel 6b

Bis Dengan Kursi 60 		Rp. 2.300.000
Bis Dengan Kursi 45		Rp. 2.000.000
Bis Dengan Kursi 32		Rp. 1.800.000
Bis Dengan Kursi 18		Rp. 1.500.000
Bis Dengan Kursi 12		Rp. 1.300.000
Bis Dengan Kursi 6 Executive	Rp. 2.000.000

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