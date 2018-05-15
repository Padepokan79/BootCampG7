/*
	 Program     : Soal 1 - Chaudhry
     Creator     : Khairil
     Created At  : 15 Mei 2018 14:35 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class ChaudhryIfElse1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String inputNama, predikat, keterangan;
		int inputNilaiMath, inputNilaiIndo, inputNilaiInggris, nilaiRata2;
		boolean sangatBaik, baikTuh, cukupTuh, bAja, kurangTuh, std;

		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.print("Nama 			 : ...");
		inputNama = keyboard.next();
		System.out.print("Nilai Math 		 : ...");
		inputNilaiMath = keyboard.nextInt();
		System.out.print("Nilai Indonesia  : ...");
		inputNilaiIndo = keyboard.nextInt();		
		System.out.print("Nilai Inggris 	 : ...");
		inputNilaiInggris = keyboard.nextInt();
		System.out.println();

		nilaiRata2 = (inputNilaiMath + inputNilaiIndo + inputNilaiInggris) / 3;
		sangatBaik = nilaiRata2 > 90;
		baikTuh = nilaiRata2 > 84 && nilaiRata2 <= 90;
		cukupTuh = nilaiRata2 > 75 && nilaiRata2 < 85;
		bAja = nilaiRata2 == 75 || nilaiRata2 < 75;
		std = nilaiRata2 == 75;
		kurangTuh = nilaiRata2 < 75;

		System.out.println("Nama 			 : "+ inputNama);
		System.out.println("Nilai MTK 		 : "+ inputNilaiMath);
		System.out.println("Nilai Indonesia  : "+ inputNilaiIndo);
		System.out.println("Nilai Inggris 	 : "+ inputNilaiInggris);
		System.out.println("Rata-rata nilai  : " + nilaiRata2);
		if( sangatBaik ) {
			predikat = "Sangat Baik";
			keterangan = "";
			System.out.println("Keterangan nilai : " + predikat);
			System.out.println(keterangan);			
		}
		else if( baikTuh ) {
			predikat = "Baik";
			keterangan = "--";
			System.out.println("Keterangan nilai : " + predikat);
			System.out.println(keterangan);			
		}
		else if( cukupTuh ) {
			predikat = "Cukup";
			keterangan = "--";
			System.out.println("Keterangan nilai : " + predikat);
			System.out.println(keterangan);			
		}
		else if( bAja ) {
			if( std ) {
				predikat = "Standard";
				keterangan = "Boleh Mengikuti Ujian Remedial";
				System.out.println("Keterangan nilai : " + predikat);
				System.out.println(keterangan);				
			}
			else if (kurangTuh) {
				predikat = "Kurang";
				keterangan = "Wajib Mengikuti Ujian Remedial";
				System.out.println("Keterangan nilai : " + predikat);
				System.out.println(keterangan);				
			}
		}
		System.out.println("+++++++++++++++++++++++++++++++");								
	}
}