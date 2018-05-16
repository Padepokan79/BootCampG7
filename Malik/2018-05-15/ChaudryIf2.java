/*
created by : Malik Chaudhary
time : 15-05-2018 1:19PM
Soal :

Perjalanan Adin menuju tempat kerja
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

import java.util.Scanner;
public class ChaudryIf2{
	public static void main(String[] args){
		Scanner jarak = new Scanner(System.in);	

		double km;
		int satu, dua, tiga, empat, lima;

		satu = 10; dua = 35; tiga = 72; empat = 100; lima = 150;

		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println("PERJALANKU MENUJU TEMPA KERJA");
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println("");
		System.out.print("Masukan jarak rumah dengan perusahaan : ");
		km = jarak.nextInt();
		System.out.println("");
		System.out.println("Perjalanan yang tersedia untuk anda : ");

		if ( km >= lima ) {
			System.out.println("- jalan kaki");
			System.out.println("- Naik Sepeda");
			System.out.println("- Naik Motor");
			System.out.println("- Naik Mobil");
			System.out.println("- Naik Helikopter");
		}else if ( km >= empat ) {
			System.out.println("- jalan kaki");
			System.out.println("- Naik Sepeda");
			System.out.println("- Naik Motor");
			System.out.println("- Naik Mobil");
		}else if ( km >= tiga ) {
			System.out.println("- jalan kaki");
			System.out.println("- Naik Sepeda");
			System.out.println("- Naik Motor");
		}else if ( km >= dua ) {
			System.out.println("- jalan kaki");
			System.out.println("- Naik Sepeda");
		}else if ( km >= satu || km < satu) {
			System.out.println("- jalan kaki");
		}
	}
}