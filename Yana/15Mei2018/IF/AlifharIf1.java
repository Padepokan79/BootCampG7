/*
Created by	: Yana
Time		: 15 Mei 2018 08.38
*/

import java.util.Scanner;

public class AlifharIf1{
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		double 	bilangan;
		String	jenisBilanganPN, jenisBilanganRB, jenisBilanganGG;

		System.out.println("===========================");
		System.out.print("Masukkan bilangan: ");
		bilangan = keyboard.nextDouble(); 
		System.out.println("===========================");
		System.out.println("Bilangan tersebut adalah: ");

		if ( bilangan < 0) {
			jenisBilanganPN = "Negatif";
		}else if ( bilangan > 0) {
			jenisBilanganPN = "Positif";
		}else{
			jenisBilanganPN = "";
		}		

		if ( bilangan % 2 == 0 && bilangan % 1 == 0) {
			jenisBilanganRB = "Bulat";
			if ( bilangan % 2 == 0) {
				jenisBilanganGG = "Genap";
			}else{
				jenisBilanganGG = "Ganjil";
			}
			System.out.println("Bilangan " +jenisBilanganPN+ " "  +jenisBilanganRB+ " " +jenisBilanganGG );
		}else{
			jenisBilanganRB = "Riil";
			System.out.println("Bilangan " +jenisBilanganPN+ " "  +jenisBilanganRB );
		}

		System.out.println("===========================");
		System.out.println();
	}
}

/*
1. Buatlah program untuk mencari jenis sebuah bilangan
Jenis bilangan
Positif, negatif --> riil
		 --> bulat --> genap
			   --> ganjil
=====================================
Masukkan bilangan: 39
=====================================
Bilangan tersebut adalah
Bilangan bulat ganjil positif
=====================================
contoh lain: -32.3 --> bilangan riil negatif
	     12.00 --> bilangan bulat genap positif
*/