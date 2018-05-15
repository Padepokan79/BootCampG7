/*
Created by	: Yana
Time		: 15 Mei 2018 14.35
*/

import java.util.Scanner;

public class ChaudryIf1{
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);

		String 	nama, keterangan;
		int 	nilaiMath, nilaiIndonesia, nilaiInggris, rataanNilai;

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");	
		System.out.print("Nama               : ");
		nama = keyboard.next();
		System.out.print("Nilai Math         : ");
		nilaiMath = keyboard.nextInt();
		System.out.print("Nilai Indonesia    : ");
		nilaiIndonesia = keyboard.nextInt();
		System.out.print("Nilai Inggris      : ");
		nilaiInggris = keyboard.nextInt();

		rataanNilai	= (nilaiMath + nilaiIndonesia + nilaiInggris) / 3;


		System.out.println("\n\nOUTPUT :");
		System.out.println("Nama               : " + nama);
		System.out.println("Nilai Math         : " + nilaiMath);
		System.out.println("Nilai Indonesia    : " + nilaiIndonesia);
		System.out.println("Nilai Inggris      : " + nilaiInggris);
		System.out.println("Nilai Rata-rata    : " +rataanNilai);


		if ( rataanNilai > 90) {
			keterangan = "Sangat Baik";
			System.out.println("keterangan         : " +keterangan);
		}
		else if ( rataanNilai > 84 && rataanNilai <= 90) {
			keterangan = "Baik";
			System.out.println("keterangan         : " +keterangan);
		}
		else if ( rataanNilai > 75 && rataanNilai < 85) {
			keterangan = "Cukup";
			System.out.println("keterangan         : " +keterangan);
		}
		else if ( rataanNilai == 75 ) {
			keterangan = "Standar";
			System.out.println("keterangan         : " +keterangan);
			System.out.println("                     Boleh mengikuti ujian remedial");
		}
		else if ( rataanNilai < 75 ) {
			keterangan = "Kurang";
			System.out.println("keterangan         : " +keterangan);
			System.out.println("                     Harus mengikuti ujian remedial");
		}


		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");	
	}
}

/*
1. 	Menentukan nilai Adi 
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
	+++++++++++++++++++++++++++++++
*/