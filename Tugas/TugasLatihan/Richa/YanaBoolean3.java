/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 10.36 PM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class YanaBoolean3 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);

		String beasiswa;
		double ipk;
		int semester, algoritma, database, pemrograman;
		boolean ppa, ppb, diterima;

		System.out.println ("Beasiswa Informatika");

		System.out.print ("Semester: ");
		semester= keyboard.nextInt ();

		System.out.print ("Nilai matkul algoritma (0-10): ");
		algoritma= keyboard.nextInt ();

		System.out.print ("Nilai matkul database (0-10): ");
		database= keyboard.nextInt ();

		System.out.print ("Nilai matkul pemrograman (0-10): ");
		pemrograman= keyboard.nextInt ();

		System.out.print ("IPK: ");
		ipk= keyboard.nextDouble ();

		System.out.print ("Beasiswa: ");
		beasiswa= keyboard.next ();

		ppa = beasiswa.equals ("ppa");
		ppb = beasiswa.equals ("ppb");

		diterima = (semester >= 3 && semester <=5) && ((ppa && ipk >+ 2.75) || (ppb && ipk >= 3.00 && algoritma >= 8 && database >=8 && pemrograman >= 8));

		System.out.println ("Saya akan diterima beasiswa? " + diterima);

	}
}