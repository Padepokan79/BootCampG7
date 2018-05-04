/*
Create by	: Yana
Time 		: 3 Mei 2018 14.10
Update by	:
*/

import java.util.Scanner;

public class RichaBoolean3{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		int		umurSuami, umurIstri, selisihUmur, jumlahBertengkar;
		double	gajiBulanan;
		boolean hasil;


		System.out.println("Selamat datang, ketahuilah kecocokan kalian sebagai suami istri!");
		System.out.println("Umur Suami: ");
		umurSuami	= keyboard.nextInt();
		System.out.println("Umur Istri: ");
		umurIstri	= keyboard.nextInt();
		System.out.println("Dalam sebulan berapa kali frekuensi kalian bertengkar? ");
		jumlahBertengkar = keyboard.nextInt();
		System.out.println("Berapa gaji suami dalam sebulan? ");
		gajiBulanan	= keyboard.nextDouble();

		selisihUmur	= umurSuami - umurIstri;
		hasil 		= ( selisihUmur <= 9 && jumlahBertengkar <= 5 && gajiBulanan > 5000000 );

		System.out.println();
		System.out.println("Ini hasilnya...");
		System.out.println("Apakah kalian cocok menjadi suami istri? " +hasil);

	}
}