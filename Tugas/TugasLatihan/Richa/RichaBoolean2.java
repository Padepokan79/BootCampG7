/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 1.00 PM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class RichaBoolean2 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);
		String name, senyum;
		boolean yep, hasil, hasil2;
		int teman,kriminal;

  		System.out.println ();
		System.out.println ("Hai kamu ingin tahu kan bagaimana orang menilaimu?");
		System.out.println ("Isi penilaian di bawah ini ya :)");
		System.out.println ();
		System.out.println ("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println ();

		System.out.print ("Nama: ");
		name = keyboard.next ();

		System.out.print ("Berapa teman baik yang kamu punya, Richa? ");
		teman = keyboard.nextInt ();

		System.out.print ("Apakah kamu pernah melakukan pelanggaran kriminal sebelumnya? kalo iya, berapa kali? ");
		kriminal = keyboard.nextInt ();

		System.out.println ("Menurutmu kamu murah senyum atau tidak? (Ya/Tidak)");
		senyum = keyboard.next ();
		System.out.println ();

		yep = senyum.equals("Ya");
		hasil = (teman>13 || kriminal<7);
		hasil2 = (hasil && yep);

		System.out.println ();
		System.out.println ("Baiklah, ");
		System.out.println ("Apakah " + name + " adalah orang yang baik? " + hasil2);
		System.out.println ("Terimakasih! teruslah menjadi orang yang baik yaa");
	}
}
