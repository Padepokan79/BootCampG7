/*
created by 	: Malik Chaudhary
time 		: 16-05-2018 7:19PM

soal :

Buatlah program untuk menampilkan kalimat dalam bentuk segitiga hingga batas segitiga yg ditentukan. Contoh :
	Batas segitiga : 10
	Kalimat : Komandan Bersatu

	         K
	        o m
	       a n d
	      a n   B
       	 e r s a t
        u
*/

import java.util.Scanner;
public class TugasForRumah2{
	public static void main(String[] args){
		Scanner segitiga = new Scanner(System.in);
		Scanner segitiga2 = new Scanner(System.in);

		int maxBatas, batas, nol = 0, lengthKalimat = 0;
		String kalimat;

		System.out.print("Masukan batas segitiga : ");
		maxBatas = segitiga.nextInt();
		System.out.print("Masukan kalimat : ");
		kalimat = segitiga2.nextLine();

		batas = kalimat.length();

		for (int baris = nol; baris < maxBatas; baris++ ) { // baris kebawah
			
			for (int bintang = baris; bintang < batas; bintang++ ) { // baris kesamping atau spasi
				System.out.print(" ");
			}

			for (int bintang2 = nol; bintang2 <= baris; bintang2++ ) { // pengulangan kalimat kedalam segitiga
				if ( lengthKalimat < kalimat.length() ) {
					System.out.print(kalimat.charAt(lengthKalimat));
					System.out.print(" ");
					lengthKalimat++;	
				}
				
			}
			System.out.println();
		}

	}
}