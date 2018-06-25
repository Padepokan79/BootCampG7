package rrv;

import java.util.Scanner;
import java.util.Random;

class AppPakaian {
	
	private static Scanner inputan;

	public static void main(String[] args) {
		
		String ukuran, bahan, warna, merk, madeIn, inputHarga;
		double harga;
		
		harga = 0.0;
		inputHarga = "";
		
		inputan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Masukkan Ukuran Jaket : ");
		ukuran = inputan.nextLine();
		System.out.println();
		
		System.out.print("Masukkan bahan yang diinginkan : ");
		bahan = inputan.nextLine();
		System.out.println();
		
		System.out.print("Masukkan warna yang diinginkan : ");
		warna = inputan.nextLine();
		System.out.println();
		
		System.out.print("Masukkan merk yang diinginkan : ");
		merk = inputan.nextLine();
		System.out.println();
		
		System.out.print("Produk Buatan : ");
		madeIn = inputan.nextLine();
		System.out.println();
		
		if(merk.equals("nike") || (merk.equals("adidas"))) {
			harga = 200000.0 + Math.floor(rand.nextInt(50000)+10000);
		}
		else {
			System.out.print("Harga nya : ");
			inputHarga = inputan.nextLine();
			System.out.println();
			harga = Integer.parseInt(inputHarga);
		}

		Pakaian pakai = new Pakaian(ukuran, bahan);
//		System.out.println( pakai.printPakaian() );
		
		Jaket jakets = new Jaket(pakai, warna, merk, madeIn, harga);
		System.out.println( jakets.printJaket() );
		System.out.println(" Range harga " + jakets.cekHarga(harga) );
		System.out.println(" Cocok untuk " + jakets.jenisKel(warna) );
		System.out.println(" Harga Jaket sesuai ukuran " + jakets.cekUkuran(ukuran) );
	}
}