/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 3.49 PM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class KhairilBoolean2 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);

		int mentega, roti, selai, kismis, totalItem, totalHarga;
		boolean belanja;

		System.out.println ("Daftar belanja!");
		System.out.print ("Jumlah mentega: ");
		mentega= keyboard.nextInt ();

		System.out.print ("Jumlah roti: ");
		roti = keyboard.nextInt ();

		System.out.print ("Jumlah selai: ");
		selai = keyboard.nextInt ();

		System.out.print ("Jumlah kismis: ");
		kismis = keyboard.nextInt ();

		totalItem = roti + kismis + selai + mentega;
		totalHarga = (roti*15000) + (kismis*7500) + (selai*8500) + (mentega*3500);

		System.out.println ("Total item: " + totalItem);
		System.out.println ("Total harga: " + totalHarga);

		belanja = totalItem >= 4 && totalHarga <= 100000;

		System.out.println ("Bisakah saya belanja? " + belanja);

	}
}