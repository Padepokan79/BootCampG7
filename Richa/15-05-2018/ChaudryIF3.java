/* 
Created by  		: Richa Fitria
Date/hour			: 15 Mei 2018/ 1.16 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;

public class ChaudryIF3 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);

	int jalan, sepeda, motor, mobil, helikopter;
	double jarak;

	jalan = 10;
	sepeda = 35;
	motor = 72;
	mobil = 100;
	helikopter = 150;


	System.out.println ("++++++++++++++++++++++++++++++++++");
	System.out.println ("PERJALANANKU MENUJU TEMPAT KERJA :)");
	System.out.println ("++++++++++++++++++++++++++++++++++");
	System.out.println ();

	System.out.print ("Masukan jarak rumah dengan perusahaan : ");
	jarak = keyboard.nextDouble();

	System.out.println ("Perjalanan yang tersedia untuk anda : ");

	if (jarak >= jalan) {
		System.out.println ("Jalan kaki");
	}

	if (jarak >= sepeda) {
		System.out.println ("Naik Sepeda");
	}
	if (jarak >= motor) {
		System.out.println ("Naik Motor");
	}
	if (jarak >= mobil) {
		System.out.println ("Naik Mobil");
	}
	if (jarak >= helikopter) {
		System.out.println ("Helikopter");
	}

	
}
}

/*3.  Perjalanan Adin menuju tempat kerja
	- Jalan kaki 				10km
	- Naik Sepeda		 		35km
	- Naik Motor		  		72km
	- Naik Mobil			 	100km
	- Naik Helikopter 			150km


	output :

	++++++++++++++++++++++++++++++++++++
	PERJALANANKU MENUJU TEMPAT KERJA :)
	++++++++++++++++++++++++++++++++++++

	// (Exp)
	Masukan jarak rumah dengan perusahaan : 42

	Perjalanan yang tersedia untuk anda : 
	- jalan kaki
	- Naik Sepeda */






