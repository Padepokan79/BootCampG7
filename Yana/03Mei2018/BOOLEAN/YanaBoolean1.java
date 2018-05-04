/*
Create by	: Yana
Time 		: 3 Mei 2018 09.23
Update by	:
*/

import java.util.Scanner;

public class SoalBooleanYana1{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		int		umur;
		String	jenisKelamin, pendidikan, pengalaman, keahlianJava, keahlianAngular, keahlianPHP;
		boolean hasil;

		System.out.print("Jenis Kelamin \"L\" atau \"P\": ");
		jenisKelamin = keyboard.next();

		System.out.print("Umur: ");
		umur = keyboard.nextInt();

		System.out.print("Pendidikan Terakhir \"S1\"/\"S2\"/\"S3\": ");
		pendidikan = keyboard.next();

		System.out.print("Menguasai Java (\"Y\"/\"T\"): ");
		keahlianJava = keyboard.next();

		System.out.print("Menguasai AngularJS (\"Y\"/\"T\"): ");
		keahlianAngular = keyboard.next();

		System.out.print("Menguasai PHP (\"Y\"/\"T\"): ");
		keahlianPHP = keyboard.next();

		System.out.print("Memiliki Pengalaman Kerja (\"Y\"/\"T\"): ");
		pengalaman = keyboard.next();


		hasil	= ( jenisKelamin.equals("L") && umur >= 23 && ( pendidikan.equals("S1") || pendidikan.equals("S2") || 
				  pendidikan.equals("S3") ) && ( ( keahlianJava.equals("Y") && keahlianAngular.equals("Y") ) || 
				  ( keahlianJava.equals("Y") && keahlianPHP.equals("Y") ) ) && pengalaman.equals("Y") );


		System.out.println();
		System.out.println("Anda memenuhi syarat untuk melamar keja: " +hasil);
	}
}