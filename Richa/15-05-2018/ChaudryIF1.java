/* 
Created by  		: Richa Fitria
Date/hour			: 15 Mei 2018/ 12.57 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;

public class ChaudryIF1 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);

	String nama, ket = "y";
	double math, indonesia, inggris, rata;
 
	System.out.println ("++++++++++++++++++++++++++++++++++++");
	System.out.print ("Nama: ");
	nama = keyboard.next();

	System.out.print ("Nilai Math: ");
	math = keyboard.nextDouble();

	System.out.print ("Nilai Indonesia: ");
	indonesia = keyboard.nextDouble();

	System.out.print ("Nilai Inggris: ");
	inggris = keyboard.nextDouble();

	rata = (math + indonesia + inggris)/3;

	System.out.println ();
	System.out.println ("Rata-rata nilai: " + rata);

	if (rata < 75) {
		ket = "Remedial";
	}
	else if (rata == 75) {
		ket = "Direkomendasikan mengikuti remedial";
	}
	else if (rata > 75 && rata < 84) {
		ket = "Cukup";
	}
	else if (rata >= 85 && rata <= 90) {
		ket = "baik";
	} 
	else if (rata>90) {
		ket = "sangat baik";
	}

	System.out.print ("Keterangan nilai: " + ket);

}
}
/*1. 	Menentukan nilai Adi 
	Di kelas 12 akhir semester ini, dibagikan nilai hasil ujian Try Out ke 3.
	Dengan :
		- nilai Standart 75
		- Nilai pas Standart namun masih dibawah 85, maka keterangan nilai cukup
		- Nilai diatas 84 sampai 90, keterangan nilai baik
		- selebihnya sangat baik
		- Nilai yang selaras dengan Standart akan diberi tawaran untuk mengikuti Ujian Remedial
		- selain keterangan diatas maka nilai dinyatakan kurang dan harus mengikuti Ujian Remedial

	*Note: satuan nilai dalam puluhan (Exp: 82)
	
	output :

	+++++++++++++++++++++++++++++++
	Nama 			 : ...
	Nilai Math 		 : ...
	Nilai Indonesia  : ...
	Nilai Inggris 	 : ...

	Rata-rata nilai  : ...
	Keterangan nilai : ...
	// code yang diperlukan
	+++++++++++++++++++++++++++++++ */
