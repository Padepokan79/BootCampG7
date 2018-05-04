/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 3.49 PM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class KhairilBoolean1 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);

		String domisili;
		double math1, math2;
		boolean seleksi, bandung;

		System.out.println ("Domisili: ");
		domisili= keyboard.nextLine ();

		System.out.println ("Nilai matematika (semester 1): ");
		math1= keyboard.nextDouble ();

		System.out.println ("Nilai matematika (semester 2): ");
		math2= keyboard.nextDouble ();	

		bandung = domisili.equals ("bandung");

		seleksi = (math1 >= 8 && math2 >= 8 && bandung);

		System.out.println ("Lolos seleksi? " + seleksi);

	}
}
