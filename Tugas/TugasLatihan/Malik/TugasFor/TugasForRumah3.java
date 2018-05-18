/*
created by 	: Malik Chaudhary
time 		: 16-05-2018 8:04PM
soal :

buatlah gambar seperti di bawah ini menggunakan looping dan if statement
     *
    * *
   *   * 
  *     *
 *       *
  *     * 
   *   *
    * *
     *
*/

import java.util.Scanner;
public class TugasForRumah3{
	public static void main(String[] args){
		Scanner belah = new Scanner(System.in);

		int batas, nol = 0, satu = 1, dua = 2;

		System.out.print("Masukan batas segitiga : ");
		batas = belah.nextInt();

		for (int angka1=nol; angka1<batas/dua+satu; angka1++ ) {
			for (int angka2=nol; angka2<batas/dua-angka1; angka2++ ) {
				System.out.print("-");
			}
			for (int angka2=nol; angka2<dua*angka1+satu; angka2++ ) {
				if ( angka1==nol || angka2==nol || angka2==dua*angka1 ) 
					System.out.print("*");
				else
					System.out.print("-"); 
			}
			System.out.println();
		}

		for (int angka1=batas/dua-satu; angka1>=nol; angka1-- ) {
			for (int angka2=nol; angka2<batas/dua-angka1; angka2++ ) {
				System.out.print("-");
			}
			for (int angka2=nol; angka2<dua*angka1+satu; angka2++ ) {
				if ( angka1==batas/dua || angka2==nol || angka2==dua*angka1 ) 
					System.out.print("*");
				else
				System.out.print("-");		
				
			}
			System.out.println();
		}

	}
}