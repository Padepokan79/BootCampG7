/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 10.03 PM
Updated by			: Richa Fitria
Updated Date/hour	: 4 Mei 2018/ 2.50 PM

*/


import java.util.Scanner;

public class YanaBoolean1 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);

		int umur, java, php, angular;
		String gender, pendidikan, pengalaman;
		boolean laki, perempuan, kerja, ya, s1, s2, s3;

		System.out.println ("Lowongan pekerjaan");

		System.out.print ("Jenis Kelamin (L/P): ");
		gender= keyboard.next ();

		laki = gender.equals ("L");
		perempuan = gender.equals ("P");

		System.out.print ("Umur: ");
		umur= keyboard.nextInt ();

		System.out.print ("Pendidikan: ");
		pendidikan = keyboard.next ();

		s1 = pendidikan.equals ("S1");
		s2 = pendidikan.equals ("S2");
		s3 = pendidikan.equals ("S3");

		System.out.print ("Menguasai java? (0 = tidak, 1 = iya) ");
		java = keyboard.nextInt ();

		System.out.print ("Menguasai ANgularJs? (0 = tidak, 1 = iya) ");
		angular = keyboard.nextInt ();

		System.out.print ("Menguasai PHP? (0 = tidak, 1 = iya) ");
		php = keyboard.nextInt ();

		System.out.print ("Pengalaman (Ya/Tidak): ");
		pengalaman = keyboard.next ();

		ya = pengalaman.equals ("Ya");

		
		kerja = laki && umur >= 23 && java ==1  && (php==1 || angular==1) && ya && (s1  || s2 || s3);

		System.out.println ("Saya akan diterima kerja? " + kerja);

	}
}
