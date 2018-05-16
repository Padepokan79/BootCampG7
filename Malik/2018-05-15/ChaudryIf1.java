/*
created by 	: Malik Chaudhary
time 		: 15-05-2018 12:55AM

Soal :

Menentukan nilai Adi 
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

import java.util.Scanner;
public class ChaudryIf1{
	public static void main(String[] args){
		Scanner nilai = new Scanner(System.in);

		int mapel=3;
		String nama;
		double nilaiIndo, nilaiMath, nilaiIggrs, rata, minNilai, midNilai, maxNilai;

		System.out.println("+++++++++++++++++++++++++");
		System.out.print("Nama : ");
		nama = nilai.next();
		System.out.print("Nilai Math : ");
		nilaiMath = nilai.nextInt();
		System.out.print("Nilai Indonesia : ");
		nilaiIndo = nilai.nextInt();
		System.out.print("Nilai Inggris : ");
		nilaiIggrs = nilai.nextInt();

		minNilai = 75;
		midNilai = 85;
		maxNilai = 90;

		rata = ( nilaiIggrs+nilaiIndo+nilaiMath )/mapel;

		System.out.println("Rata-rata nilai : "+rata);

		if ( rata > maxNilai ) {
			System.out.print("Keterangan nilai : NILAI SANGAT BAIK");
		}else if ( rata >= midNilai && rata <= maxNilai ) {
		 	System.out.print("Keterangan nilai : NILAI BAIK");
		}else if ( rata > minNilai && rata < midNilai ) {
		 	System.out.print("Keterangan nilai : NILAI CUKUP");
		}else if ( rata == minNilai ) {
		 	System.out.print("Keterangan nilai : Apakah ingin Mengikuti Remedial?");
		}else{
		 	System.out.print("Keterangan nilai : Nilai kurang harus remedial");
		}
	}
}