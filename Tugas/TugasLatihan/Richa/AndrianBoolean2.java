/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 2.38 PM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class AndrianBoolean2 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);

		String gender, ktp;
		int umur;
		double penghasilan, tinggi;
		boolean ktpbool, laki, perempuan, masuk, batastinggi;

		System.out.println ("    Permission untuk join ke triangle   ");
		System.out.println ("++++++++++++++++++++++++++++++++++++++++");

		System.out.print ("Gender kamu (L/P): ");
		gender = keyboard.next ();

		System.out.print ("Umur kamu: ");
		umur = keyboard.nextInt ();

		System.out.print ("Memiliki KTP? (Ya/Tidak) ");
		ktp = keyboard.next();

		System.out.print ("Penghasilan kamu: ");
		penghasilan = keyboard.nextDouble ();

		System.out.print ("Tinggi badan kamu (dalam cm): ");
		tinggi = keyboard.nextDouble ();

		ktpbool = ktp.equals ("Ya");

		laki = gender.equals ("L");
		perempuan = gender.equals ("P");

		batastinggi = (laki && tinggi > 160) || (perempuan && tinggi > 153);

		masuk = (umur >= 25 && ktpbool && penghasilan > 3000000 && batastinggi);

		System.out.print ("Kamu sesuai kriteria? " + masuk);
	}
}