/*
Create by	: Yana
Time 		: 3 Mei 2018 11.27
Update by	:
*/

import java.util.Scanner;

public class SoalBooleanYana2{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		String	jenisKelamin, pendidikan, akreditasiKampus;
		double  ipkS1, ipkS2, rataanIPK;
		boolean hasil;

		System.out.print("Jenis Kelamin \"L\" atau \"P\": ");
		jenisKelamin = keyboard.next();

		System.out.print("Pendidikan Terakhir \"S1\"/\"S2\": ");
		pendidikan = keyboard.next();

		System.out.print("IPK S1: ");
		ipkS1 = keyboard.nextDouble();

		System.out.print("IPK S2: ");
		ipkS2 = keyboard.nextDouble();

		System.out.print("Akreditasi Kampus (\"A\"/\"B\"/\"C\"): ");
		akreditasiKampus = keyboard.next();


		rataanIPK	= ( ipkS1 + ipkS2 ) / 2;
		hasil		= ( ( jenisKelamin.equals("L") || jenisKelamin.equals("P") ) && pendidikan.equals("S2") && rataanIPK >= 3.25 && 
					  rataanIPK <= 4.00 && ( akreditasiKampus.equals("B") || akreditasiKampus.equals("A") ) );


		System.out.println();
		System.out.println("Anda memenuhi syarat untuk mendaftar beasiswa bidikmisi S3: " +hasil);
	}
}