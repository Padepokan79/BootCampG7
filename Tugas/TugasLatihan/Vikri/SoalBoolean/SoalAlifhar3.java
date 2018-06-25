// Created By Vikri
// 12/05/2018
// 11:08 

import java.util.Scanner;

public class SoalAlifhar3{
	public static void main(String[] args) {
		boolean kedisiplinan, lulus, pensil, Rambut;
		String pencil, rambut;
		int nilai, kerapian, jBenar, jSalah, jKosong, soal;

		Scanner input = new Scanner(System.in);
		Scanner string = new Scanner(System.in);

		System.out.print("\nJawaban Benar : ");
		jBenar = input.nextInt();

		System.out.print("Jawaban Salah : ");
		jSalah = input.nextInt();

		System.out.print("Jawaban Kosong : ");
		jKosong = input.nextInt();

		System.out.print("Pensil yang digunakan (HB/2B/3B/4B/5B/6B) : ");
		pencil = string.next();

		System.out.print("Kerapihan : ");
		kerapian = string.nextInt();

		System.out.print("Rambut (pendek/panjang): ");
		rambut = string.next();

		soal = 60*4;
		nilai = (jBenar*4)-(jSalah);

		pensil = pencil.equals("2B");
		Rambut = rambut.equals("pendek");

		kedisiplinan = pensil && Rambut && kerapian >= 8 && kerapian <= 10;
		lulus = nilai >= 130 && nilai <= 240 && kedisiplinan;
		System.out.println("\n+--------------------------------"+
						  "\nTotal Nilai : "+nilai+
						  "\nKedisiplinan : " + kedisiplinan +
						  "\nAnda Lulus : " + lulus +
						  "\n+--------------------------------");
	}
}