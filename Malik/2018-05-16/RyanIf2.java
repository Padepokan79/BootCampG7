/*
created by 	: Malik Chaudhary
time 		: 15-05-2018 3:13PM
update		: 15-05-2018 8:42PM

Soal :
Ana mempunyai 2 rumah yang akan dijadikan tempat kos dengan rincian harga dan rumah
	R1 = 650rb/kamar, ada 4 kamar, maks perkamar 3 orang
	R2 = 350rb/kamar, ada 7 kamar, maks perkamar 2 orang

buatlah algoritma yang dapat menentukan ke kosan mana orang harus ngekos dengan harga minimum  

*/

import java.util.Scanner;
public class RyanIf2{
	public static void main(String[] args){
		Scanner kos = new Scanner(System.in);
		int orang;

		double hargaKamarR1, hargaKamarR2;
		int maksKamarR1, maksKamarR2, maksOrangKamar1, maksOrangKamar2,lima, enam, tujuh, delapan, sembilan, duaLas, patLas, juhLas, duaLuh, duaTiga, duaEnam;

		hargaKamarR1 	= 650000;
		hargaKamarR2 	= 350000;
		maksKamarR1 	= 4;
		maksKamarR2 	= 7;
		maksOrangKamar1 = 3;
		maksOrangKamar2 = 2;
		lima 			= 5;
		enam			= 6;
		delapan			= 8;
		sembilan		= 9;
		duaLas			= 12;
		patLas			= 14;
		juhLas			= 17;
		duaLuh			= 20;
		duaTiga			= 23;
		duaEnam			= 26;			


		System.out.print(" Masukan jumlah orang : ");
		orang = kos.nextInt();

		if ( orang <= maksOrangKamar2 ) {
			System.out.print("R2 dengan 1 kamar harga Rp. 350.000");
		}else if ( orang == maksOrangKamar1 ) {
			System.out.print("R1 dengan 1 kamar harga Rp. 650.000");
		}else if ( orang == maksKamarR1 ) {
			System.out.print("R2 dengan 2 kamar harga Rp. 700.000");
		}else if ( orang == lima ) {
			System.out.print("R1 dan R2 dengan 1 kamar harga Rp. 1000.000");
		}else if ( orang == enam ) {
			System.out.print("R2 dengan 3 kamar harga Rp. 105.000");
		}else if ( orang <= delapan ) {
			System.out.print("R2 dengan 4 kamar dengan harga Rp. 1.400.000");
		}else if ( orang == sembilan ) {
			System.out.print("R1 dengan 3 kamar harga Rp. 1.950.000");
		}else if ( orang <= duaLas ) {
			System.out.print("R2 dengan 6 kamar harga Rp. 2.100.000");
		}else if ( orang <= patLas ) {
			System.out.print("R2 dengan 7 kamar harga Rp. 2.450.000");
		}else if ( orang <= juhLas ) {
			System.out.print("R2 dan R1 dengan 7 kamar dan 1 kamar harga Rp. 3.100.000");
		}else if ( orang <= duaLuh ) {
			System.out.print("R2 dan R1 dengan 7 kamar dan 2 kamar harga Rp. 3.750.000");
		}else if ( orang <= duaTiga ) {
			System.out.print("R2 dan R1 dengan 7 kamar dan 3 kamar harga Rp. 4.100.000");
		}else if ( orang <= duaEnam ) {
			System.out.print("R2 dan R1 dengan 7 kamar dan 4 kamar harga Rp. 4.750.000");
		}else{
			System.out.print("Jumlah orang melebihi maksimum");
		}


	}
}