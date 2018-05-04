/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 1.24 PM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class AlifharBoolean3 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);

		int benar, salah, kosong, rapi, total;
		boolean disiplin, lulus, pensil1, rambut1;
		String pensil, rambut;

		System.out.println ("+----------------------------------------------+");
		System.out.print ("Jawaban benar: ");
		benar = keyboard.nextInt ();

		System.out.print ("Jawaban salah: ");
		salah = keyboard.nextInt ();

		System.out.print ("Jawaban kosong: ");
		kosong = keyboard.nextInt ();

		System.out.print ("Pensil yang digunakan (HB/2B/3B/4B/5B/6B): ");
		pensil = keyboard.next ();

		System.out.print ("Skala kerapian (0 sampai 10): ");
		rapi = keyboard.nextInt ();

		System.out.print ("Rambut (pendek/panjang): ");
		rambut = keyboard.next ();

		System.out.println ("+----------------------------------------------+");

		total = (benar*4) + (salah*-1) + (kosong*0);

		pensil1 = pensil.equals("2B");
		rambut1 = rambut.equals ("pendek");

		disiplin = pensil1 && (rapi >= 8 || rambut1);
		lulus = total > 130;

		System.out.println ("|Total nilai: " + total +                    " |");
		System.out.println ("|Kedisplinan: " + disiplin +               " |");
		System.out.println ("|Anda lulus: " + lulus +                   " |");  
		System.out.println ("+----------------------------------------------+");


	}
}