/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 3.14 PM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class AriefBoolean2 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);

		String hari;
		boolean senin, selasa, rabu, kamis, jumat, sabtu, minggu, buka;

		System.out.println ("Sekarang hari apa? ");
		hari = keyboard.next ();

		senin = hari.equals ("senin");
		selasa = hari.equals ("selasa");
		rabu = hari.equals ("rabu");
		kamis = hari.equals ("kamis");
		jumat = hari.equals ("jumat");
		sabtu = hari.equals ("sabtu");
		minggu = hari.equals ("minggu");

		buka = (senin || selasa || rabu || kamis || sabtu) || (jumat && minggu);

		System.out.println ("Toko elektronik buka? " + buka );

	}
}
