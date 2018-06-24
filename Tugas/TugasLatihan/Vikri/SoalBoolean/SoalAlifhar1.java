// Created By Vikri
// 12/05/2018
// 10:32

import java.util.Scanner;

public class SoalAlifhar1{
	public static void main(String[] args) {
		boolean partnerBisnis;
		String nama;
		int umur, tahunPengalaman;
		double kecepatanBekerja, penampilan;

		Scanner input = new Scanner(System.in);
		Scanner string = new Scanner(System.in);

		System.out.print("\nNama Anda: ");
		nama = string.nextLine();

		System.out.print("Umur: ");
		umur = input.nextInt();

		System.out.print("Pengalaman Kerja : ");
		tahunPengalaman = input.nextInt();

		System.out.print("Kecepatan Bekerja : ");
		kecepatanBekerja = input.nextDouble();

		System.out.print("Penampilan : ");
		penampilan = input.nextDouble();

		partnerBisnis = umur >= 30 && tahunPengalaman >= 3 && kecepatanBekerja >= 8 && kecepatanBekerja <= 10 && penampilan <=10 && penampilan >=9 ;
		System.out.println("\n+--------------------------------"+
						  "\nNama : "+nama+
						  "\nDinyatakan menjadi partner bisnis : " + partnerBisnis +
						  "\n+--------------------------------");
	}
}