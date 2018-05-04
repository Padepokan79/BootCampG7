/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 10.13 PM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class YanaBoolean2 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);

		String akreditasi;
		double s1, s2, rataan;
		boolean a, b, beasiswa;

		System.out.println ("Beasiswa bidikmisi S3");

		System.out.print ("IPK S1: ");
		s1= keyboard.nextDouble ();

		System.out.print ("IPK S2: ");
		s2= keyboard.nextDouble ();

		rataan = (s1 + s2)/2;

		System.out.print ("Akreditasi: ");
		akreditasi = keyboard.next ();

		a = akreditasi.equals ("A");
		b = akreditasi.equals ("B");

		beasiswa = (rataan >= 3.25 && (a || b) );

		System.out.println ("Saya akan diterima beasiswa? " + beasiswa);

	}
}