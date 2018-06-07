// Created By Vikri
// 12/05/2018
// 11:08 

import java.util.Scanner;

public class SoalAlifhar2{
	public static void main(String[] args) {
		boolean mobilBaru, biru;
		String namaMobil, warna;
		int kecepatan, tahunKeluaran;

		Scanner input = new Scanner(System.in);
		Scanner string = new Scanner(System.in);

		System.out.print("\nNama Mobil : ");
		namaMobil = string.nextLine();

		System.out.print("Warna : ");
		warna = string.next();

		System.out.print("kecepatan km/jam : ");
		kecepatan = input.nextInt();

		System.out.print("Tahun Keluaran : ");
		tahunKeluaran = input.nextInt();

		biru = warna.equals("biru");

		mobilBaru = biru && kecepatan >= 70 && tahunKeluaran == 2016 || tahunKeluaran == 2017;
		System.out.println("\n+--------------------------------"+
						  "\nNama : "+namaMobil+
						  "\nMobil yang diinginkan : " + mobilBaru +
						  "\n+--------------------------------");
	}
}