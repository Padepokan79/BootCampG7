/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 3.14 PM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class AriefBoolean1 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);

		int tanggal;
		String plat;
		boolean masuk,genap;

		System.out.println ("Sekarang tanggal: ");
		tanggal = keyboard.nextInt ();

		System.out.println ("Nomor plat kamu? (genap/ganjil): ");
		plat = keyboard.next ();

		genap = plat.equals ("genap");

		masuk = ((tanggal%2) == 0 && genap) || ((tanggal%2) != 0 && ! genap);

		System.out.println ("Kamu bisa memasukkan kendaraanmu? " + masuk );

	}
}
