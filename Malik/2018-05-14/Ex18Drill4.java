/*
created by : Malik Chaudhary
time : 14-05-2018 10:29AM
soal: 

IKAN Travel 6b

Bis Dengan Kursi 60
Bis Dengan Kursi 45
Bis Dengan Kursi 32
Bis Dengan Kursi 18
Bis Dengan Kursi 12
Bis Dengan Kursi 6 Executive

Masukan Jumlah Penumpang: 31
Bis yang tersedia:

Bis Dengan Kursi 18
Bis Dengan Kursi 12
Bis Dengan Kursi 6 Executive

*/

import java.util.Scanner;
public class Ex18Drill4{
	public static void main(String[] args){
		Scanner bis = new Scanner(System.in);
		int penumpang;

		System.out.print("Masukan jumlah penumpang : ");
		penumpang = bis.nextInt();

		if ( penumpang >= 60 ) {
			System.out.println("Bis Dengan Kursi 60");
		}
		if ( penumpang >= 45 ) {
			System.out.println("Bis Dengan Kursi 45");
		}
		if ( penumpang >= 32 ) {
			System.out.println("Bis Dengan Kursi 32");
		}
		if ( penumpang >= 18 ) {
			System.out.println("Bis Dengan Kursi 18");
		}
		if ( penumpang >= 12 ) {
			System.out.println("Bis Dengan Kursi 12");
		}
		if ( penumpang >= 6 || penumpang < 6) {
			System.out.println("Bis Dengan Kursi 6 Executive");
		}
	}
}