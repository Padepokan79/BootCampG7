package rrv;

import java.util.Scanner;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		Random rand = new Random();
		
		String ukuran, jenisBahan, warna, merek, madeIn;
		double harga;

		System.out.println("Masukan Ukuran Jaket: ");
		ukuran = inputKey.nextLine();

		System.out.println("Masukan Bahan yang diinginkan: ");
		jenisBahan = inputKey.nextLine();

		System.out.println("Masukan Warna: ");
		warna = inputKey.nextLine();

		System.out.println("Masukan Merek: ");
		merek = inputKey.nextLine();
		
		if (merek.equals("nike") || merek.equals("adidas")) {
			harga = rand.nextInt(1000)+250000;
			System.out.println("Harganya : " + harga);
		} else {
			System.out.println("Masukan Harga: ");
			harga = inputKey.nextDouble();
		}
		System.out.println("Masukan Tempat Produksi: ");
		madeIn = inputKey.next();
		
		Pakaian pake = new Pakaian(ukuran, jenisBahan);
		Jaket jkt = new Jaket(pake, warna, merek, madeIn, harga);
		
		jkt.diskon(pake.getUkuran());
		
//		System.out.println(pake.printPakaian());
		System.out.println(jkt.printPakaian());
		jkt.gen();
		jkt.range();

	}

}
