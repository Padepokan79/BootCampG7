/*
Created by	: Yana
Time		: 15 Mei 2018 15.07
*/

import java.util.Scanner;

public class ChaudryIf3{
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		int jarakPerjalanan, jalanKaki, naikSepeda, naikMotor, naikMobil, naikHelikopter;

		jalanKaki 	= 10;
		naikSepeda 	= 35;
		naikMotor 	= 72;
		naikMobil 	= 100;
		naikHelikopter = 150;

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");	
		System.out.println("      PERJALANAN MENUJU TEMPAT KERJA ");	
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");	
		System.out.print("Masukkan jarak perjalanan  : ");
		jarakPerjalanan = keyboard.nextInt();

		if ( jarakPerjalanan >= naikHelikopter) {
			System.out.println("- Naik Helikopter");
		}
		if ( jarakPerjalanan <= naikMobil) {
			System.out.println("- Naik Mobil");	
		}
		if ( jarakPerjalanan >= naikMotor) {
			System.out.println("- Naik Motor");			
		}
		if ( jarakPerjalanan >= naikSepeda ) {
			System.out.println("- Naik Sepeda");			
		}
		if ( jarakPerjalanan >= jalanKaki ) {
			System.out.println("- Jalan Kaki");			
		}
		if ( jarakPerjalanan < jalanKaki) {
			System.out.println("- Jalan Kaki");			
		}

	}
}

/*
3.  Perjalanan Adin menuju tempat kerja
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
	- Naik Sepeda
*/