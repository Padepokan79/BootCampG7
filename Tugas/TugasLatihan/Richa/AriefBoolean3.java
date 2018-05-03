/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 3.38 PM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class AriefBoolean3 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);

		int ram, hdd;
		double kec;
		boolean hasil;

		System.out.println ("Jumlah RAM (dalam GB): ");
		ram = keyboard.nextInt ();

		System.out.println ("Kapasitas HDD (dalam TB): ");
		hdd = keyboard.nextInt ();	

		System.out.println ("Kecepatan processor (dalam Ghz): ");
		kec = keyboard.nextDouble ();		

		hasil = (ram >= 8 && hdd >= 1 && (kec> 3.0 && kec< 4.5));

		System.out.println ("Spesifikasi sesuai? " + hasil );

	}
}