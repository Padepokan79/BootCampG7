/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 1.24 PM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class AlifharBoolean1 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);

		int umur;
		double penampilan, pengalaman, kerja;
		boolean hasil;

		System.out.println ("Saya (Sakti) sedang mencari partner bisnus yang mampu\nbekerja cepat dan rapi");
		System.out.println ("Silahkan jawab pertanyaan di bawah ini!");
		System.out.println ();

		System.out.print ("Umur: ");
		umur = keyboard.nextInt ();

		System.out.print ("berapa lama pengalaman kerja Anda? ");
		pengalaman = keyboard.nextDouble();

		System.out.println ("Bagaimanakah performa kerja Anda? dari 0.0 - 10.0");
		kerja = keyboard.nextDouble();

		System.out.println ("Bagaimanakah penampilan Anda? dari 0.0 - 10.0");
		penampilan = keyboard.nextDouble ();

		hasil = (umur >30 || pengalaman >= 3) && kerja > 8 && penampilan >=9;

		System.out.println ("Apakah Anda layak menjadi partner bisnis saya? " + hasil);

	}
}
