/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 1.02 PM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class RichaBoolean3 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);
		boolean hasil, hasil2;
		double gaji,suami, istri,tengkar, selisih;

  		System.out.println ();
		System.out.println ("Selamat datang, ketahuilah kecocokan kalian sebagai suami istri!");
		System.out.println ();

		System.out.print ("Umur suami: ");
		suami = keyboard.nextDouble ();

		System.out.print ("Umur istri: ");
		istri = keyboard.nextDouble ();

		System.out.print ("Dalam sebulan berapa kali frekuensi kalian bertengkar? ");
		tengkar = keyboard.nextDouble ();

		System.out.print ("Berapa gaji suami dalam sebulan? ");
		gaji = keyboard.nextDouble ();
		System.out.println ();


		selisih = suami -istri;

		hasil = (suami > istri) && (selisih <= 9);
		hasil2 = (hasil && tengkar <= 5 && gaji > 5000000); 

		System.out.println ("Ini hasilnya....");
		System.out.println ("Apakah kalian cocok menjadi suami istri? " + hasil2);
	}
}
