/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 10.13 PM
Updated by			: Richa Fitria
Updated Date/hour	: 4 Mei 2018/ 2.59 PM

*/


import java.util.Scanner;

public class YanaBoolean2 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);

		String akreditasi, gender, pendidikan;
		double s1, s2, rataan;
		boolean a, b, beasiswa, laki, perempuan;

		System.out.println ("Beasiswa bidikmisi S3");

		System.out.print ("Jenis kelamin (L/P): ");
		gender= keyboard.next ();

		laki = gender.equals ("L");
		perempuan = gender.equals ("P");

		System.out.print ("Pendidikan terakhir: ");
		pendidikan= keyboard.next ();

		System.out.print ("IPK S1: ");
		s1= keyboard.nextDouble ();

		System.out.print ("IPK S2: ");
		s2= keyboard.nextDouble ();

		rataan = (s1 + s2)/2;

		System.out.print ("Akreditasi: ");
		akreditasi = keyboard.next ();

		a = akreditasi.equals ("A");
		b = akreditasi.equals ("B");

		beasiswa = pendidikan.equals ("S2") && (rataan >= 3.25 && (a || b)) && (laki || perempuan);

		System.out.println ("Saya akan diterima beasiswa? " + beasiswa);

	}
}
