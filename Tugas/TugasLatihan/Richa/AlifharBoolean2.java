/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 1.24 PM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class AlifharBoolean2 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);

		int tahun;
		String warna;
		double kecepatan;
		boolean hasil, biru;

		System.out.println ("Saya (Sakti) sedang mencari partner bisnus yang mampu\nbekerja cepat dan rapi");
		System.out.println ("Silahkan jawab pertanyaan di bawah ini!");
		System.out.println ();

		System.out.print ("Warna: ");
		warna = keyboard.next ();

		System.out.print ("Kecepatan dalam km/jam: ");
		kecepatan = keyboard.nextDouble();

		System.out.println ("Tahun keluaran: ");
		tahun = keyboard.nextInt();

		biru = warna.equals ("biru");

		hasil = biru && kecepatan > 70 && (tahun == 2016 || tahun ==2017);

		System.out.println ("Sesuai dengan kriteria mobil baru Deo? " + hasil);

	}
}