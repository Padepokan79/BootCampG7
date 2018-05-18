/*
created by 	: Malik Chaudhary
time 		: 15-05-2018 8:33AM
update		: 15-05-2018 8:21PM

Soal :
Buatlah program untuk mencari jenis sebuah bilangan
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

import java.util.Scanner;
public class AlifharIf1{
	public static void main(String[] args){
		Scanner bilangan = new Scanner(System.in);

		double bilRil, angka;
		int bilBulat, satu, dua, nol;

		satu = 1;
		dua  = 2;
		nol  = 0;

		System.out.println("=======================");
		System.out.print("Masukan bilangan :");
		angka = bilangan.nextDouble();

		System.out.println("=======================");
		System.out.println("Bilangan tersebut adalah");
		if ( ( angka % dua ) == nol ) {
			if ( angka > nol ) {
				System.out.print("Bilangan bulat genap positif");
			}else{
				System.out.print("Bilangan bulat genap negatif");
			}
			
		}else if(  ( angka % dua ) < nol  ){
			if ( angka > nol ) {
				System.out.print("Bilangan bulat ganjil positif");
			}else{
				System.out.print("Bilangan bulat ganjil negatif");
			}
		}else if ( ( ( angka % dua ) != nol ) && ( ( angka % dua ) != satu ) && ( ( angka % dua ) != dua ) ) {
			if ( angka % dua == nol ) {
				if ( angka > nol ) {
					System.out.print("Bilangan rill genap positif");
				}else{
					System.out.print("Bilangan rill genap negatif");
				}
			}else{
				if ( angka > nol ) {
					System.out.print("Bilangan rill ganjil positif");
				}else{
					System.out.print("Bilangan rill ganjil negatif");
				}
			}
		}
	}
}
