/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 3.49 PM
Updated by			: Richa Fitria
Updated Date/hour	: 4 Mei 2018/ 2.16
*/


import java.util.Scanner;

public class KhairilBoolean1 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);

		String domisili, pengalaman;
		double math1, math2;
		boolean seleksi, bandung, pernah;

		System.out.print ("Sudah pernah mengikuti seleksi sebelumnya? (Y/T) ");
		pengalaman = keyboard.nextLine ();

		pernah = pengalaman.equals ("Y");

		System.out.print ("Domisili: ");
		domisili= keyboard.nextLine ();

		System.out.print ("Nilai matematika (semester 1): ");
		math1= keyboard.nextDouble ();

		System.out.print ("Nilai matematika (semester 2): ");
		math2= keyboard.nextDouble ();	

		bandung = domisili.equals ("bandung");

		seleksi = !pernah && (math1 >= 8 && math2 >= 8 && bandung);

		System.out.println ("Lolos seleksi? " + seleksi);

	}
}
