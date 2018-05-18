/*
created by 	: Malik Chaudhary
time 		: 16-05-2018 6:23PM
soal :

Buatlah program untuk menampilkan bilangan prima hingga batas yg ditentukan. Contoh :
Batas : 20
2 3 5 7 11 13 17 19
*/

import java.util.Scanner;
public class TugasForRumah1{
	public static void main(String[] args){
		Scanner prima = new Scanner(System.in);

		int batas, angka1, angka2, nol = 0, satu = 1, dua = 2;
		

		System.out.print("Masukan batas : ");
		batas = prima.nextInt();

		for (angka1 = satu; angka1 <= batas ; angka1++ ) {
				
				int hitungan=nol;
				for (angka2 = angka1; angka2 >= satu ; angka2 -= satu ) {
					if ( angka1%angka2 == nol ) {
						hitungan = hitungan + satu;
					}
				}
				if ( hitungan == dua ) {
					System.out.print(angka1+", ");
				}
		}

	}
}