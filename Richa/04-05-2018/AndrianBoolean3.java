/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 2.55 PM
Updated by			: Richa Fitria
Updated Date/hour	: 4 Mei 2018/ 2.41 PM

*/


import java.util.Scanner;

public class AndrianBoolean3 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);

		double luas;
		int lantai, garasi, kolam, flora;
		boolean beli, heidelberg;
		String kota;

		System.out.println ("            Kriteria rumah Anto         ");
		System.out.println ("++++++++++++++++++++++++++++++++++++++++");


		System.out.print ("Kota: ");
		kota = keyboard.next ();

		heidelberg = kota.equals ("heidelberg");

		System.out.print ("Luas rumah (hektare): ");
		luas = keyboard.nextDouble ();

		System.out.print ("Lantai rumah: ");
		lantai = keyboard.nextInt ();

		System.out.print ("Mobil yang dapat ditampung: ");
		garasi = keyboard.nextInt();

		System.out.print ("Jumlah kolam renang: ");
		kolam = keyboard.nextInt ();

		System.out.print ("Jenis flora yang ditampung: ");
		flora = keyboard.nextInt ();

		beli = heidelberg && (luas > 0.3 && lantai > 3 && garasi > 3 && kolam >= 2 && flora > 5) || (kolam < 2 && flora > 8) || (lantai <= 3 && luas > 0.7);

		System.out.println ("++++++++++++++++++++++++++++++++++++++++");
		System.out.print ("Rumah sesuai kriteria? " + beli);
	}
}
